public class Concessionaria {
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    private Venda venda;

    public Concessionaria(Venda venda) {
        this.venda = venda;
    }

    public void registrarVenda(Venda venda) {
        System.out.println("Veiculo " + venda.getVeiculoVendido() + " vendido ao cliente "
                + venda.getCliente() + " no valor de " + venda.getValorDaVenda() );
    }
}
