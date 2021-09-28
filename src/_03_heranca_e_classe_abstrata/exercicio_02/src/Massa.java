public class Massa extends Lanche{
    private String molho;

    public Massa() {
        super.setTempoDePreparo(30);
    }

    public Massa(double preco, int tempoDePreparo, int tempoDeEntrega, String molho) {
        super(preco, tempoDePreparo, tempoDeEntrega);
        this.molho = molho;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
}
