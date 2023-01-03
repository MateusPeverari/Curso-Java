package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    final String name;
    final ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String name) {
        this.name = name;
    }

    void addPurchase(Compra compra) {
        compras.add(compra);
    }

    double getTotalSpent() {
        double totalSpent = 0.0;
        for (Compra compra: compras) {
            totalSpent += compra.getTotalValue();
        }
        return totalSpent;
    }
}
