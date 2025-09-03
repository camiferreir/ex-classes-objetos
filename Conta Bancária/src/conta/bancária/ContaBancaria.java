package conta.bancária;

class ContaBancaria {

    String titular;
    String numeroConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
