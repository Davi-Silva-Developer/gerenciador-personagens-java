# Gerenciador de Personagens (Java Core)

Um mini projeto prático desenvolvido em Java para aplicar e consolidar conceitos avançados da linguagem, estruturas de dados e boas práticas de engenharia de software.

O objetivo foi construir um sistema backend executado via terminal (console) para gerir uma coleção de personagens (inspirado no universo de jogos como Resident Evil). O foco principal do desenvolvimento esteve na criação de um código limpo, modular e de fácil manutenção.

## Tecnologias
- Java 24
- Java Core (Sem frameworks externos)
- Stream API & Lambdas
- Java Records
- Generics (`<T>`)
- Maven

## Funcionalidades
- Listagem e busca de personagens por Categoria.
- Listagem e busca de personagens por Pontuação Mínima.
- Ordenação automática de personagens (da maior para a menor pontuação).
- Validação de entrada de dados do usuário.

## Como executar o projeto

### Pré-requisitos
- Java 24 ou superior
- Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passos
```bash
git clone [https://github.com/Davi-Silva-Developer/gerenciador-personagens-java.git](https://github.com/Davi-Silva-Developer/gerenciador-personagens-java.git)
Abra o projeto na sua IDE.

Localize e execute a classe Main dentro do pacote br.com.gerenciador.

Interaja com o sistema diretamente pelo terminal da sua IDE.

Menu Principal do Sistema
Ao rodar a aplicação, você terá acesso ao seguinte menu interativo no console:

Plaintext
--- MENU DA BIBLIOTECA ---
1 - Buscar por Categoria
2 - Buscar por Pontuação Minima
0 - Sair
Conceitos aplicados
Arquitetura em Camadas (Layered Architecture com pacotes model, repository, service e main).

Padrão Repositório (Repository Pattern).

Criação de uma classe de repositório inteligente e genérica (BauGenerico<T>).

Princípios de Clean Code e Separação de Responsabilidades.

Tratamento de Exceções (try/catch para entradas inválidas InputMismatchException).

Próximos Passos (Evolução)
[x] Adicionar tratamento de exceções (Exceptions) para interações inválidas do usuário.

[ ] Migrar a persistência em memória (Listas) para um Banco de Dados relacional.

[ ] Evoluir a arquitetura de terminal para uma API REST utilizando o framework Spring Boot.

Autor
Davi Silva LinkedIn: https://www.linkedin.com/in/davi-silva-dev

GitHub: https://github.com/Davi-Silva-Developer
