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

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public Veiculo getVeiculoVendido() {
        return veiculoVendido;
    }

    public void setVeiculoVendido(Veiculo veiculoVendido) {
        this.veiculoVendido = veiculoVendido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
