package carro;

public class Carro {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        carro1.acelerar(50);
        carro1.desacelerar(20);
    }
    private String marca;
    private String modelo;
    private int ano;

    private void acelerar(int i) {

    }

    private void desacelerar(int i) {

    }

}
