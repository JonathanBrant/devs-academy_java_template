public class Exercicio05 {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("AUDI", "RS6", 2021, "Preto", 0);
        Cliente jonathan = new Cliente("Jonathan", "Brant", "jonathan@brant.com");
        Venda venda = new Venda(jonathan, veiculo, 1000000);
        Concessionaria concessionaria = new Concessionaria();

       concessionaria.registrarVenda(venda);
    }
}
