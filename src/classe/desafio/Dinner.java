package classe.desafio;

public class Dinner {
    public static void main(String[] args) {
        Person p1 = new Person(80.50, "Jorge");
        Food c1 = new Food(0.3, "Arroz", 1);
        Food c2 = new Food(0.150, "Feijão", 1);
        Food c3 = new Food(0.2, "Sorvete", 0);
        Exercise e1 = new Exercise(1, "Corrida");

        p1.comer(c1);
        System.out.printf("%s pesava %.2fkgs, depois comeu %.2f Kgs de %s e passou a pesar %.2fkgs",
                p1.name, p1.previousWeight, c1.weight, c1.name, p1.weight);

        p1.comer(c2);
        System.out.printf("%n%s pesava %.2fkgs, depois comeu %.2f Kgs de %s e passou a pesar %.2fkgs",
                p1.name, p1.previousWeight, c2.weight, c2.name, p1.weight);

        p1.comer(c3);
        System.out.printf("%n%s pesava %.2fkgs, depois comeu %.2f Kgs de %s e passou a pesar %.2fkgs",
                p1.name, p1.previousWeight, c3.weight, c3.name, p1.weight);

        p1.exercicio(e1);
        System.out.printf("%n%s pesava %.2fkgs, depois fez %s e perdeu %.2f e passou a pesar %.2fkgs",
                p1.name, p1.previousWeight, e1.exerciseName, e1.weightLost, p1.weight);
    }
}
