package carro;

public class carro1 {

    String marca;
    String modelo;
    int ano;
    int velocidade = 0;

    void acelerar(int valor) {
        velocidade += valor;
        System.out.println("O carro acelerou para " + velocidade + " km/h.");
    }

    void desacelerar(int valor) {
        if (velocidade - valor >= 0) {
            velocidade -= valor;
        } else {
            velocidade = 0;
        }
        System.out.println("O carro reduziu para " + velocidade + " km/h.");
    }
}
