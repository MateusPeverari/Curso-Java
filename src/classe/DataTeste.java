package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.imprimirDataFormatada();

        Data data2 = new Data(10, 10, 1999);
        data2.imprimirDataFormatada();
    }
}
