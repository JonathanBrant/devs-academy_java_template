public class Sanduiche extends Lanche{
    private String[] ingregientes = new String[10];

    public Sanduiche() {
        super.setTempoDePreparo(15);

    }

    public Sanduiche(double preco, int tempoDePreparo, int tempoDeEntrega, String[] ingregientes) {
        super(preco, tempoDePreparo, tempoDeEntrega);
        this.ingregientes = ingregientes;
    }

    public String[] getIngregientes() {
        return ingregientes;
    }

    public void setIngregientes(String[] ingregientes) {
        this.ingregientes = ingregientes;
    }



}
