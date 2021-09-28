public class Exercicio05 {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("AUDI", "RS6", 2021, "Preto", 0);
        Cliente jonathan = new Cliente("Jonathan", "Brant", "jonathan@brant.com");
        Venda venda = new Venda(jonathan, veiculo, 1000000.00);

        Veiculo  veiculo1  = new Veiculo("PORSCHE", "PANAMERA", 2020, "Branco",  10000);
        Venda venda1 =  new Venda(jonathan, veiculo1, 500000.00);
        Concessionaria concessionaria = new Concessionaria();

       concessionaria.registrarVenda(venda);
       concessionaria.registrarVenda(venda1);
    }
}
