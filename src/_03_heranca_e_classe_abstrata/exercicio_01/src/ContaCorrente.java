public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }




    public ContaCorrente(Cliente cliente, double chequeEspecial) {
        super(cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public void descontarCheque(Cheque cheque) {
        if(cheque.getValor() > 0) {
            super.setSaldo(super.getSaldo()+cheque.getValor());
            System.out.printf("Seu novo saldo é de R$%.2f %n", getSaldo());;
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("Seu saldo é de R$%.2f %n e seu cheque especial é de R$%.2f %n", getSaldo(), getChequeEspecial());
    }


    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de R$%.2f realizado com sucesso%n", valor);
        } else if (chequeEspecial >= valor) {
            chequeEspecial -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso(Utilizando o cheque especial)%n", valor);
        } else if (getSaldo() + chequeEspecial >= valor) {
            double resto = valor % getSaldo();
            setSaldo(0.0);
            chequeEspecial -= resto;
            System.out.printf("Saque de R$%.2f realizado com sucesso(Utilizando o saldo + cheque especial)%n", valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
