# 💈 Sistema de Agendamento para Barbearia

## 📌 Sobre o Projeto
Este projeto é uma API REST desenvolvida em Java com Spring Boot para gerenciar o agendamento de atendimentos em uma barbearia. Ele utiliza JPA com Hibernate para a persistência de dados no PostgreSQL, com gerenciamento de migrations via Flyway. O projeto está contêinerizado utilizando Docker e Docker Compose para facilitar a configuração e execução.

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **PostgreSQL**
- **Flyway**
- **Gradle**
- **Docker e Docker Compose**

## 📚 Pré-requisitos
Antes de executar o projeto, certifique-se de ter instalado:
- **Java 17** ou superior
- **Gradle**
- **Docker e Docker Compose** (caso deseje rodar o banco de dados via contêiner)

## ⚙️ Configuração do Ambiente
### 1️⃣ Clonar o Repositório
```sh
 git clone <URL_DO_REPOSITORIO>
 cd <NOME_DO_PROJETO>
```

### 2️⃣ Configurar o Banco de Dados
Caso esteja usando Docker, suba o banco de dados PostgreSQL com:
```sh
 docker-compose up -d
```
Isso iniciará um contêiner PostgreSQL com as configurações definidas no `docker-compose.yml`.

Se preferir rodar o PostgreSQL localmente, configure as credenciais no `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/barbearia_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=validate
```

### 3️⃣ Rodar as Migrations do Flyway
Flyway é usado para versionar a base de dados. Para aplicar as migrations:
```sh
 ./gradlew flywayMigrate
```

### 4️⃣ Executar o Projeto
Com todas as configurações feitas, execute a aplicação:
```sh
 ./gradlew bootRun
```
A API estará disponível em `http://localhost:8080`.

## 📖 Endpoints Principais
A API segue boas práticas RESTful. Alguns dos principais endpoints são:

### 🔹 Agendamentos
- **Criar um agendamento:** `POST /agendamentos`
- **Buscar todos os agendamentos:** `GET /agendamentos`
- **Buscar um agendamento por ID:** `GET /agendamentos/{id}`
- **Atualizar um agendamento:** `PUT /agendamentos/{id}`
- **Deletar um agendamento:** `DELETE /agendamentos/{id}`

### 🔹 Clientes
- **Cadastrar cliente:** `POST /clientes`
- **Buscar todos os clientes:** `GET /clientes`

## 🐳 Executando com Docker
Para rodar toda a aplicação dentro de contêineres Docker:
```sh
 docker-compose up --build
```
Isso irá subir o backend junto com o banco de dados.

## 📌 Considerações Finais
Esse projeto foi desenvolvido com foco em boas práticas de desenvolvimento backend, incluindo versionamento de banco de dados, containerização e princípios REST. Sinta-se à vontade para contribuir ou adaptar conforme necessário!

---
✍️ **Autor:** [Rebeca Azevedo by DIO]

