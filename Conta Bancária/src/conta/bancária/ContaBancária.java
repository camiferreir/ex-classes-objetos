
package conta.bancária;


public class ContaBancária {

    public static void main(String[] args) {
     ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Camille";
        conta1.numeroConta = "12345-6";
        conta1.saldo = 500;

        conta1.depositar(200);
        conta1.sacar(100);
        conta1.exibirSaldo();
    }
    
}
