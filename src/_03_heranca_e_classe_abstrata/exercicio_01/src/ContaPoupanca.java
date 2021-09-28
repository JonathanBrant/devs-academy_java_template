public class ContaPoupanca extends Conta{
    private  double juros;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.juros = 0.05;
    }

    public void recolherJuros() {
        double rendimento = getSaldo() * this.juros;
        System.out.printf("Seu juros rendeu: RS%.2f %n", rendimento);
    }

}
