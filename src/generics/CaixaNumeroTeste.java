package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(4.0);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(32);
    }
}
