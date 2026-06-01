//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner scanner = new Scanner(System.in);
    int continua = 1;
    IO.println("Digite o limite do cartão");
    double limite = scanner.nextDouble();
    CartaodeCredito cartaodeCredito = new CartaodeCredito(limite);
    while (continua != 0) {
        IO.println("Digite a descricao do produto");
        String descricao = scanner.next();
        IO.println("Digite o valor do produto");
        double valor = scanner.nextDouble();
        Compra compra = new Compra(descricao, valor);
        boolean compraRealizada = cartaodeCredito.lancaCompra(compra);
        if (!compraRealizada) {
            IO.println("Saldo insuficiente");
            IO.println(cartaodeCredito.toString());
            break;
        }
        IO.println("Digite 0 para sair e 1 para continuar: ");
        continua = scanner.nextInt();

    }
    cartaodeCredito.getCompras().sort(Comparator.comparing(Compra::getValor));
    IO.println("**************");
    IO.println(cartaodeCredito.toString());
    IO.println("**************");





}
