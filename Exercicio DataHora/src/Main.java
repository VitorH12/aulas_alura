//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Digite a quantidade de parcelas que você deseja visualizar");
    int parcelas = sc.nextInt();
    IO.println("Digite o dia do mês que você deseja pagar suas parcelas");
    int dia = sc.nextInt();
    List <LocalDate> datasParcelas = new ArrayList <>();
    datasParcelas.add(LocalDate.of(2025, 5, dia));

    for (int i = 1; i <= parcelas; i++) {
        datasParcelas.add(datasParcelas.get(i-1).plusMonths(1));
        IO.println(datasParcelas.get(i-1));
    }

    int duracaoParcelas = Period.between(datasParcelas.get(0), datasParcelas.get(1)).getMonths();
    IO.println(duracaoParcelas);
}
