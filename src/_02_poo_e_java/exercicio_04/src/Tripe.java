public class Tripe {
    private boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(int novaAltura) {
        this.alturaAtual = novaAltura;
    }

    public void dobrar() {
        dobrado = true;
    }

    public void desdobrar() {
        dobrado = false;
    }

    public boolean prontoParaGuardar() {
        if (dobrado == true && alturaAtual == alturaMinima) return true;

        else return false;
    }

    public void guardar() {
        if (prontoParaUsar()) {
            System.out.println("O tripé foi guardado");
        } else {
            System.out.println("O tripé não está pronto para ser guaradado");
        }
    }


    public boolean prontoParaUsar() {
        if (dobrado == false && this.alturaAtual > alturaMaxima / 2) return true;

        else return false;
    }

    public void usar() {
        if(prontoParaUsar()) {
            System.out.println("Tripé pronto para uso");
        }  else {
            System.out.println("Tripé nao esta  pronto para uso");
        }

    }


}
