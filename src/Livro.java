public class Livro extends ItemBiblioteca {
    private int anoPublicacao;

    public Livro(int id, String titulo, String autor, int anoPublicacao) {
        super(id, titulo, autor);
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Livro - ID: " + getId() + ", Título: " + getTitulo() + ", Autor: " + getAutor() + ", Ano de Publicação: " + anoPublicacao);
    }
}
