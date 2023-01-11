package streams;

public class Product {
    String name;
    double price;
    double discount;
    boolean freeShipment;

    public Product(String name, double price, double discount, boolean freeShipment) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.freeShipment = freeShipment;
    }
}
