package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductTest {
    public static void main(String[] args) {
        Predicate<Product> checkDiscount = p -> p.discount >= 0.3;
        Predicate<Product> checkFreeShipment = p -> p.freeShipment;
        Function<Product, String> outputMessage =
                p -> "Oportunidade: " + p.name + " por somente R$" + p.price + " e FRETE GRÁTIS!";

        Product p1 = new Product("Keyboard", 600.00, 0.4, true);
        Product p2 = new Product("Laptop", 2500.00, 0.5, false);
        Product p3 = new Product("Mouse", 300.00, 0.3, true);
        Product p4 = new Product("Mousepad", 60.00, 0.1, true);

        List<Product> products = Arrays.asList(p1, p2, p3, p4);
        products.stream()
                .filter(checkDiscount)
                .filter(checkFreeShipment)
                .map(outputMessage)
                .forEach(System.out::println);

    }
}
