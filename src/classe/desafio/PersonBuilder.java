package classe.desafio;

public class PersonBuilder {
    private double weight;
    private String name;

    public PersonBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Person createPerson() {
        return new Person(weight, name);
    }
}