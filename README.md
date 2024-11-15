# 🕹️ Game List API

Este é um projeto desenvolvido como um laboratório prático para explorar conceitos fundamentais de desenvolvimento backend utilizando **Spring Boot**, **ORM**, e **Docker**, com foco em boas práticas de design, padrões de projeto, e organização em camadas.

## 🚀 Funcionalidades Principais

- **API RESTful** para gerenciar jogos e listas.
- **Modelo de domínio** com relacionamentos (N-N).
- **Camadas organizadas**: Controller, Service, Repository, DTO.
- **Banco de Dados**:
    - ORM configurado com **Spring Data JPA**.
    - **Seeding** automático de dados para facilitar o desenvolvimento e testes.
    - Suporte a diferentes perfis: desenvolvimento, homologação e produção.
- **Endpoints especiais** para manipulação de reordenar lista de jogos e persistir as novas posições em banco.
- **Homologação local** com **Docker** e **Docker Compose**.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Framework:** Spring Boot (Spring Data JPA, Spring Web)
- **Banco de Dados:**
    - **H2** para desenvolvimento e testes.
    - **PostgreSQL** para homologação e produção.
- **Containerização:** Docker e Docker Compose
- **Gerenciamento de dependências:** Maven

## 🌐 Endpoints Principais

### Gerenciamento de Jogos

- **`GET /games`**: Busca todos os jogos.
- **`GET /games/{id}`**: Busca um jogo por ID.
- **`POST /games`**: Cria um novo jogo.
- **`PUT /games/{id}`**: Atualiza os dados de um jogo.

### Gerenciamento de Listas

- **`GET /lists`**: Busca todas as listas de jogos.
- **`POST /{listId}/replacement`**: Reordena os jogos dentro de uma lista.

## 🖇️ Relacionamentos e Consultas Avançadas

- **Relacionamento N-N**: Jogos pertencem a várias listas e incluem uma **classe de associação** para armazenar a posição do jogo na lista.
- **Consultas SQL personalizadas**:
    - Projeções com Spring Data JPA.
    - Atualização das novas posições.

## 🔄 Perfis de Ambiente

O projeto é configurado com três perfis principais:

1. **Desenvolvimento e Testes** (`test`):

    - Banco de Dados H2
    - Configuração simplificada para testes rápidos.

2. **Homologação** (`dev`):

    - Banco de Dados PostgreSQL com Docker.

3. **Produção** (`prod`):
    - Configurações otimizadas para desempenho e segurança.


## 📂 Estrutura do Projeto

O projeto segue o padrão de desenvolvimento em camadas.

