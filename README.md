# Fórum Hub - Alura Challenge

## Sobre o Projeto
O Fórum Hub é uma API RESTful desenvolvida como parte do Challenge de Back-End da Alura Oracle Next Education (ONE). O objetivo do projeto é criar o back-end de um fórum de discussão, permitindo que os usuários criem, leiam, atualizem e deletem tópicos, com um sistema de autenticação seguro. Este projeto aplica conceitos de desenvolvimento back-end com Java e Spring, incluindo: criação de API REST, validações, autenticação stateless via JWT, persistência de dados e documentação da API com Swagger (SpringDoc OpenAPI).

## Funcionalidades
- Autenticação segura com JWT  
- Controle de acesso por usuário autenticado  
- CRUD de tópicos (criar, listar, atualizar, excluir logicamente)  
- Validações para evitar duplicação de tópicos  
- Persistência de dados com Spring Data JPA  
- Documentação automática com Swagger UI  

## Tecnologias
- Java 21  
- Spring Boot 3  
- Spring Security  
- Spring Data JPA / Hibernate  
- Maven  
- Lombok  
- MySQL  
- JWT  
- SpringDoc OpenAPI (Swagger)  

## Como Executar
Pré-requisitos: Java 21 ou superior, Maven 4+, Git, cliente de API (Postman, Insomnia) ou navegador para acessar o Swagger UI.  
1. Clone o repositório: `git clone https://github.com/seu-usuario/forum-hub.git`  
2. Entre no diretório: `cd forum-hub`  
3. Configure o banco de dados em `src/main/resources/application.properties`:  
   `spring.datasource.url=jdbc:mysql://localhost/seu_banco`  
   `spring.datasource.username=seu_usuario`  
   `spring.datasource.password=sua_senha`  
4. Execute a aplicação: `mvn spring-boot:run`  
5. Acesse a API em: [http://localhost:8080](http://localhost:8080)  
6. Acesse a documentação (Swagger UI): [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)  

## Endpoints
- POST /login → Autentica usuário e retorna JWT  
- GET /topicos → Lista todos os tópicos  
- GET /topicos/{id} → Busca tópico por ID  
- POST /topicos → Cria novo tópico  
- PUT /topicos/{id} → Atualiza tópico existente  
- DELETE /topicos/{id} → Exclui tópico logicamente  

## Autor
Feito por **Paulo Estrela**  
- [GitHub](https://github.com/Widgz)  
- [LinkedIn](https://www.linkedin.com/in/paulo-estrela)  

## Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
