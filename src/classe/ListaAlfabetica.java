package classe;

import java.util.Arrays;

public class ListaAlfabetica {
    public static void main(String[] args) {
        String[] foods = new String[]{"arroz", "Sorvete", "Batata", "banana", "Feijão", "Macarrão", "Carne", "Frango"};
        for (int i = 0; i < foods.length; i++) {
            String firstLetter = foods[i].substring(0,1).toUpperCase();
            String word = foods[i].substring(1);
            foods[i] = firstLetter + word;
        }

        Arrays.sort(foods);

        String previousLetter = null;
        for (String food:foods) {
            String firstLetter = food.substring(0,1).toUpperCase();
            if (!firstLetter.equals(previousLetter)) {
                previousLetter = firstLetter;
                System.out.println("\n" + firstLetter);
            }
            System.out.println(food);
        }
    }
}
