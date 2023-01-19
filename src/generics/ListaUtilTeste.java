package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLing1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLing1);

        Integer ultimaNum1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimaNum1);

        String ultimaLing2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLing2);

        Integer ultimaNum2 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimaNum2);
    }
}
