//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Digite o valor da assinatura: ");
    double valor = scanner.nextDouble();
    IO.println("Digite o metodo de pagamento");
    String metodo = scanner.next();

    if (metodo.equals("Paypal")){
        PagamentoPaypal pagamentoPaypal = new PagamentoPaypal();
        Assinatura assinatura = new Assinatura(pagamentoPaypal, valor);
        assinatura.renovarAssinatura();
    }
    else if (metodo.equals("Cartao")){
        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        Assinatura assinatura = new Assinatura(pagamentoCartao, valor);
        assinatura.renovarAssinatura();
    }



}
