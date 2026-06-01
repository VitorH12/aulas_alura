import java.util.ArrayList;
import java.util.List;

public class CartaodeCredito {

    private Double limite;
    private Double saldo;
    private List<Compra> compras = new ArrayList<>();


    public CartaodeCredito(Double limite) {
        this.limite = limite;
        this.saldo = limite;

    }
    public Double getLimite() {
        return limite;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Compra compra){
        if (saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            compras.add(compra);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- EXTRATO DO CARTÃO ---\n");

        for (Compra compra : compras) {
            sb.append("Descrição: ").append(compra.getDescricao())
                    .append(" - Valor: R$ ").append(compra.getValor()).append("\n");
        }

        sb.append("Saldo disponível: R$ ").append(saldo);
        return sb.toString();
    }
}
