public abstract class ItemBiblioteca {
    private int id;
    private String titulo;
    private String autor;

    public ItemBiblioteca(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract void mostrarDetalhes();
}
