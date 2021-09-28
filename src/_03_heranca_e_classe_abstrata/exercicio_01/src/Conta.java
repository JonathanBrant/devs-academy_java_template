public class Conta {
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Saque realizado no valor de R$%.2f %n", valor);
            System.out.printf("Seu novo saldo é de R$%.2f %n", saldo);
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito realizado no valor de R$%.2f %n", valor);
            System.out.printf("Seu novo saldo é de R$%.2f %n", saldo);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Seu saldo é de R$%.2f %n", saldo);
    }

}
