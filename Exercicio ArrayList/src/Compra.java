public class Compra {

    private String descricao;
    private Double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Descricao: " + this.descricao);
        s.append(", Valor: " + this.valor);
        return s.toString();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
