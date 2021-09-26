package principal;

import dados.Cliente;
import dados.Conta;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // Conta novaConta = new Conta();
        // novaConta.depositar(100);
        // novaConta.sacar(70);

        Cliente newCliente = new Cliente("Jonathan", "Brant");
        Cliente newCliente2 = new Cliente("Sara", "Louzada");
        Conta novaContaCompleta = new Conta("123456", newCliente);
        Conta novaContaCompleta2 = new Conta("654321", newCliente2);

        novaContaCompleta.depositar(9000);
        novaContaCompleta.sacar(500);

        novaContaCompleta2.depositar(20000);
        novaContaCompleta2.sacar(1000);






    }
}
