package classe.desafio;

public class Person {
    double weight;
    double previousWeight;
    String name;

    Person(double weight, String name) {
        this.weight = weight;
        previousWeight = weight;
        this.name = name;
    }

    void comer(Food c) {
        if (c.type == 0) {
            previousWeight = this.weight;
            this.weight += c.weight;
        } else {
            previousWeight = this.weight;
            this.weight += c.weight / 2;
        }

    }

    void exercicio(Exercise e) {
        previousWeight = this.weight;
        this.weight -= e.weightLost;
    }
}
