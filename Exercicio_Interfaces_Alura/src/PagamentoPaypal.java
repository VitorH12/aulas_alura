public class PagamentoPaypal implements ServicoPagamento{

    @Override
    public void processarTaxa(double valor) {
        IO.println("Conectando ao PayPal...R$" + valor + " debitado com sucesso!");
    }
}
