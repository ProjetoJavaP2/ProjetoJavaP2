**Projeto de Sistema de Biblioteca em Java**

---

### Introdução

Este projeto consiste em um Sistema de Biblioteca desenvolvido em Java, utilizando os princípios da orientação a objetos. O sistema simula o funcionamento básico de uma biblioteca, permitindo a adição de livros ao acervo, o cadastro de usuários, o registro de empréstimos e a realização de devoluções.

### Estrutura do Projeto

O projeto é composto por diversas classes interconectadas, cada uma representando entidades específicas do sistema:

1. **`ItemBiblioteca`**: Classe abstrata que serve como base para itens que podem estar presentes na biblioteca, contendo informações comuns como ID, título e autor. Possui um método abstrato `mostrarDetalhes()` para exibir informações específicas de cada item.

2. **`Livro`**: Classe que herda de `ItemBiblioteca` e representa os livros presentes na biblioteca. Além das informações comuns, armazena o ano de publicação.

3. **`Usuario`**: Representa os usuários da biblioteca, armazenando informações como nome, endereço e um histórico de empréstimos.

4. **`Emprestimo`**: Classe que registra os empréstimos realizados na biblioteca, mantendo informações sobre o item emprestado, o usuário e as datas de empréstimo e devolução.

5. **`Biblioteca`**: Classe central que gerencia todo o sistema. Permite a adição de itens ao acervo, cadastro de usuários, registro de empréstimos, devoluções e fornece métodos para exibir informações sobre o acervo, usuários e histórico de empréstimos.

### Funcionalidades

- **Cadastro de Livros**: Permite adicionar livros ao acervo da biblioteca, informando título, autor e ano de publicação.

- **Cadastro de Usuários**: Possibilita registrar novos usuários, incluindo informações como nome e endereço.

- **Empréstimo de Livros**: Permite realizar empréstimos, associando um livro a um usuário e registrando a data de empréstimo.

- **Devolução de Livros**: Registra a devolução de um livro, atualizando a data de devolução no histórico de empréstimos.

- **Exibição de Informações**: Fornece métodos para exibir o acervo da biblioteca, listar usuários cadastrados e apresentar o histórico de empréstimos.

### Utilização

A interação com o sistema pode ser realizada através de uma interface de linha de comando. O usuário pode cadastrar livros, cadastrar usuários, realizar empréstimos, devoluções e visualizar informações sobre o acervo, usuários e empréstimos.

### Princípios de Orientação a Objetos

O projeto aplica os quatro princípios fundamentais da orientação a objetos:

1. **Encapsulamento**: A maioria dos atributos nas classes são privados e acessados por meio de métodos públicos, garantindo controle sobre o acesso e modificação dos dados.

2. **Herança**: A classe `Livro` herda da classe abstrata `ItemBiblioteca`, compartilhando atributos e comportamentos comuns.

3. **Polimorfismo**: O método abstrato `mostrarDetalhes()` na classe `ItemBiblioteca` é implementado de forma polimórfica nas classes derivadas.

4. **Associação**: A classe `Biblioteca` é responsável por associar diferentes entidades, como livros, usuários e empréstimos, coordenando as operações do sistema.

### Conclusão

O Sistema de Biblioteca desenvolvido em Java oferece uma base sólida para a gestão básica de uma biblioteca, permitindo o controle eficiente do acervo, usuários e empréstimos. Este projeto pode ser expandido e adaptado conforme necessário para atender aos requisitos específicos de diferentes aplicações bibliotecárias.