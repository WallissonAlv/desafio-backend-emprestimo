<h1 align="center">
  Emprestimo
</h1>

Baseado no JSON que a API recebe, o projeto faz uma análise com os dados do usuário que chamamos de customer e define a porcentagem de juros e o tipo de empréstimo que ela foi contemplada.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [H2](https://www.h2database.com/)

## Práticas adotadas

- API REST
- SOLID
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Iniciar a aplicação e acessar [localhost:8080](http://localhost:8080).
- Fazer uma requisição para a rota `/customer-loans` com o seguinte exemplo de JSON:
```json
{
    "age": 00, 
    "cpf": "000.000.000-xx", 
    "name": "Wallisson Alves",
    "income": 7000.00,
    "location": "SP"
}
