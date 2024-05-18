# Spring Boot API

Trata-se de um projeto que consome uma API de proutos testes e adiciona itens numa lista de favoritos de respectivo usuario. Foram usadas as seguintes tecnologias:

- Java 17
- Spring Boot 3.2.5
- Postgres

Requisitos para rodar o projeto:

- Postman ou Insomnia para teste das requisições.
- Intelij ou outro de sua preferência.

Localmente:

- Java 21
- Maven
- Postman ou Insomnia para teste das requisições
- PostgreeSQL ou outro gerenciador de banco de dados caso você queira acompanhar o comportamento do banco.

Passos para utilizar a aplicacao:

- Faça o clone do repositório:

        git clone https://github.com/DevLarre/springboot-api

- Para rodar a aplicação usei o Intelij, localize a pasta a seguir.

        📁 springboot
                📁 src
                        📁 main
                                📁 java
                                        📁 com.example.springboot
                                                SpringbootApplication (Abra este arquivo no Intelij e faça ele executar uma aplicação.)

        Após executado você pode seguir para o próximo passo no Postman.

- Lembre-se de criar no Postman os metódos da sua API, nesse caso terá que criar o POST, GET ALL, GET ONE, UPDATE e DELETE.
- Após a criação deles basta seguir os passos abaixo com o link da localhost padrão que está abaixo.
- Para testar as aplicações usei o Postman, conecte-se no localhost pelo http://localhost:8080/products

#### Criação de um POST:

            Defina no campo POST o link abaixo.

            http://localhost:8080/products

            Defina um nome como no exemplo asseguir, e envie a solicitação, pode enviar mais de um exemplo seprando eles após as {} com a , .
            {
                "name": "SmartTv",
                "value": 1800.00
            }

#### GET ALL:

            Defina no campo GET ALL o link abaixo.

            http://localhost:8080/products

            No GET ALL irá aparecer todos os POST que foram criados como no exemplo abaixo.

            [
    {
        "idProduct": "8540617d-9394-4f1b-b06c-09df0ab56ba4",
        "name": "Teclado Dev",
        "value": 1800.00,
        "links": [
            {
                "rel": "self",
                "href": "http://localhost:8080/products/8540617d-9394-4f1b-b06c-09df0ab56ba4"
            }
        ]
    },
    {
        "idProduct": "262e7467-2ac5-418d-841b-0e7ff187dd09",
        "name": "Monitor",
        "value": 1800.00,
        "links": [
            {
                "rel": "self",
                "href": "http://localhost:8080/products/262e7467-2ac5-418d-841b-0e7ff187dd09"
            }
        ]
    }
            ]

#### GET ONE:

            Defina no campo GET ONE o link abaixo.

            http://localhost:8080/products/8540617d-9394-4f1b-b06c-09df0ab56ba4

            Note que o campo do link está sendo atualizado com o href da API que foi implementada anteriormente no ProductController, ou nesse caso para cada produto criado ele vai trazer um link diferente no qual é possivel encontralo com o metodo de pesquisa GET ONE.
            O retorno do link acima será esse exemplo de uma API.

    {
        "idProduct": "8540617d-9394-4f1b-b06c-09df0ab56ba4",
        "name": "Teclado Razer Dev, Mecanique",
        "value": 1800.00,
        "_links": {
                "Products List": {
                "href": "http://localhost:8080/products"
                }
                }
    }

#### UPDATE:

            Defina no campo UPDATE o link abaixo.

            http://localhost:8080/products/262e7467-2ac5-418d-841b-0e7ff187dd09


            No metódo de UPDATE iremos atualizar uma informação existente de algum POST feito anteriormente, nesse caso utilizarei novamente o exemplo do "MONITOR".
            Vamos atualizar o nome do Monitor e o seu valor, lembre-se a atualização somente retornara '201' se todos os campos forem preenchidos nesse caso o "name" e "value", se qualquer um deles estiver sem preenchimento retornara erro 401 Bad Request.

            {
                "name": "Monitor Curvo 120Hz",
                "value": 2800.00
            }

            Após a atualização e o seu envio, será possivel visualizar a sua atualização.

#### DELETE:

             Defina no campo DELETE o link abaixo. (Ou outro link de sua preferência)

             http://localhost:8080/products/262e7467-2ac5-418d-841b-0e7ff187dd09

             No metódo DELETE iremos deletar o Monitor que atualizamos e estamos usando de exemplo. Uma vez excluido o item ele não ira mais aparecer nas requisições.
             Para exclui-lo basta adicionar o link acima e evniar a solicitação.
             Se for um sucesso devera aparecer a mensagem de "Product deleted successfully."
             Caso o link do produto não exista ou você ja tenha excluido irá mostrar a mensagem, "Product not found.".

## Contato

Para mais informações ou feedback, entre em contato:

- GitHub: [DevLarré](https://github.com/DevLarre)
- Instagram: [dev_larre](https://www.instagram.com/dev_larre?igsh=NXM0cWhuZjg2Z2d2&utm_source=qr)
- LinkedIn: [devlarre](https://www.linkedin.com/in/devlarre/)
