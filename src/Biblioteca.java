import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemBiblioteca> acervo;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        acervo.add(item);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(ItemBiblioteca item, Usuario usuario, LocalDate dataEmprestimo) {
        if (acervo.contains(item) && usuarios.contains(usuario)) {
            Emprestimo emprestimo = new Emprestimo(item, usuario, dataEmprestimo);
            emprestimos.add(emprestimo);
        }
    }

    public void realizarDevolucao(Emprestimo emprestimo, LocalDate dataDevolucao) {
        emprestimo.setDataDevolucao(dataDevolucao);
    }

    public List<ItemBiblioteca> getAcervo() {
        return acervo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void exibirAcervo() {
        System.out.println("Acervo da Biblioteca:");
        for (ItemBiblioteca item : acervo) {
            item.mostrarDetalhes();
        }
    }

    public void exibirUsuarios() {
        System.out.println("\nUsuários Registrados na Biblioteca:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome() + ", Endereço: " + usuario.getEndereco());
        }
    }

    public void exibirEmprestimos() {
        System.out.println("\nHistórico de Empréstimos:");
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Usuário: " + emprestimo.getUsuario().getNome() +
                    ", Item: " + emprestimo.getItem().getTitulo() +
                    ", Data de Empréstimo: " + emprestimo.getDataEmprestimo() +
                    ", Data de Devolução: " + emprestimo.getDataDevolucao());
        }
    }

    public ItemBiblioteca buscarLivroPorId(int idLivro) {
        for (ItemBiblioteca item : acervo) {
            if (item instanceof Livro && item.getId() == idLivro) {
                return item;
            }
        }
        return null;
    }
}
