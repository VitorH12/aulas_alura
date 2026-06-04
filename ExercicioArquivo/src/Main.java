//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {
    try {
        File file = new File("C:\\Users\\Vitor\\Projetos Java\\ExercicioArquivo\\filmes.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            IO.println(linha);
        }
        sc.close();
    }
    catch(IOException e){
        IO.println("Erro ao escrever os dados do filme no arquivo");
        e.printStackTrace();
    }
}

