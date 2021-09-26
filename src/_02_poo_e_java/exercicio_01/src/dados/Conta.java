package dados;

public class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta() {
        this.setNumero("");
        this.setSaldo(0);
        this.setTitular(null);
    }

    public Conta(String numero) {
        this.setNumero(numero);
        this.setSaldo(0);
        this.setTitular(null);
    }

    public Conta(String numero, Cliente titular) {
        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // depositar 100.00  => // valor: 100.00
    public void depositar(double valor) {
        //getSaldo(): //saldo: 100.00
        //valor: 100.00
        //setSaldo(100.00+100.00)
        //novo valor de saldo: 200.00
        if (valor > 0) {
            System.out.println("Saldo atual .....: " + getSaldo());
            System.out.println("Valor a depositar: " + valor);
            this.setSaldo(getSaldo() + valor);
            System.out.println("Novo saldo ......: " + getSaldo());
        } else {
            System.out.println("Valor invalido, digite um valor positivo");
        }
    }

    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            System.out.println("Saldo atual: " + getSaldo());
            System.out.println("Saldo a sacar: " + valor);
            this.setSaldo(getSaldo() - valor);
            System.out.println("Novo saldo...: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

