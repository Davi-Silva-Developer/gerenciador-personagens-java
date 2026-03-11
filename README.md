```markdown
# Gerenciador de Personagens (Java Core)

Um mini projeto prático desenvolvido em Java para aplicar e consolidar conceitos avançados da linguagem, estruturas de dados e boas práticas de engenharia de software.

## O Objetivo do Projeto
O objetivo foi construir um sistema backend executado via terminal (consola) para gerir uma coleção de personagens (inspirado no universo de jogos como Resident Evil). O foco principal do desenvolvimento esteve na criação de um código limpo, modular e de fácil manutenção, implementando a **Arquitetura em Camadas (Layered Architecture)** e o **Padrão Repositório (Repository Pattern)**.

## Tecnologias e Conceitos Aplicados
Este projeto foi construído sem o uso de frameworks externos, focando puramente no poder do Java Core:

* **Java Records:** Utilização de `records` para a modelagem de dados imutáveis de forma enxuta e direta (modelo `Personagem`).
* **Generics (`<T>`):** Criação de uma classe de repositório inteligente (`BauGenerico<T>`), capaz de armazenar e reutilizar a lógica de persistência para qualquer tipo de objeto.
* **Stream API & Lambdas:** Criação de esteiras de processamento fluentes para filtragem e manipulação de dados em memória.
* **Ordenação e Comparação:** Uso de `Comparator.comparingInt().reversed()` integrado à Stream API para gerar listagens ordenadas por pontuação (High Tiers).
* **Estruturas de Dados:** Manipulação de coleções utilizando a interface `List`.
* **Separação de Responsabilidades:** Divisão lógica do código nos pacotes `model`, `repository`, `service` e `main`.

## Como Executar o Projeto

1. Clona este repositório para a tua máquina local:
```bash
git clone [https://github.com/Davi-Silva-Developer/gerenciador-personagens-java.git](https://github.com/Davi-Silva-Developer/gerenciador-personagens-java.git)
Abre o projeto na tua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code).

Localiza e executa a classe Main dentro do pacote br.com.gerenciador.

Segue as instruções no ecrã da consola para interagir com o sistema de filtragem de personagens!

Próximos Passos (Evolução)
Este projeto serve como uma base sólida para futuras implementações:

[x] Adicionar tratamento de exceções (Exceptions) com blocos try/catch para interações inválidas do utilizador.

[ ] Migrar a persistência em memória (Listas) para uma Base de Dados relacional.

[ ] Evoluir a arquitetura de terminal para uma API REST utilizando o framework Spring Boot.

Desenvolvido com dedicação por Davi Silva.
