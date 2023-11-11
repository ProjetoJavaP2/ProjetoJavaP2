import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        Livro[] livros = {
                new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", 1954),
                new Livro(2, "Dom Quixote", "Miguel de Cervantes", 1605),
                new Livro(3, "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997),
                new Livro(4, "1984", "George Orwell", 1949),
                new Livro(5, "Cem Anos de Solidão", "Gabriel García Márquez", 1967)
        };

        for (Livro livro : livros) {
            biblioteca.adicionarItem(livro);
        }

        System.out.println("Informe os detalhes do Usuário:");
        System.out.print("Nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoUsuario = scanner.nextLine();

        Usuario usuario = new Usuario(nomeUsuario, enderecoUsuario);
        biblioteca.adicionarUsuario(usuario);

        System.out.println("\nOpções de Livros para Empréstimo:");
        for (Livro livro : livros) {
            System.out.println("Digite " + livro.getId() + " para o livro \"" + livro.getTitulo() + "\"");
        }

        System.out.print("\nDigite o número do livro desejado para empréstimo: ");
        int opcaoEscolhida = scanner.nextInt();

        Livro livroEscolhido = null;

        for (Livro livro : livros) {
            if (livro.getId() == opcaoEscolhida) {
                livroEscolhido = livro;
                break;
            }
        }

        if (livroEscolhido != null) {
            LocalDate dataEmprestimo = LocalDate.now();
            biblioteca.realizarEmprestimo(livroEscolhido, usuario, dataEmprestimo);
            System.out.println("\nEmpréstimo realizado com sucesso!");

            Emprestimo emprestimo = biblioteca.getEmprestimos().get(0);
            System.out.println("Detalhes do Empréstimo:");
            System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
            System.out.println("Item: " + emprestimo.getItem().getTitulo());
            System.out.println("Data de Empréstimo: " + emprestimo.getDataEmprestimo());
        } else {
            System.out.println("\nLivro não encontrado. Empréstimo não realizado.");
        }

        scanner.close();
    }
}
