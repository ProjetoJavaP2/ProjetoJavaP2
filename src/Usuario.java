import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String endereco;
    private List<Emprestimo> historicoEmprestimos;

    public Usuario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.historicoEmprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}
