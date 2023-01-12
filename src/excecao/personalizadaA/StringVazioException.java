package excecao.personalizadaA;

public class StringVazioException extends RuntimeException {

    private String nomeDoAtributo;
    public StringVazioException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio", nomeDoAtributo);
    }
}
