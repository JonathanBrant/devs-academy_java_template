public abstract class Lanche {
    private double preco;
    private int tempoDePreparo;
    private int tempoDeEntrega;

    public Lanche() {
        this.preco=0.0;
        this.tempoDePreparo = 0;
        this.tempoDeEntrega = 0;
    }

    public Lanche(double preco, int tempoDePreparo, int tempoDeEntrega) {
        this.preco = preco;
        this.tempoDePreparo = tempoDePreparo;
        this.tempoDeEntrega = tempoDeEntrega;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public int getTempoDeEntrega() {
        return tempoDeEntrega;
    }

    public void setTempoDeEntrega(int tempoDeEntrega) {
        this.tempoDeEntrega = tempoDeEntrega;
    }

    public void calcularTempoDeEntrega(int distancia) {
        this.setTempoDeEntrega(distancia * 10);
    }

}
