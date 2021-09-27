public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta) {
        if (atleta.getEnergia() >= this.getEnergiaNecessaria() && atleta.getNivel() >= this.getDificuldade()) return true;
        else return false;
    }
}
