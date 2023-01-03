package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número de alunos: ");
        int numAlunos = entrada.nextInt();

        System.out.print("Informe o número de notas: ");
        int numNotas = entrada.nextInt();

        double[][] notas = new double[numAlunos][numNotas];
        double total = 0.0;


        for (int i = 0; i < numAlunos; i++) {
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Informe a nota " + (j +1) + " do aluno " + (i +1) + ": ");
                notas[i][j] = entrada.nextDouble();
                total += notas[i][j];
            }
        }

        double media = total / (numNotas * numAlunos);

        System.out.println("A média é: " + media);
        entrada.close();
    }
}
