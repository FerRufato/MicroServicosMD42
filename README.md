# 🧩 Projeto: Microserviços com Spring Boot – Cliente e Produto

Este projeto demonstra a criação de dois microserviços utilizando o ecossistema Spring Boot. Os serviços são responsáveis por gerenciar dados de **clientes** e **produtos**, com funcionalidades de **cadastro**, **edição** e **pesquisa**, além de comunicação entre si por meio do **OpenFeign**. As configurações são centralizadas em um **Config Server**.

---

## 🏗️ Estrutura do Projeto

```
microservicos-projeto-unico/
├── cliente-service/     # Microserviço de Clientes
├── produto-service/     # Microserviço de Produtos
└── config-server/       # Servidor de configuração centralizada
```

---

## 🧪 Funcionalidades

### 📦 Cliente Service
- Cadastrar cliente (`POST /clientes`)
- Editar cliente (`PUT /clientes/{id}`)
- Listar todos os clientes (`GET /clientes`)
- Buscar cliente por ID (`GET /clientes/{id}`)

### 📦 Produto Service
- Cadastrar produto (`POST /produtos`)
- Editar produto (`PUT /produtos/{id}`)
- Listar todos os produtos (`GET /produtos`)
- Buscar produto por ID (`GET /produtos/{id}`)

---

## 🚀 Tecnologias Utilizadas

| Tecnologia                | Uso                                               |
|--------------------------|---------------------------------------------------|
| Spring Boot Web          | Criação dos endpoints REST                        |
| Spring Data MongoDB      | Persistência com banco MongoDB                   |
| Spring Cloud Config      | Configuração centralizada com Config Server      |
| Spring Cloud OpenFeign   | Comunicação entre microserviços via HTTP         |
| Spring Cloud Bootstrap   | Suporte à configuração distribuída               |
| Spring Boot DevTools     | Hot reload durante desenvolvimento                |
| Bean Validation (`@Valid`)| Validação de dados de entrada                    |
| Lombok                   | Redução de boilerplate nas classes Java          |

---

## 🗄️ Pré-requisitos

- Java 17+
- Maven
- MongoDB rodando localmente (ou via Docker)
- Git

---

## 🔧 Como Executar

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/microservicos-projeto-unico.git
cd microservicos-projeto-unico
```

2. **Inicie o Config Server:**
```bash
cd config-server
./mvnw spring-boot:run
```

3. **Inicie os demais serviços:**
```bash
# Em outro terminal
cd cliente-service
./mvnw spring-boot:run

# Em outro terminal
cd produto-service
./mvnw spring-boot:run
```

---

## 🧪 Teste com Postman

Você pode testar os endpoints com o Postman ou qualquer outro cliente HTTP:

Exemplo de criação de cliente:
```http
POST http://localhost:8081/clientes
Content-Type: application/json

{
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```

---

## 🌐 Configuração Centralizada

O `config-server` busca arquivos de configuração de um repositório Git (ainda precisa ser criado por você), como:

```
https://github.com/seu-usuario/microservicos-config-repo
```

---

## 👨‍💻 Autor

Desenvolvido por **Fernanda Rufato**  
[GitHub](https://github.com/FerRufato) | [LinkedIn](https://www.linkedin.com/in/fernanda-rufato)

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT.
