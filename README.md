# 🗃️ Manipulação de Banco de Dados com Spring Boot, Flyway e Docker

Este projeto demonstra como criar uma aplicação Java usando Spring Boot com acesso a banco de dados MySQL, versionamento de schema com Flyway e infraestrutura containerizada com Docker.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.4**
- **Docker & Docker Compose**
- **MySQL 8**
- **Flyway (versionamento de banco de dados)**
- **Lombok**

---

## 📦 Estrutura do Projeto

\`\`\`
└── src
    └── main
        ├── java
        │   └── com.dio.manipulacaobancodados
        │       └── persistence.entity
        │           ├── EmployeeDAO.java
        │           └── EmployeeEntity.java
        └── resources
            └── db
                └── migration
                    └── V20250404__createEmployee.sql
\`\`\`

---

## 📄 Funcionalidades

- Criar e gerenciar registros de funcionários
- Versionamento de schema automático com Flyway
- Acesso a dados com DAO (Data Access Object)
- Banco de dados persistido em container MySQL via Docker

---

## 🐳 Como executar com Docker

### 1. Suba o banco de dados:

\`\`\`bash
docker-compose up -d
\`\`\`

### 2. Rode a aplicação:

\`\`\`bash
./gradlew bootRun
\`\`\`

> Ou use o botão de run do IntelliJ/IDE.

---

## 🧬 Sobre o Flyway

🐦 Flyway é uma ferramenta de versionamento de banco de dados.
Ele garante que o esquema do banco (tabelas, colunas, índices etc.) esteja sempre atualizado automaticamente com base em scripts SQL versionados.



---

## 🧾 Autor(a)

Projeto desenvolvido por **Deise Andrade**   
> Feito com foco em aprendizado e prática com ferramentas modernas de backend Java.
