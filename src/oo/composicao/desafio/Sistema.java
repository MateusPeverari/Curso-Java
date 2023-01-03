package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.addItem("Teclado Mecânico", 399.00, 3);
        compra1.addItem("Monitor", 899.00, 1);

        Compra compra2 = new Compra();
        compra2.addItem("Notebook", 1999.99, 1);
        compra2.addItem("Mouse", 99.00, 4);

        Cliente cliente1 = new Cliente("Mateus");
        cliente1.addPurchase(compra1);
        cliente1.addPurchase(compra2);

        System.out.println("Valor compra 1: " + compra1.getTotalValue());
        System.out.println("Valor compra 2: " + compra2.getTotalValue());

        System.out.printf("O cliente %s gastou %.2f em nossa loja.",
                cliente1.name, cliente1.getTotalSpent());
    }
}
