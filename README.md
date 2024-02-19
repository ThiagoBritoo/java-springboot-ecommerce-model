# java-springboot-ecommerce-model

![Java](https://img.shields.io/badge/Java-red)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-green)
![H2 Database](https://img.shields.io/badge/Database-H2-orange)

Este é um projeto de modelagem de entidades para um sistema de ecommerce, desenvolvido em Java com Spring Boot.

## Descrição

O projeto apresenta as entidades essenciais para um sistema de ecommerce, incluindo Usuário (User), Categoria (Category), Pedido (Order), status (OrderStatus) e Produto (Product). Ele implementa métodos básicos para recuperar entidades por ID e obter todas as entidades.

## Estrutura do Projeto

- `src/main/java/com/ecommerce/course/entities/`: Contém as classes de entidades.
- `src/main/java/com/ecommerce/course/repositories/`: Contém as interfaces dos repositórios.
- `src/main/java/com/ecommerce/course/services/`: Contém os serviços relacionados às entidades.
- `src/main/java/com/ecommerce/course/controllers/`: Contém os controllers das entidades.

## Entidades

### User

Descrição: Representa um usuário no sistema.

Atributos:
- `id`: Identificador do usuário.
- `name`: Nome de usuário.
- `email`: Endereço de e-mail do usuário.
- `phone`: Telefone do usuário.
- `password`: Senha do usuário.
- `orders`: Lista de pedidos do usuário.

### Category

Descrição: Representa uma categoria de produtos.

Atributos:
- `id`: Identificador da categoria.
- `name`: Nome da categoria.
- `products` : Lista de produtos na categoria.

### Order

Descrição: Representa um pedido feito por um usuário.

Atributos:
- `id`: Identificador do pedido.
- `moment`: Timestamp do pedido.
- `orderStatus`: Enumeração representando o status do pedido.
- `client`: Identificador do usuário que fez o pedido.


### Product

Descrição: Representa um produto disponível para compra.

Atributos:
- `id`: Identificador do produto.
- `name`: Nome do produto.
- `description`: Descrição do produto.
- `price`: Preço do produto.
- `imgUrl`: Imagem do produto.

### OrderStatus (enum)

Descrição: Representa os possíveis status de um pedido.

Valores:
- `WAITING_PAYMENT`
- `PAID`
- `SHIPPED`
- `DELIVERED`
- `CANCELED`

## Configuração do Banco de Dados

O projeto utiliza H2 como banco de dados para ambientes de teste. As configurações estão definidas no arquivo `application-test.properties`.

## Como Usar

1. **Clone este repositório:**
   git clone https://github.com/seu-usuario/java-springboot-ecommerce-model.git

2. **Importe o projeto em sua IDE preferida.**

3. **Execute o projeto.**

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests.
