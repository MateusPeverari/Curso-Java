package oo.heranca;

import org.jetbrains.annotations.NotNull;

public class Jogador {

    int vida = 100;
    int x;
    int y;

    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void andar(@NotNull Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
            case SUL:
                y++;
                break;
        }
    }

    public boolean atacar(@NotNull Jogador oponente) {
        int deltaX = Math.abs(this.x - oponente.x);
        int deltaY = Math.abs(this.y - oponente.y);

        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }
}
