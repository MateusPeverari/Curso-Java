package oo.heranca.desafio;

public class Ferrari extends Carro{
    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
}
