# Gerenciador de Nomes

Projeto inicial para o tutorial de JDBC com Spring Boot.

## Objetivo

Neste primeiro momento, o sistema implementa o CRUD de nomes utilizando apenas uma `List<String>`.

A interface `GerenciadorNomes` define as operações do sistema, enquanto `GerenciadorNomesLista` fornece uma implementação em memória.

Posteriormente, a implementação será substituída por uma versão utilizando JDBC e H2, sem alterar a interface usada pela aplicação.

## Executar

Requisitos:

- Java 21 ou superior
- Maven 3.9 ou superior

Execute:

```bash
./mvnw spring-boot:run
```

ou, se o Maven estiver instalado:

```bash
mvn spring-boot:run
```
