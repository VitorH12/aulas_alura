public class Filme {
    private String nome;
    private Integer ano;

    public Filme(String nome, Integer ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    @Override
    public String toString(){
        return "Filme{" + "nome=" + nome + ", ano=" + ano + '}';
    }
}
