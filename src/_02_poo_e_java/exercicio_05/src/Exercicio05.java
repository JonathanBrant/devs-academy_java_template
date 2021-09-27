public class Exercicio05 {
    public static void main(String[] args) {
        Veiculo audi = new Veiculo("AUDI", "RS6", 2021, "Preto", 0);
        Cliente jonathan = new Cliente("Jonathan", "Brant", "jonathan@brant.com");
        Venda venda = new Venda(jonathan, audi, 1000000);
        Concessionaria audiRJ = new Concessionaria(venda);


        audiRJ.registrarVenda(venda);

    }
}
