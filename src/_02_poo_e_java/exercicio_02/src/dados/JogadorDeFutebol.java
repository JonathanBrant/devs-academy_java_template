package dados;

public class JogadorDeFutebol {
    // Atributos da classe JogadorDeFutebol
    // Privados, encapsulados
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    // Construtor da classe JogadorDeFutebol
    public JogadorDeFutebol() {
        this.setNome("");
        this.setEnergia(0);
        this.setAlegria(0);
        this.setGols(0);
        this.setExperiencia(0);
    }

    // Getters e Setters da classe JogadorDeFutebol
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    // Exercício 03
    public void fazerGol() {
        // tire 5 pontos de energia
        this.setEnergia(getEnergia()-5);
        // dê 10 pontos de alegria
        this.setAlegria(getAlegria()+10);
        // aumentar o número de gols em 1.
        this.setGols(getGols()+1);
        // imprimir “GOOOOL!” na tela.
        System.out.println("GOOOOL!");
    }

    // Exercício 03
    public void correr() {
        // tire 10 pontos de energia
        this.setEnergia(getEnergia()-10);
        // imprimir na tela: “Cansei”.
        System.out.println("Cansei");
    }
}
