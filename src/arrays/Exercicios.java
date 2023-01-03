package arrays;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        double media = (notasAlunoA[0] + notasAlunoA[1]) / 2;
        notasAlunoA[2] = media;

        System.out.println(Arrays.toString(notasAlunoA));

        int total = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            total += notasAlunoA[i];
        }

        System.out.println(total);
    }
}
