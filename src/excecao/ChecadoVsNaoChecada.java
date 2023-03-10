package excecao;

public class ChecadoVsNaoChecada {

    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            e.getMessage();
        }

        System.out.println("FIM");
    }
    static void geraErro1() {
        //Exceção Não checada ou não verificada
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }

    //Exceção checada ou verificada
    static void geraErro2() throws  Exception {
        throw new Exception("Ocorreu um erro bem legal #02");
    }
}
