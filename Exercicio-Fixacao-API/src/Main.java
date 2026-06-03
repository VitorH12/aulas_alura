import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    String dados = """
            {
            "nome": "Vitor Hugo",
            "idade": "20",
            "cidade": "Porto Alegre" }
            """;
    Gson gson =  new Gson();
    Pessoa pessoa = gson.fromJson(dados, Pessoa.class);
    IO.println(pessoa);
}
