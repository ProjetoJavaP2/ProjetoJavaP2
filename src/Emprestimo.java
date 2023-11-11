import java.time.LocalDate;

public class Emprestimo {
    private ItemBiblioteca item;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(ItemBiblioteca item, Usuario usuario, LocalDate dataEmprestimo) {
        this.item = item;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
    }

    public ItemBiblioteca getItem() {
        return item;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
