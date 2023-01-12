package classe.desafio;

public class FoodBuilder {
    private double weight;
    private String name;
    private int type;

    public FoodBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public FoodBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FoodBuilder setType(int type) {
        this.type = type;
        return this;
    }

    public Food createFood() {
        return new Food(weight, name, type);
    }
}