package classe.desafio;

import org.jetbrains.annotations.NotNull;

public class Dinner {
    public static void main(String[] args) {
        Person p1 = new Person(80.50, "Jorge");
        Food c1 = new Food(0.3, "Arroz", 1);
        Food c2 = new Food(0.150, "Feijão", 1);
        Food c3 = new Food(0.2, "Sorvete", 0);
        Exercise e1 = new Exercise(1, "Corrida");

        p1.comer(c1);
        Dinner.foodFormattedOutput(p1, c1);

        p1.comer(c2);
        Dinner.foodFormattedOutput(p1, c2);

        p1.comer(c3);
        Dinner.foodFormattedOutput(p1, c3);

        p1.exercicio(e1);
        exerciseFormattedOutput(p1, e1);

    }

    private static void foodFormattedOutput(@NotNull Person p1, @NotNull Food c1) {
        System.out.printf("%s pesava %.2fkgs, depois comeu %.2f Kgs de %s e passou a pesar %.2fkg%n",
                p1.name, p1.previousWeight, c1.weight, c1.name, p1.weight);
    }

    private static void exerciseFormattedOutput(@NotNull Person p1, @NotNull Exercise e1) {
        System.out.printf("%s pesava %.2fkgs, depois fez %s e perdeu %.2f e passou a pesar %.2fkgs%n",
                p1.name, p1.previousWeight, e1.exerciseName, e1.weightLost, p1.weight);
    }
}
