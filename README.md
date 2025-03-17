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
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
## Compile e rode a aplicação:

bash
mvn clean install
mvn spring-boot:run
Acesse o aplicativo no navegador em: http://localhost:8080

## 🛠 Estrutura do projeto
src/
├── main/
│   ├── java/
│   │   └── com.jwtvalidation/
│   │       └── JwtValidationApplication.java (Arquivo principal)
│   ├── resources/
│       └── application.properties (Configurações da aplicação)
└── test/ (Testes unitários)
🧪 Testes
## Para executar os testes, use o comando:

bash
mvn test
