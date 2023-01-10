package lambdas;

import java.util.function.*;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Ipad", 3235.89, 0.13);

        Function<Produto, Double> realPrice =
            produto -> {
                Double finalPrice = produto.preco * (1 - produto.desconto);
                return finalPrice;
            };
        System.out.println(realPrice.apply(p));

        UnaryOperator<Double> priceWithTax =
                price -> price >= 2500 ? price * (1 + 0.085) : price;
        System.out.println(priceWithTax.apply(p.preco));

        UnaryOperator<Double> priceWithDelivery =
                price -> price >= 3000 ? price + 100 : price + 50;
        System.out.println(priceWithDelivery.apply(p.preco));

        Function<Double, String> formatPrice =
                price -> {
                    String formattedPrice = String.format("%.2f", price);
                    return ("R$" + formattedPrice).replace(".", ",");
                };
        System.out.println(formatPrice.apply(p.preco));

        String finalPrice = realPrice
                .andThen(priceWithTax)
                .andThen(priceWithDelivery)
                .andThen(formatPrice)
                .apply(p);

        System.out.println("O preço final é: " + finalPrice);

    }
}
