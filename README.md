# algafood

Curso ESR - Especialista em Spring Rest da AlgaWorks : https://www.algaworks.com/

Conteúdo prográmatico completo:

https://cafe.algaworks.com/wp-content/uploads/2021/05/ESR-Apresenta%C3%A7%C3%A3o-do-conte%C3%BAdo4.pdf


Conteúdo programático
1. Introdução
1.1. Introdução ao treinamento
1.2. Como usar o suporte da AlgaWorks
1.3. Por que desenvolver REST APIs?
1.4. Conhecendo o modelo de domínio do projeto do curso
1.5. Preparando o ambiente de desenvolvimento: JDK e STS for Eclipse
2. Spring e Injeção de Dependências
2.1. Por que aprender e usar Spring?
2.2. Conhecendo o ecossistema Spring
2.3. Spring vs Jakarta EE (Java EE)
2.4. Conhecendo o Spring Boot
2.5. Criando um projeto Spring Boot com Spring Initialize
2.6. Conhecendo o Maven e o pom.xml de um projeto Spring Boot
2.7. Criando um controller com Spring MVC
2.8. Restart mais rápido da aplicação com DevTools
2.9. O que é injeção de dependências?
2.10. Conhecendo o IoC Container do Spring
2.11. Definindo beans com @Component
2.12. Injetando dependências (beans Spring)
2.13. Usando @Configuration e @Bean para definir beans
2.14. Conhecendo os pontos de injeção e a anotação @Autowired
2.15. Dependência opcional com @Autowired
2.16. Ambiguidade de beans e injeção de lista de beans
2.17. Desambiguação de beans com @Primary
2.18. Desambiguação de beans com @Qualifier
2.19. Desambiguação de beans com anotação customizada
2.20. Mudando o comportamento da aplicação com Spring Profiles
2.21. Criando métodos de callback do ciclo de vida dos beans
2.22. Publicando e consumindo eventos customizados
2.23. Configurando projetos Spring Boot com o application.properties
2.24. Substituindo propriedades via linha de comando e variáveis de ambiente
2.25. Criando e acessando propriedades customizadas com @Value
2.26. Acessando propriedades com @ConfigurationProperties
2.27. Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles)
2.28. Ativando o Spring Profile por linha de comando e variável de ambiente
3. Introdução ao JPA e Hibernate
3.1. Instalando o MySQL Server e MySQL Workbench
3.2. O que é JPA e Hibernate?
3.3. Adicionando JPA e configurando o Data Source
3.4. Mapeando entidades com JPA
3.5. Criando as tabelas do banco a partir das entidades
3.6. Mapeando o id da entidade para autoincremento
3.7. Importando dados de teste com import.sql
3.8. Consultando objetos do banco de dados
3.9. Adicionando um objeto no banco de dados
3.10. Buscando um objeto pelo id no banco de dados
3.11. Atualizando um objeto no banco de dados
3.12. Excluindo um objeto do banco de dados
3.13. Conhecendo o padrão Aggregate do DDD
3.14. Conhecendo e implementando o padrão Repository
3.15. Conhecendo e usando o Lombok
3.16. Desafio: Lombok e repositório de restaurantes
3.17. Mapeando relacionamento com @ManyToOne
3.18. A anotação @JoinColumn
3.19. Propriedade nullable de @Column e @JoinColumn
3.20. Desafio: mapeando entidades
4. REST com Spring
4.1. O que é REST?
4.2. Conhecendo as constraints do REST
4.3. Diferença entre REST e RESTful
4.4. Desenvolvedores de REST APIs puristas e pragmáticos
4.5. Conhecendo o protocolo HTTP
4.6. Usando o protocolo HTTP
4.7. Instalando e testando o Postman
4.8. Entendendo o que são Recursos REST
4.9. Identificando recursos REST
4.10. Modelando e requisitando um Collection Resource com GET
4.11. Desafio: collection resource de estados
4.12. Representações de recursos e content negotiation
4.13. Implementando content negotiation para retornar JSON ou XML
4.14. Consultando Singleton Resource com GET e @PathVariable
4.15. Customizando as representações XML e JSON com @JsonIgnore, @JsonProperty e @JsonRootName
4.16. Customizando a representação em XML com Wrapper e anotações do Jackson
4.17. Conhecendo os métodos HTTP
4.18. Conhecendo os códigos de status HTTP
4.19. Definindo o status da resposta HTTP com @ResponseStatus
4.20. Manipulando a resposta HTTP com ResponseEntity
4.21. Corrigindo o Status HTTP para resource inexistente
4.22. Status HTTP para collection resource vazia: qual usar?
4.23. Modelando e implementando a inclusão de recursos com POST
4.24. Negociando o media type do payload do POST com Content-Type
4.25. Modelando e implementando a atualização de recursos com PUT
4.26. Modelando e implementando a exclusão de recursos com DELETE
4.27. Implementando a camada de domain services (e a importância da linguagem ubíqua)
4.28. Refatorando a exclusão de cozinhas para usar domain services
4.29. Desafio: modelando e implementando a consulta de recursos de restaurantes
4.30. Modelando e implementando a inclusão de recursos de restaurantes
4.31. Desafio: Modelando e implementando a atualização de recursos de restaurantes
4.32. Desafio: implementando serviços REST de cidades e estados
4.33. Analisando solução para atualização parcial de recursos com PATCH
4.34. Finalizando a atualização parcial com a API de Reflections do Spring
4.35. Introdução ao Modelo de Maturidade de Richardson (RMM)
4.36. Conhecendo o nível 0 do RMM
4.37. Conhecendo o nível 1 do RMM
4.38. Conhecendo o nível 2 do RMM
4.39. Conhecendo o nível 3 do RMM
5. Super poderes do Spring Data JPA
5.1. Implementando consultas JPQL em repositórios
5.2. Conhecendo o projeto Spring Data JPA (SDJ)
5.3. Criando um repositório com Spring Data JPA (SDJ)
5.4. Refatorando o código do projeto para usar o repositório do SDJ
5.5. Desafio: refatorando todos os repositórios para usar SDJ
5.6. Criando consultas com query methods
5.7. Usando as keywords para definir critérios de query methods
5.8. Conhecendo os prefixos de query methods
5.9. Usando queries JPQL customizadas com @Query
5.10. Externalizando consultas JPQL para um arquivo XML
5.11. Implementando um repositório SDJ customizado
5.12. Implementando uma consulta dinâmica com JPQL
5.13. Implementando uma consulta simples com Criteria API
5.14. Adicionando restrições na cláusula where com Criteria API
5.15. Tornando a consulta com Criteria API com filtros dinâmicos
5.16. Conhecendo o uso do padrão Specifications (DDD) com SDJ
5.17. Implementando Specifications com SDJ
5.18. Criando uma fábrica de Specifications
5.19. Injetando o próprio repositório na implementação customizada e a anotação @Lazy
5.20. Estendendo o JpaRepository para customizar o repositório base
6. Explorando mais do JPA e Hibernate
6.1. Mapeando relacionamento bidirecional com @OneToMany
6.2. Mapeando relacionamento muitos-para-muitos com @ManyToMany
6.3. Analisando o impacto do relacionamento muitos-para-muitos na REST API
6.4. Mapeando classes incorporáveis com @Embedded e @Embeddable
6.5. Testando e analisando o impacto da incorporação de classe na REST API
6.6. Mapeando propriedades com @CreationTimestamp e @UpdateTimestamp
6.7. Desafio: mapeando relacionamento muitos-para-um
6.8. Desafio: mapeando relacionamento um-para-muitos
6.9. Desafio: mapeando relacionamentos muitos-para-muitos
6.10. Entendendo o Eager Loading
6.11. Entendendo o Lazy Loading
6.12. Alterando a estratégia de fetching para Lazy Loading
6.13. Alterando a estratégia de fetching para Eager Loading
6.14. Resolvendo o Problema do N+1 com fetch join na JPQL
7. Pool de conexões e Flyway
7.1. Entendendo o funcionamento de um pool de conexões
7.2. Conhecendo o Hikari: a solução padrão de pool de conexões no Spring Boot
7.3. Configurando o pool de conexões do Hikari
7.4. Schema generation em produção não é uma boa prática
7.5. Flyway: ferramenta de versionamento de schemas de banco de dados
7.6. Adicionando o Flyway no projeto e criando a primeira migração
7.7. Evoluindo o banco de dados com novas migrações
7.8. Criando migrações complexas com remanejamento de dados
7.9. Criando migração a partir de DDL gerado por schema generation
7.10. Adicionando dados de testes com callback do Flyway
7.11. Reparando migrações com erros
7.12. Desafio: Criando migrações e mapeando as entidades Pedido e ItemPedido
8. Tratamento e modelagem de erros da API
8.1. Introdução ao tratamento e modelagem de erros
8.2. Lançando exceções customizadas anotadas com @ResponseStatus
8.3. Lançando exceções do tipo ResponseStatusException
8.4. Estendendo ResponseStatusException
8.5. Simplificando o código com o uso de @ResponseStatus em exceptions
8.6. Desafio: refatorando os serviços REST
8.7. Analisando os impactos da refatoração
8.8. Criando a exception NegocioException
8.9. Desafio: usando a exception NegocioException
8.10. Afinando a granularidade e definindo a hierarquia das exceptions de negócios
8.11. Desafio: lançando exceptions de granularidade fina
8.12. Tratando exceções em nível de controlador com @ExceptionHandler
8.13. Tratando exceções globais com @ExceptionHandler e @ControllerAdvice
8.14. Desafio: implementando exception handler
8.15. Criando um exception handler global com ResponseEntityExceptionHandler
8.16. Customizando o corpo da resposta padrão de ResponseEntityExceptionHandler
8.17. Conhecendo a RFC 7807 (Problem Details for HTTP APIs)
8.18. Padronizando o formato de problemas no corpo de respostas com a RFC 7807
8.19. Desafio: usando o formato de problemas no corpo de respostas
8.20. Customizando exception handlers de ResponseEntityExceptionHandler
8.21. Tratando a exception InvalidFormatException na desserialização
8.22. Habilitando erros na desserialização de propriedades inexistentes ou ignoradas
8.23. Desafio - tratando PropertyBindingException na desserialização
8.24. Lançando exception de desserialização na atualização parcial (PATCH)
8.25. Desafio: tratando exception de parâmetro de URL inválido
8.26. Desafio: tratando a exceção NoHandlerFoundException
8.27. Desafio: tratando outras exceções não capturadas
8.28. Estendendo o formato do problema para adicionar novas propriedades
8.29. Desafio: estendendo o formato do problema
9. Validações com Bean Validation
9.1. Validação do modelo com Bean Validation
9.2. Adicionando constraints e validando no controller com @Valid
9.3. Desafio: tratando exception de violação de constraints de validação
9.4. Estendendo o Problem Details para adicionar as propriedades com constraints violadas
9.5. Conhecendo e adicionando mais constraints de validação no modelo
9.6. Validando as associações de uma entidade em cascata
9.7. Agrupando e restringindo constraints que devem ser usadas na validação
9.8. Convertendo grupos de constraints para validação em cascata com @ConvertGroup
9.9. Desafio: adicionando constraints de validação no modelo
9.10. Customizando mensagens de validação na anotação da constraint
9.11. Customizando e resolvendo mensagens de validação globais em Resource Bundle
9.12. Desafio: customizando mensagens de validação
9.13. Resolvendo mensagens de validação com Resource Bundle do Bean Validation
9.14. Usando o Resource Bundle do Spring como Resource Bundle do Bean Validation
9.15. Criando constraints de validação customizadas usando composição
9.16. Criando constraints de validação customizadas com implementação de ConstraintValidator
9.17. Criando constraints de validação customizadas em nível de classe
9.18. Ajustando Exception Handler para adicionar mensagens de validação em nível de classe
9.19. Executando processo de validação programaticamente
9.20. Desafio: tratando a exception customizada de validações programáticas
10. Testes de integração
10.1. Introdução aos Testes de Integração e Testes de APIs
10.2. Preparando o projeto para testes de integração
10.3. Criando e rodando um teste de integração com Spring Boot, JUnit e AssertJ
10.4. Escrevendo bons nomes de testes
10.5. Desafio: escrevendo testes de integração
10.6. Rodando os testes pelo Maven
10.7. Configurando Maven Failsafe Plugin no projeto
10.8. Implementando Testes de API com REST Assured e validando o código de status HTTP
10.9. Validando o corpo da resposta HTTP
10.10. Criando um método para fazer setup dos testes
10.11. Entendendo o problema da ordem de execução dos testes
10.12. Voltando o estado inicial do banco de dados para cada execução de teste com callback do Flyway
10.13. Configurando um banco de testes e usando @TestPropertySource
10.14. Limpando e populando o banco de dados de teste
10.15. Testando endpoint passando parâmetro de URL
10.16. Desafio: refatorando o código de testes
10.17. Desafio: escrevendo testes de API
11. Boas práticas e técnicas para APIs
11.1. Analisando e definindo melhor o escopo das transações
11.2. Refinando o payload de cadastro com @JsonIgnoreProperties
11.3. Criando classes de mixin para usar as anotações do Jackson
11.4. Desafio: usando @JsonIgnoreProperties e Jackson Mixin
11.5. Antes de estudar sobre data/hora: relembrando as aulas de geografia e entendendo os fusos horários
11.6. Boas práticas para trabalhar com data e hora em REST APIs
11.7. Configurando e refatorando o projeto para usar UTC
11.8. Desafio - refatorando o código para usar OffsetDateTime
11.9. Isolando o Domain Model do Representation Model com o padrão DTO
11.10. Implementando a conversão de entidade para DTO
11.11. Criando DTOs para entrada de dados na API
11.12. Refatorando e criando um assembler de DTO
11.13. Desafio: Refatorando e criando um disassembler do DTO
11.14. Adicionando e usando o ModelMapper
11.15. Entendendo a estratégia padrão do ModelMapper para correspondência de propriedades
11.16. Customizando o mapeamento de propriedades com ModelMapper
11.17. Mapeando para uma instância destino (e não um tipo) com ModelMapper
11.18. Revisando e ajustando as mensagens de validação com o uso de DTOs
11.19. Estratégias de nomes de propriedades - snake case vs lower camel case
11.20. Desafio: usando DTOs como representation model
11.21. Corrigindo bug de tratamento de exception de integridade de dados com flush do JPA
12. Modelagem avançada e implementação da API
12.1. Modelando sub-recursos para relacionamentos
12.2. Granularidade de recursos: Chatty vs Chunky APIs
12.3. Modelando conceitos abstratos de negócio e ações não-CRUD como recursos
12.4. Implementando os endpoints de ativação e inativação de restaurantes
12.5. Desafio: implementando os endpoints de formas de pagamento
12.6. Adicionando endereço no modelo da representação do recurso de restaurante
12.7. Refatorando serviço de cadastro de restaurante para incluir endereço
12.8. Desafio: implementando os endpoints de grupos
12.9. Desafio: implementando os endpoints de usuarios
12.10. Um pouco mais sobre JPA: objeto alterado fora da transação é sincronizado com o banco de dados
12.11. Implementando regra de negócio para evitar usuários com e-mails duplicados
12.12. Implementando os endpoints de associação de formas de pagamento em restaurantes
12.13. Desafio: implementando os endpoints de produtos
12.14. Desafio: Implementando os endpoints de abertura e fechamento de restaurantes
12.15. Desafio: implementando os endpoints de associação de grupos com permissões
12.16. Desafio: implementando os endpoints de associação de usuários com grupos
12.17. Desafio: implementando endpoints de associação de usuários responsáveis com restaurantes
12.18. Implementando ativação e inativação em massa de restaurantes
12.19. Desafio: Implementando os endpoints de consulta de pedidos
12.20. Otimizando a query de pedidos e retornando model resumido na listagem
12.21. Desafio: Implementando o endpoint de emissão de pedidos
12.22. Implementando endpoint de transição de status de pedidos
12.23. Desafio: implementando endpoints de transição de status de pedidos
12.24. Refatorando o código de regras para transição de status de pedidos
12.25. Usando IDs vs UUIDs nas URIs de recursos
13. Modelagem de projeções, pesquisas e relatórios
13.1. Fazendo projeção de recursos com @JsonView do Jackson
13.2. Limitando os campos retornados pela API com @JsonFilter do Jackson
13.3. Limitando os campos retornados pela API com Squiggly
13.4. Implementando pesquisas simples na API
13.5. Modelando pesquisas complexas na API
13.6. Implementando pesquisas complexas na API
13.7. Tratando BindException ao enviar parâmetros de URL inválidos
13.8. Implementando paginação e ordenação em recursos de coleção da API
13.9. Desafio: implementando paginação e ordenação de pedidos
13.10. Implementando JsonSerializer para customizar representação de paginação
13.11. Implementando um conversor de propriedades de ordenação
13.12. Modelando endpoints de consultas com dados agregados (ideal para gráficos e dashboards)
13.13. Discutindo sobre onde implementar as consultas com dados agregados
13.14. Implementando consulta com dados agregados de vendas diárias
13.15. Desafio: adicionando os filtros na consulta de vendas diárias
13.16. Tratando time offset na agregação de vendas diárias por data
13.17. Conhecendo o JasperSoft Studio
13.18. Criando um layout do relatório JasperReports de vendas diárias
13.19. Estruturando endpoint e serviço de emissão de relatório em PDF
13.20. Preenchendo um relatório JasperReports com JavaBeans e gerando bytes do PDF
14. Upload e download de arquivos
14.1. Conhecendo soluções para upload de arquivos em REST APIs
14.2. Implementando upload de arquivo com multipart/form-data
14.3. Validando o tamanho máximo do arquivo
14.4. Desafio: Validando o content type do arquivo
14.5. Mapeando entidade FotoProduto e relacionamento um-para-um
14.6. Implementando serviço de cadastro de foto de produto
14.7. Excluindo e substituindo cadastro de foto de produto
14.8. Implementando o serviço de armazenagem de fotos no disco local
14.9. Integrando o serviço de catálogo de fotos com o serviço de armazenagem
14.10. Implementando a remoção e substituição de arquivos de fotos no serviço de armazenagem
14.11. Desafio: Implementando recuperação de foto no serviço de armazenagem
14.12. Desafio: Implementando endpoint de consulta de foto de produto
14.13. Servindo arquivos de fotos pela API
14.14. Checando media type ao servir arquivos de fotos
14.15. Desafio: implementando endpoint de exclusão de foto de produto
14.16. Corrigindo exception handler de media type não aceita
14.17. Amazon S3: conhecendo o serviço de storage da AWS
14.18. Criando usuário com permissões para adicionar objetos na Amazon S3
14.19. Criando chaves de acesso para a API da AWS
14.20. Criando bean de propriedades de configuração dos serviços de storage
14.21. Adicionando o SDK Java da Amazon S3 no projeto e criando a classe da implementação do serviço de storage
14.22. Definindo bean do client da Amazon S3 e configurando credenciais
14.23. Implementando a inclusão de objetos no bucket da Amazon S3
14.24. Desafio: Implementando a exclusão de objetos do bucket da Amazon S3
14.25. Implementando a recuperação de foto no serviço de storage do S3
14.26. Selecionando a implementação do serviço de storage de fotos
15. E-mails transacionais e Domain Events
15.1. Conhecendo soluções para envio de e-mails transacionais
15.2. Configurando o projeto para envio de e-mails usando servidor SMTP
15.3. Implementando o serviço de infraestrutura de envio de e-mails com Spring
15.4. Usando o serviço de envio de e-mails na confirmação de pedidos
15.5. Processando template do corpo de e-mails com Apache FreeMarker
15.6. Melhorando o texto do e-mail com FTL (FreeMarker Template Language)
15.7. Formatando valores monetários com FTL
15.8. Desafio: implementando serviço de envio de e-mail fake
15.9. Desafio: Implementando serviço de envio de e-mail sandbox
15.10. Conhecendo o padrão Domain Events do DDD
15.11. Publicando Domain Events a partir do Aggregate Root
15.12. Observando e reagindo a Domain Events
15.13. Reagindo a Domain Events em fases específicas da transação
15.14. Desafio: enviando e-mails no cancelamento de pedidos
16. CORS e consumo da API com JavaScript e Java
16.1. Implementando uma chamada na REST API com JavaScript
16.2. Testando a requisição na API com JavaScript e entendendo a Same Origin Policy
16.3. Entendendo o funcionamento básico de CORS e habilitando na API
16.4. Habilitando CORS em controladores e métodos com @CrossOrigin
16.5. Entendendo o funcionamento de preflight do CORS
16.6. Habilitando CORS globalmente no projeto da API
16.7. Desafio: implementando uma requisição GET com JavaScript
16.8. Implementando um formulário de cadastro e fazendo requisição POST com JavaScript
16.9. Desafio: implementando uma requisição DELETE com JavaScript
16.10. Implementando um client da REST API com Java e Spring (RestTemplate)
16.11. Tratando respostas com código de erro no client Java
16.12. Desafio: Implementando uma requisição POST no client Java
17. Cache de HTTP
17.1. Introdução ao Cache de HTTP
17.2. Habilitando o cache com o cabeçalho Cache-Control e a diretiva max-age
17.3. Desafio: adicionando o cabeçalho Cache-Control na resposta
17.4. Entendendo a validação de representações em cache com ETags
17.5. Implementando requisições condicionais com Shallow ETags
17.6. Adicionando outras diretivas de Cache-Control na resposta HTTP
17.7. Usando a diretiva no-cache no cabeçalho Cache-Control da requisição
17.8. Entendendo e preparando a implementação de Deep ETags
17.9. Implementando requisições condicionais com Deep ETags
17.10. Desafio: implementando requisições condicionais com Deep ETags
18. Documentação da API com OpenAPI, Swagger UI e SpringFox
18.1. Introdução à documentação de REST APIs
18.2. Conhecendo a OpenAPI (antes conhecida como Swagger)
18.3. Gerando a definição OpenAPI em JSON com SpringFox
18.4. Gerando a documentação da API em HTML com Swagger UI e SpringFox
18.5. Selecionando os endpoints da API para gerar a documentação
18.6. Descrevendo informações da API na documentação
18.7. Descrevendo tags na documentação e associando com controllers
18.8. Descrevendo as operações de endpoints na documentação
18.9. Descrevendo parâmetros de entrada na documentação
18.10. Descrevendo modelos de representações e suas propriedades
18.11. Descrevendo restrições de validação de propriedades do modelo
18.12. Descrevendo códigos de status de respostas de forma global
18.13. Desafio: descrevendo códigos de status de respostas de forma global
18.14. Descrevendo o modelo de representação de problema
18.15. Referenciando modelo de representação de problema com códigos de status de erro
18.16. Descrevendo códigos de status de respostas em endpoints específicos
18.17. Desacoplando anotações do Swagger dos controladores
18.18. Desafio: descrevendo documentação de endpoints de grupos
18.19. Descrevendo media type da resposta nos endpoints
18.20. Corrigindo documentação com substituição de Pageable
18.21. Corrigindo documentação com substituição Page
18.22. Desafio: descrevendo documentação de endpoints de cozinhas
18.23. Ignorando tipos de parâmetros de operações na documentação
18.24. Desafio: descrevendo documentação de endpoints de formas de pagamento
18.25. Descrevendo parâmetros globais em operações
18.26. Descrevendo parâmetros implícitos em operações
18.27. Desafio: descrevendo documentação de endpoints de pedidos
18.28. Descrevendo parâmetros de projeções em endpoints de consultas
18.29. Desafio: descrevendo documentação de endpoints de restaurantes
18.30. Desafio: descrevendo documentação de endpoints de estados
18.31. Desafio: descrevendo documentação de endpoints de fluxo de pedidos
18.32. Desafio: descrevendo documentação de endpoints de associação de restaurantes com formas de pagamento
18.33. Desafio: descrevendo documentação de endpoints de associação de restaurantes com usuários
18.34. Desafio: descrevendo documentação de endpoints de produtos
18.35. Desafio: descrevendo documentação de endpoints de fotos de produtos
18.36. Corrigindo documentação no Swagger UI para upload de arquivos
18.37. Desafio: descrevendo documentação de endpoints de associação de permissões com grupos
18.38. Desafio: descrevendo documentação de endpoints de usuários
18.39. Desafio: descrevendo documentação de endpoints de associação de grupos com usuários
18.40. Desafio: descrevendo documentação de endpoint de estatísticas
19. Discoverability e HATEOAS: A Glória do REST
19.1. Introdução à Discoverability e HATEOAS
19.2. Adicionando a URI do recurso criado no header da resposta
19.3. Adicionando o Spring HATEOAS no projeto
19.4. Atualizando o projeto para Spring Boot 2.2 (Spring HATEOAS 1.0)
19.5. Resolvendo conflito de dependências com Spring HATEOAS e SpringFox
19.6. Conhecendo especificações para formatos Hypermedia
19.7. Adicionando hypermedia na representação de recurso único com HAL
19.8. Construindo links dinâmicos com WebMvcLinkBuilder
19.9. Construindo links que apontam para métodos
19.10. Adicionando hypermedia na representação de recursos de coleção
19.11. Montando modelo de representação com RepresentationModelAssembler
19.12. Desafio: adicionando hypermedia nos recursos de usuários
19.13. Corrigindo link de coleção de recurso de responsáveis por restaurante
19.14. Desafio: adicionando hypermedia nos recursos de estados
19.15. Adicionando hypermedia em recursos com paginação
19.16. Desafio: adicionando hypermedia em recursos de pedidos (paginação)
19.17. Corrigindo links de paginação com ordenação
19.18. Adicionando links com template variables
19.19. Desafio: adicionando template variables do filtro de pedidos
19.20. Refatorando construção e inclusão de links em representation model
19.21. Desafio: refatorando construção e inclusão de links
19.22. Adicionando links de transições de status de pedidos
19.23. Adicionando links condicionalmente
19.24. Desafio: adicionando hypermedia nos recursos de restaurantes
19.25. Desafio: adicionando links condicionais no recurso de restaurante
19.26. Desafio: adicionando template variable de projeção de restaurantes
19.27. Desafio: adicionando hypermedia nos recursos de formas de pagamento
19.28. Adicionando links para desassociação de formas de pagamento com restaurante
19.29. Adicionando links com template variable de caminho para associação de formas de pagamento com restaurante
19.30. Desafio: adicionando links de associação de restaurantes com responsáveis
19.31. Desafio: adicionando hypermedia nos recursos de produtos
19.32. Desafio: adicionando links para recurso de foto de produto
19.33. Desafio: adicionando hypermedia nos recursos de grupos
19.34. Desafio: adicionando links de associação de grupos com permissões
19.35. Desafio: adicionando links de associação de usuários com grupos
19.36. Implementando o Root Entry Point da API
19.37. Desafio: implementando endpoint com links de recursos de estatísticas
19.38. Comprimindo as respostas HTTP com Gzip
19.39. Corrigindo as propriedades de links na documentação
19.40. Corrigindo a documentação dos endpoints de cidades
19.41. Corrigindo a paginação na documentação
19.42. Desafio: corrigindo a documentação dos endpoints de estados
19.43. Desafio: corrigindo a documentação dos endpoints de formas de pagamento
19.44. Desafio: corrigindo a documentação dos endpoints de grupos
19.45. Desafio: corrigindo a documentação dos endpoint de pedidos (paginação)
19.46. Desafio: corrigindo a documentação dos endpoints de produtos
19.47. Desafio: corrigindo a documentação dos endpoints de restaurantes e usuários
19.48. Removendo modelo de representação inutilizado da documentação
20. Evoluindo e versionando a API
20.1. Evoluindo a API com gestão de mudanças
20.2. Evitando quebrar os clientes: nova propriedade no modelo
20.3. Evitando quebrar os clientes: exclusão de propriedade do modelo
20.4. Evitando quebrar os clientes: alteração de tipo de propriedade do modelo
20.5. Evitando quebrar os clientes: alteração na estrutura de dados do modelo
20.6. Evitando quebrar os clientes: alteração de URL de recurso
20.7. O que é e quando versionar uma API?
20.8. As principais técnicas de versionamento de APIs
20.9. As principais abordagens para manter a base de código de APIs versionadas
20.10. Preparando o projeto para versionamento da API por Media Type
20.11. Implementando o versionamento da API por Media Type
20.12. Definindo a versão padrão da API quando o Media Type não é informado
20.13. Implementando o versionamento da API por URI
20.14. Desafio: Refatorando controladores para adicionar /v1 nas URIs
20.15. Desafio: adicionando os recursos de cozinhas na v2 da API
20.16. Gerando documentação das versões da API com SpringFox e Swagger UI
20.17. Desafio: revisando documentação da v2 da API
20.18. Depreciando uma versão da API
20.19. Desligando uma versão da API
21. Logging
21.1. Introdução ao Logback e SLF4J
21.2. Desafio: registrando logs de exceptions não tratadas
21.3. Criando uma conta no Loggly: serviço de gerenciamento de logs na nuvem
21.4. Configurando o appender do Loggly no Logback
21.5. Configurando o Logback para alternar as configurações por Spring Profiles
22. Segurança com Spring Security e OAuth2
22.1. Introdução à segurança de REST APIs
22.2. Adicionando segurança na API com Spring Security
22.3. Configurando Spring Security com HTTP Basic
22.4. Configurando autenticação de usuários em memória
22.5. Introdução ao OAuth2
22.6. Soluções para OAuth2: nova stack do Spring Security vs Spring Security OAuth
22.7. Conhecendo o fluxo Resource Owner Password Credentials
22.8. Criando o projeto do Authorization Server com Spring Security OAuth2
22.9. Configurando o fluxo Authorization Server com Password Credentials e Opaque Tokens
22.10. Configurando o endpoint de introspecção de tokens no Authorization Server
22.11. Configurando o Resource Server com a nova stack do Spring Security
22.12. Conhecendo o fluxo para emitir e usar Refresh Tokens
22.13. Configurando o Refresh Token Grant Type no Authorization Server
22.14. Configurando a validade e não reutilização de Refresh Tokens
22.15. Conhecendo o fluxo Client Credentials
22.16. Configurando o Client Credentials Grant Type no Authorization Server
22.17. Revisando o fluxo Authorization Code
22.18. Configurando o Authorization Code Grant Type
22.19. Testando o fluxo Authorization Code com um client JavaScript
22.20. Conhecendo o fluxo Implicit
22.21. Configurando o fluxo Implicit Grant Type
22.22. Mais segurança com PKCE e Authorization Code Grant
22.23. Implementando o suporte a PKCE com o fluxo Authorization Code
22.24. Testando o fluxo Authorization Code com PKCE com o método plain
22.25. Testando o fluxo Authorization Code com PKCE com o método SHA-256
22.26. Testando um client JavaScript com PKCE e Authorization Code
22.27. Decidindo qual fluxo OAuth2 usar
23. OAuth2 avançado com JWT e controle de acesso
23.1. Armazenando tokens no Redis: um banco de dados NoSQL
23.2. Configurando o RedisTokenStore
23.3. Entendendo a diferença entre Stateful e Stateless Authentication
23.4. Transparent Tokens: conhecendo o JSON Web Tokens (JWT)
23.5. Gerando JWT com chave simétrica (HMAC SHA-256) no Authorization Server
23.6. Configurando o Resource Server para JWT assinado com chave simétrica
23.7. Entendendo a diferença entre assinatura com chave simétrica e assimétrica
23.8. Gerando um par de chaves com keytool
23.9. Assinando o JWT com RSA SHA-256 (chave assimétrica)
23.10. Desafio: criando bean de propriedades de configuração do KeyStore
23.11. Extraindo a chave pública no formato PEM
23.12. Configurando a validação de JWT no Resource Server com a chave pública
23.13. Revisando o fluxo de aprovação do Authorization Code com JWT
23.14. Autenticando usuário com dados do banco de dados
23.15. Desafio: refatorando serviços de usuários para usar BCrypt
23.16. Adicionando claims customizadas no payload do JWT
23.17. Obtendo usuário autenticado no Resource Server
23.18. Definindo e criando as permissões de acesso
23.19. Carregando as permissões concedidas na autenticação
23.20. Carregando as Granted Authorities e restringindo acesso a endpoints na API
23.21. Method Security: Restringindo acesso com @PreAuthorize e SpEL
23.22. Desafio: tratando AccessDeniedException no ExceptionHandler
23.23. Simplificando o controle de acesso em métodos com meta-anotações
23.24. Entendendo os escopos do OAuth2
23.25. Carregando Granted Authorities dos escopos do OAuth2 no Resource Server
23.26. Restringindo acesso a endpoints por escopos do OAuth2
23.27. Desafio: restringindo acesso dos endpoints de restaurantes
23.28. Restringindo acessos de forma contextual (sensível à informação)
23.29. Restringindo acessos com @PostAuthorize
23.30. Desafio: restringindo acessos ao endpoint de pesquisa de pedidos
23.31. Desafio: restringindo acessos aos endpoints de transição de status de pedidos
23.32. Desafio: restringindo acessos aos endpoints de formas de pagamentos
23.33. Desafio: restringindo acessos aos endpoints de cidades e estados
23.34. Desafio: restringindo acessos aos endpoints de usuários, grupos e permissões
23.35. Desafio: restringindo acessos aos endpoints de estatísticas
23.36. Configurando os clientes OAuth2 em um banco de dados SQL
23.37. Cadastrando clientes OAuth2 no banco de dados e testando a emissão de tokens
23.38. Corrigindo lógica de restrição de acessos para Client Credentials Flow
23.39. Gerando links do HAL dinamicamente de acordo com permissões do usuário
23.40. Desafio: gerando links do HAL dinamicamente de acordo com permissões
23.41. Juntando o Resource Server com o Authorization Server no mesmo projeto
23.42. Ajustando a documentação da API para suporte a OAuth2
23.43. Customizando a página de login
23.44. Customizando a página de OAuth2 Approval
23.45. Implementando o endpoint do JSON Web Key Set (JWKS)
23.46. Externalizando o KeyStore: criando um ProtocolResolver para Base64
24. Dockerizando a aplicação
24.1. Conhecendo o Docker
24.2. Instalando o Docker
24.3. Executando um container
24.4. Gerenciando melhor os containers
24.5. Conhecendo a arquitetura do Docker
24.6. Entendendo o que são as imagens e o Docker Hub
24.7. Gerenciando imagens
24.8. Executando um container do MySQL
24.9. Construindo a imagem da aplicação com Dockerfile
24.10. Criando uma network e conectando dois containers
24.11. Construindo a imagem Docker pelo Maven
24.12. Disponibilizando a imagem da aplicação no Docker Hub
24.13. Conhecendo e usando Docker Compose
24.14. Controlando a ordem de inicialização com wait-for-it.sh
24.15. Escalando um serviço com Docker Compose
24.16. Entendendo o Poor Man's Load Balancer (DNS Round Robin)
24.17. Configurando um proxy reverso com Nginx
24.18. Configurando o Spring Session com Redis
24.19. Resolvendo problemas com storage de Authorization Codes
24.20. Configurando o Spring Session Data Redis
24.21. Resolvendo problemas com storage de Authorization Codes
25. Deploy em containers Docker na Amazon
25.1. Introdução ao deployment em produção
25.2. Mais organização das propriedades do projeto com Spring Profiles
25.3. Dependência de JavaMailSender não satisfeita: melhorando o uso da herança
25.4. Conhecendo a Amazon Web Services (AWS)
25.5. Entendendo alguns conceitos fundamentais da nuvem da AWS
25.6. Monitorando e criando um alerta de orçamento da AWS
25.7. Criando o bucket no Amazon S3
25.8. Criando uma instância do MySQL no Amazon RDS
25.9. Criando schema e usuário da aplicação
25.10. Conhecendo e criando uma conta no Redislabs
25.11. Criando uma instância do Redis na nuvem
25.12. Conhecendo o Amazon Elastic Container Service (ECS) e AWS Fargate
25.13. Publicando um container no Amazon ECS
25.14. Subindo a imagem Docker para o Amazon Elastic Container Registry (ECR)
25.15. Organizando as variáveis de ambiente do container da aplicação
25.16. Gerenciando as configurações com AWS Systems Manager Parameter Store
25.17. Configurando Amazon ECS para rodar nossa aplicação
25.18. Permitindo a leitura de parâmetros do Parameter Store pelo serviço do Amazon ECS
25.19. Permitindo o acesso ao MySQL pelo Security Group do serviço do Amazon ECS
25.20. Inserindo dados no banco de dados de produção
25.21. Conhecendo o Elastic Load Balancing da Amazon
25.22. Configurando e provisionando um Load Balancer na Amazon
25.23. Configurando o balanceamento de carga no serviço do Amazon ECS
25.24. Registrando um domínio de internet no Registro.br
25.25. Configurando o domínio para o Application Load Balancer
25.26. Configurando certificado TLS (HTTPS) com AWS Certificate Manager
25.27. Configurando o protocolo HTTPS nos links da API com HATEOAS
25.28. Testando a API em produção
25.29. Conclusão e próximos passos
