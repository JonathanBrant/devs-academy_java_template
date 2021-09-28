public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Jonathan", "Brant", "555555", "546545");
        Cheque cheque = new Cheque(100, "Santander", "27/09/2021");

        ContaPoupanca conta = new ContaPoupanca(cliente);
        ContaCorrente conta01 = new ContaCorrente(cliente, 1000);

        /*
        conta.consultarSaldo();
        conta.depositar(500);
        conta.sacar(300);
        conta.recolherJuros();
        */


        conta01.descontarCheque(cheque);
        conta01.sacar(500);
        conta01.consultarSaldo();
    }



}
