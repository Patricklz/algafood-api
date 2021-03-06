package com.algaworks.algafood.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;

import org.hibernate.annotations.CreationTimestamp;

import com.algaworks.algafood.domain.exception.NegocioException;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class Pedido {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codigo;
	
	@JoinColumn(nullable = false)
	private BigDecimal subtotal;
	
	@JoinColumn(nullable = false)
	private BigDecimal taxaFrete;
	
	@JoinColumn(nullable = false)
	private BigDecimal valorTotal;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status = StatusPedido.CRIADO;;
	
	@CreationTimestamp
	@JoinColumn(nullable = false)
	private OffsetDateTime dataCriacao;
	
	private OffsetDateTime dataConfirmacao;
	
	private OffsetDateTime dataCancelamento;
	
	private OffsetDateTime dataEntrega;
	

	
	@Embedded
	@JoinColumn(name = "endereco_cidade_id", nullable = false)
	private Endereco enderecoEntrega;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "forma_pagamento_id", nullable = false)
	private FormaPagamento formaPagamento;
	
    @ManyToOne
    @JoinColumn(name = "restaurante_id", nullable = false)
    private Restaurante restaurante;
    
    @ManyToOne
    @JoinColumn(name = "usuario_cliente_id", nullable = false)
    private Usuario cliente;
    
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens = new ArrayList<>();
    
    public void calcularValorTotal() {
    	getItens().forEach(ItemPedido::calcularPrecoTotal);
        
        this.subtotal = getItens().stream()
            .map(item -> item.getPrecoTotal())
            .reduce(BigDecimal.ZERO, BigDecimal::add);
        
        this.valorTotal = this.subtotal.add(this.taxaFrete);
    }
    
    public void confirmar() {
    	setStatus(StatusPedido.CONFIRMADO);
    	setDataConfirmacao(OffsetDateTime.now());
    }
    
    public void entregar() {
    	setStatus(StatusPedido.ENTREGUE);
    	setDataEntrega(OffsetDateTime.now());
    }
    
    public void cancelar() {
    	setStatus(StatusPedido.CANCELADO);
    	setDataCancelamento(OffsetDateTime.now());
    }
    
    public void setStatus(StatusPedido novoStatus) {
    	if(getStatus().naoPodeAlterarPara(novoStatus)) {
    		throw new NegocioException(String.format("Status do pedido %s não pode ser alterado de %s para %s", getCodigo(), getStatus().getDecricao(), novoStatus.getDecricao()));
    	}
    	
    	this.status = novoStatus;
    }
    
    @PrePersist
    private void gerarCodigo() {
    	setCodigo(UUID.randomUUID().toString());
    }


}
