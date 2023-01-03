package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<>();

    void addItem(String name, double price, int quantity){
        Produto produto = new Produto(name, price);
        Item item = new Item(quantity, produto);
        itens.add(item);
    }

    double getTotalValue() {
        double totalValue = 0.0;
        for (Item item: itens) {
            totalValue += item.quantity * item.produto.price;
        }
        return totalValue;
    }
}
