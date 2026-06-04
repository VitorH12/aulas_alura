import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException, InterruptedException {
    Scanner scanner = new Scanner(System.in);
    try {
        IO.println("Digite o CEP que voce desejar buscar: ");
        String cep = scanner.nextLine();
        String cepModificado = cep.replace("-", "");
        String endereco = "https://viacep.com.br/ws/" + cepModificado + "/json/";

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
        IO.println(response.body());
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        Cep cep1 = gson.fromJson(response.body(), Cep.class);
        IO.println(cep1);
        if (cep1.cep() != null){
            try (FileWriter fileWriter = new FileWriter("cep.json")) {
                fileWriter.write(gson.toJson(cep1));
            }
        }
        else {
            IO.println("Erro no cadastro de endereco");
        }
    }
    catch (JsonSyntaxException e) {
        IO.println("Erro ao tentar ler o CEP");
        IO.println(e.getMessage());
    }


}
