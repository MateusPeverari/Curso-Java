package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios() {

    }

    public final static UnaryOperator<String> maiuscula =
            n -> n.toUpperCase();
    public final static UnaryOperator<String> primeraLetra =
            n -> n.charAt(0) + "";
    public static String grito(String n) {
       return n + "!!!   ";
    }
}
