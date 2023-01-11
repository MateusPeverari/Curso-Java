package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        Consumer<Integer> print = System.out::println;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> invertString =
                s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binaryToInteger =
                s -> Integer.parseInt(s, 2);


        nums.stream()
                .map(Integer::toBinaryString)
                .map(invertString)
                .map(binaryToInteger)
                .forEach(print);
    }
}
