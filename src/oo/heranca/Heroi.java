package oo.heranca;

import org.jetbrains.annotations.NotNull;

public class Heroi extends Jogador{
    public Heroi(int x, int y) {
        super(x, y);
    }

    public boolean atacar(@NotNull Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
