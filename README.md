# desafioitau

# JWT Validation Application

Esta é uma aplicação Spring Boot que fornece validação de tokens JWT.

## 🚀 Tecnologias utilizadas
- **Java 17**: Linguagem principal do projeto.
- **Spring Boot**: Framework para criação de aplicações baseadas em Java.
- **Maven**: Gerenciador de dependências e build.
- **JWT**: Para autenticação e validação de tokens.

## ⚙️ Configuração e uso
Siga os passos abaixo para rodar a aplicação localmente:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/allanbrosco/desafioitau.git

## Rode a aplicação:

Selecionar o arquivo JwtValidationApplication no path src> main > java > com.jwtvalidation
Selecione o arquivo com um duplo clique e clique em run

Utilizar a IDE Intelij, será exibido a funcionalidade run no canto superior direito, clique nele

É preciso ter o aplicativo postman para realizar os testes, caso não tenha baixo o aplicativo atraves do site: https://www.postman.com/downloads/

Acesse o aplicativo postman e faça as seguintes configurações:


Na aba Headers verificar se existe o valor abaixo, caso não existir então deve ser inserido:
Key=Content-Type
Value = application/json

Utilizar Método: Post
Url: http://localhost:8080/api/jwt/validate

No Body seleciar "raw" e JSON

Utilizar os token:
Caso 1: A Resposta será = verdadeiro
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJTZWVkIjoiNzg0MSIsIk5hbWUiOiJUb25pbmhvIEFyYXVqbyJ9.QY05sIjtrcJnP533kQNk8QXcaleJ1Q01jWY_ZzIZuAg"
}

Caso 2: A Resposta será = falso
{
    "token": "eyJhbGciOiJzI1NiJ9.dfsdfsfryJSr2xrIjoiQWRtaW4iLCJTZrkIjoiNzg0MSIsIk5hbrUiOiJUb25pbmhvIEFyYXVqbyJ9.QY05fsdfsIjtrcJnP533kQNk8QXcaleJ1Q01jWY_ZzIZuAg"
}

Caso 3: A Resposta será = JWT invalido
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiTWVtYmVyIiwiT3JnIjoiQlIiLCJTZWVkIjoiMTQ2MjciLCJOYW1lIjoiVmFsZGlyIEFyYW5oYSJ9.cmrXV_Flm5mfdpfNUVopY_I2zeJUy4EZ4i3Fea98zvY"
}

Caso 4: A Resposta será = Abrindo o JWT, a Claim Name possui caracter de números
{
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiTWVtYmVyIiwiT3JnIjoiQlIiLCJTZWVkIjoiMTQ2MjciLCJOYW1lIjoiVmFsZGlyIEFyYW5oYSJ9.cmrXV_Flm5mfdpfNUVopY_I2zeJUy4EZ4i3Fea98zvY"
}



## 🛠 Estrutura do projeto
src/
├── main/
│   ├── java/
│   │   └── com.jwtvalidation/
│   │       └── JwtValidationApplication.java (Arquivo principal)
│   ├── resources/
│       └── application.properties (Configurações da aplicação)
└── test/ (Testes unitários)

