public class Concessionaria {

    Venda[] registroDeVendas = new Venda[2];
    int numeroDeVendas = 0;

    public void registrarVenda(Venda venda) {
        registroDeVendas[numeroDeVendas] = new Venda(venda.getCliente(), venda.getVeiculoVendido(), venda.getValorDaVenda());
        numeroDeVendas++;
        for (Venda vendas : registroDeVendas) {
            System.out.println(vendas);
        }
    }
}
