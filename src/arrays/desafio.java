package arrays;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        double total = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos notas deseja inserir? ");
        int notasQtd = entrada.nextInt();

        double[] notas = new double[notasQtd];

        for (int i = 0; i < notasQtd; i++) {
            System.out.print("Insira a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        for (double nota: notas) {
            total += nota;
        }

        double media = total / notasQtd;

        System.out.println("A média é: " + media);

        entrada.close();
    }
}
