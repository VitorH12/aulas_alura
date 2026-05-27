//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);
    int opcao = 0;

    IO.println("Diga o nome da cliente: ");
    String nome = sc.nextLine();
    IO.println("Diga o saldo: ");
    Float saldo = sc.nextFloat();
    sc.nextLine();
    IO.println("Diga o tipo de conta: ");
    String conta = sc.nextLine();

    Account p1 = new Account(nome, saldo, conta);
    IO.println(p1.toString());


    while (opcao != 4) {
        IO.println("Digite a açao que você quer realizar:");
        IO.println("1 - Mostrar saldo atual");
        IO.println("2 - Depositar valor");
        IO.println("3 - Sacar valor");
        IO.println("4 - Sair");
        opcao = sc.nextInt();
        if (opcao == 1) {
            p1.ShowBalance();
        }
        if (opcao == 2) {
            IO.println("Digite o valor que voce quer depositar: ");
            Float valor = sc.nextFloat();
            p1.depositar(valor);
        }
        if (opcao == 3) {
            IO.println("Digite o valor que voce quer saque: ");
            Float valor = sc.nextFloat();
            p1.sacar(valor);
        }
    }


}
