package oo.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari(300);
        Carro civic = new Civic(197);

        ferrari.velocidadeAtual = 100;
        civic.velocidadeAtual = 50;


        civic.acelerar();
        civic.acelerar();
        civic.frear();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.frear();

        System.out.println(ferrari.velocidadeAtual);
        System.out.println(civic.velocidadeAtual);


    }
}
