package com.algaworks.algafood.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.api.assembler.PedidoInputDisassembler;
import com.algaworks.algafood.api.assembler.PedidoModelAssembler;
import com.algaworks.algafood.api.assembler.PedidoResumoModelAssembler;
import com.algaworks.algafood.api.model.DTO.PedidoDTO;
import com.algaworks.algafood.api.model.DTO.PedidoResumoDTO;
import com.algaworks.algafood.api.model.input.PedidoDTOInput;
import com.algaworks.algafood.core.data.PageableTranslator;
import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.exception.NegocioException;
import com.algaworks.algafood.domain.filter.PedidoFilter;
import com.algaworks.algafood.domain.model.Pedido;
import com.algaworks.algafood.domain.model.Usuario;
import com.algaworks.algafood.domain.repository.PedidoRepository;
import com.algaworks.algafood.domain.service.EmissaoPedidoService;
import com.algaworks.algafood.infrastructure.repository.spec.PedidoSpecs;
import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private EmissaoPedidoService emissaoPedidoService;
	
	@Autowired
	private PedidoModelAssembler pedidoModelAssembler;
	
	@Autowired
	private PedidoResumoModelAssembler pedidoResumoModelAssembler;
	
	@Autowired
	private PedidoInputDisassembler pedidoInputDisassembler;
	
	
//	@GetMapping
//	public List<PedidoResumoDTO> listar() {
//		List<Pedido> todosPedidos = pedidoRepository.findAll();
//		
//		return pedidoResumoModelAssembler.toCollectDTO(todosPedidos);
//	}
	
	@GetMapping
	public Page<PedidoResumoDTO> pesquisar(@PageableDefault(size = 2) Pageable pageable, PedidoFilter filtro) {
		
		pageable = traduzirPegeable(pageable);
		
		Page<Pedido> pedidosPage = pedidoRepository.findAll(PedidoSpecs.usandoFiltro(filtro), pageable);		
		
		List<PedidoResumoDTO> pedidoresumoDTO = pedidoResumoModelAssembler.toCollectDTO(pedidosPage.getContent());
		
		Page<PedidoResumoDTO> pedidoresumoDTOPage = new PageImpl<>(pedidoresumoDTO, pageable, pedidosPage.getTotalElements());
		
		return pedidoresumoDTOPage;
	}
	
	@GetMapping("/{codigoPedido}")
	public PedidoDTO buscar(@PathVariable String codigoPedido) {
		Pedido pedido = emissaoPedidoService.buscarOuFalhar(codigoPedido);
		
		return pedidoModelAssembler.toDTO(pedido);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PedidoDTO adicionar(@Valid @RequestBody PedidoDTOInput pedidoDTOInput) {
	    try {
	        Pedido novoPedido = pedidoInputDisassembler.DTOToModel(pedidoDTOInput);

	        // TODO pegar usuário autenticado
	        novoPedido.setCliente(new Usuario());
	        novoPedido.getCliente().setId(1L);

	        novoPedido = emissaoPedidoService.emitir(novoPedido);

	        return pedidoModelAssembler.toDTO(novoPedido);
	    } catch (EntidadeNaoEncontradaException e) {
	        throw new NegocioException(e.getMessage(), e);
	    }
	}
	
	private Pageable traduzirPegeable(Pageable apiPageable) {
		var mapeamento = ImmutableMap.of(
				"codigo", "codigo",
				"restaurante.nome", "restaurante.nome",
				"cliente.nome", "cliente.nome",
				"valorTotal", "valorTotal"
				);
		
		
		
		return PageableTranslator.translate(apiPageable, mapeamento);
		
	}

}
