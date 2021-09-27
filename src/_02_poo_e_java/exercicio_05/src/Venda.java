public class Venda {
    private double valorDaVenda;
    private Veiculo veiculoVendido;
    private Cliente cliente;

    public Venda(Cliente cliente, Veiculo veiculo, double valorDaVenda) {
        this.cliente =  cliente;
        this.veiculoVendido = veiculo;
        this.valorDaVenda = valorDaVenda;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public Veiculo getVeiculoVendido() {
        return veiculoVendido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "valorDaVenda=" + getValorDaVenda() +
                ", veiculoVendido=" + getVeiculoVendido().getModelo() +
                ", cliente=" + getCliente().getNome() +
                '}';
    }

}
