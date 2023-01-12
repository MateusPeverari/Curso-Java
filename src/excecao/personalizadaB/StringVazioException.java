package excecao.personalizadaB;

public class StringVazioException extends Exception {

    private String nomeDoAtributo;
    public StringVazioException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio", nomeDoAtributo);
    }
}
