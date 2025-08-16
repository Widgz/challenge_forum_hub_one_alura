🚀 Fórum Hub: Uma API para seu fórum online
📖 Sobre o Projeto
O Fórum Hub é uma API RESTful completa, desenvolvida como parte do Challenge Back-End da Alura e Oracle ONE. 

O objetivo foi construir o coração de um fórum de discussão, onde os usuários podem gerenciar tópicos de forma eficiente, criando, lendo, atualizando e excluindo conteúdo. O projeto inclui um robusto sistema de segurança para proteger todas as rotas com autenticação.

Este projeto foi uma excelente oportunidade para aplicar e consolidar conceitos essenciais do desenvolvimento com Java e Spring, como a criação de APIs REST, validações de dados, segurança com tokens JWT e persistência de informações no banco de dados.

✨ Funcionalidades em Destaque
Autenticação e Segurança: Implementa um sistema de login seguro com Tokens JWT para autenticação stateless.

Controle de Acesso: Protege endpoints críticos, permitindo acesso apenas a usuários autenticados.

CRUD de Tópicos: Operações completas para gerenciar tópicos: criar, listar, atualizar e deletar.

Validações de Negócio: Garante a consistência dos dados, prevenindo a duplicação de tópicos com títulos e mensagens idênticos.

Persistência de Dados: Utiliza Spring Data JPA e Hibernate para uma gestão simplificada e eficaz do banco de dados.

Documentação Automática: Com o SpringDoc OpenAPI, a API gera uma documentação interativa e fácil de usar (Swagger UI).

🛠️ Tecnologias Utilizadas
Ferramenta	O que faz?
Java 21	Linguagem de programação central.
Spring Boot 3	Framework para a criação de microserviços e aplicações robustas.
Spring Security	Gerencia a segurança e a autorização.
JPA / Hibernate	Facilita a comunicação com o banco de dados.
Maven	Gerencia as dependências do projeto.
Lombok	Reduz a quantidade de código repetitivo (boilerplate).
MySQL	Banco de dados relacional.
JWT (Java JWT)	Biblioteca para trabalhar com tokens de autenticação.
SpringDoc OpenAPI	Cria documentação interativa para a API.

🚀 Guia de Execução
Siga estes passos para rodar o projeto localmente:

Pré-requisitos
Java 21 ou superior.

Maven 4.0 ou superior.

Git.

Um cliente de API (como Postman ou Insomnia).

Passos
Clone o repositório:

Bash

git clone https://docs.github.com/articles/referencing-and-citing-content
Entre na pasta do projeto:

Bash

cd [nome-do-seu-repositorio]
Ajuste a conexão com o banco de dados:
No arquivo src/main/resources/application.properties, configure as propriedades spring.datasource.url, spring.datasource.username e spring.datasource.password com suas credenciais do MySQL.

Inicie a aplicação:

Bash

mvn spring-boot:run
A API estará pronta em http://localhost:8080. A documentação interativa pode ser acessada em http://localhost:8080/swagger-ui.html.

📄 Endpoints da API
Método HTTP	Endpoint	Descrição	Autenticação Necessária?	Corpo (Exemplo JSON)
POST	/login	Autentica e retorna um token JWT.	Não	{ "email": "seu-email", "senha": "sua-senha" }
GET	/topicos	Lista todos os tópicos.	Sim	N/A
GET	/topicos/{id}	Busca um tópico específico.	Sim	N/A
POST	/topicos	Cria um novo tópico.	Sim	{ "titulo": "...", "mensagem": "...", "curso": "..." }
PUT	/topicos/{id}	Atualiza um tópico existente.	Sim	{ "titulo": "...", "mensagem": "...", "curso": "..." }
DELETE	/topicos/{id}	Remove um tópico.	Sim	N/A

👨‍💻 Autor
Desenvolvido com ❤️ por Paulo Estrela.

📜 Licença
Este projeto é de código aberto e está sob a licença MIT.
