import com.google.gson.annotations.SerializedName;

public class Livro {
    @SerializedName("nome")
    private String nome;
    @SerializedName("autor")
    private String autor;
    @SerializedName("editora")
    private Editora editora;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + nome + "\n");
        sb.append("Autor: " + autor + "\n");
        sb.append("Editora: " + editora.getNome() + "\n");
        sb.append("Cidade da Editora: " + editora.getCidade() + "\n");
        return sb.toString();
    }
}
