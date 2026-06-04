package excecoes;

public class IdadeException extends RuntimeException {
    private String mensagem;

    public IdadeException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
