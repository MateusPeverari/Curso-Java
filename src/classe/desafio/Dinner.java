package classe.desafio;

public class Dinner {
    public static void main(String[] args) {
        Person p1 = new PersonBuilder()
                .setWeight(80.50)
                .setName("Jorge")
                .createPerson();

        Food c1 = new FoodBuilder()
                .setWeight(0.3)
                .setName("Arroz")
                .setType(1)
                .createFood();

        Food c2 = new FoodBuilder()
                .setWeight(0.150)
                .setName("Feijão")
                .setType(1)
                .createFood();

        Food c3 = new FoodBuilder()
                .setWeight(0.2)
                .setName("Sorvete")
                .setType(0).
                createFood();

        Exercise e1 = new ExerciseBuilder()
                .setWeightLost(1)
                .setExerciseName("Corrida")
                .createExercise();

        p1.comer(c1);
        Dinner.foodFormattedOutput(p1, c1);

        p1.comer(c2);
        Dinner.foodFormattedOutput(p1, c2);

        p1.comer(c3);
        Dinner.foodFormattedOutput(p1, c3);

        p1.exercicio(e1);
        exerciseFormattedOutput(p1, e1);

    }

    private static void foodFormattedOutput(Person p1,Food c1) {
        System.out.printf("%s pesava %.2fkgs, depois comeu %.2f Kgs de %s e passou a pesar %.2fkg%n",
                p1.name, p1.previousWeight, c1.weight, c1.name, p1.weight);
    }

    private static void exerciseFormattedOutput( Person p1, Exercise e1) {
        System.out.printf("%s pesava %.2fkgs, depois fez %s e perdeu %.2f e passou a pesar %.2fkgs%n",
                p1.name, p1.previousWeight, e1.exerciseName, e1.weightLost, p1.weight);
    }
}
