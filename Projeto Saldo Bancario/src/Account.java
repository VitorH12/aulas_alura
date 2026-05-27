public class Account {

    private String name;
    private Float balance;
    private String accountType;

    public Account(String name, Float balance, String accountType) {
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void ShowBalance(){
        IO.println("O valor atual na sua conta é de: " + this.balance);
    }

    public void sacar(float value){
        if (value <= this.balance){
            this.balance -= value;
        }
        else {
            IO.println("O valor do saque excedeu o valor que há na conta bancária, tente outro valor!");
        }

    }

    public void depositar(float value){
        this.balance += value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("nome = ").append(name).append(" ");
        stringBuilder.append("saldo = ").append(balance).append(" ");
        stringBuilder.append("Tipo de conta = ").append(accountType);
        return stringBuilder.toString();
    }
}
