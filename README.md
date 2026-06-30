# Banking Movements REST API - Java/Spring/OAuth2

Java/Spring Boot REST API project focused on secure banking movement retrieval using OAuth2/token-based authentication.

This is an academic/backend practice project that demonstrates REST API design, Spring Boot configuration, persistence setup, and authentication-oriented API behavior.

## What this demonstrates

- REST API design with Spring Boot
- OAuth2/resource-server-oriented security setup
- Backend service structure for banking movement retrieval
- Database-backed API behavior with JPA
- H2/MySQL-compatible persistence configuration
- Postman collection usage for manual/API validation

## Tech stack

- Java 11
- Spring Boot 2.6.x
- Spring Web
- Spring Data JPA
- Spring Security OAuth2 client/resource server dependencies
- H2 / MySQL driver
- Maven
- Postman collection

## Repository structure

```text
src/                 Java/Spring Boot source code
Postman-Collection/  API request collection for validation
pom.xml              Maven dependencies and build configuration
mvnw, mvnw.cmd       Maven wrapper scripts
```

## Running locally

```bash
./mvnw spring-boot:run
```

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

## Project context

This repo was created as a backend/API learning project. It is useful as a compact example of Spring Boot API structure, authentication-oriented configuration, and banking-domain endpoint modeling.

## Naming note

The original repository name is `OAuth2-Bancary-movements`. The intended English wording is **Banking Movements REST API**.
