import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    String dados = """
            {
            "nome": "Robin Hood",
            "autor": "Vitor Hugo",
            "editora": { "nome" : "Editora Porto Alegre",
             "cidade": "Porto Alegre"
             }
             }
            """;
    Gson gson =  new Gson();
    Livro livro = gson.fromJson(dados, Livro.class);
    IO.println(livro.toString());
}
