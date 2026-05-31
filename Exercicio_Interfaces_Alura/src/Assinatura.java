public class Assinatura {
    private double mensalidade;
    private ServicoPagamento servicoPagamento;

    public Assinatura(ServicoPagamento servicoPagamento, double mensalidade) {
        this.servicoPagamento = servicoPagamento;
        this.mensalidade = mensalidade;
    }

    public void renovarAssinatura() {
        servicoPagamento.processarTaxa(this.mensalidade);
    }
}
