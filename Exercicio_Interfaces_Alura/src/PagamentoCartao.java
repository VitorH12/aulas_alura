
public class PagamentoCartao implements ServicoPagamento {
    @Override
    public void processarTaxa(double valor) {
        IO.println("Cobrando R$" + valor + "no Cartão de Crédito... Transação aprovada!");
    }
}
