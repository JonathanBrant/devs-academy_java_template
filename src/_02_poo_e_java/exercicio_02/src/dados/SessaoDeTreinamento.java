package dados;

import dados.JogadorDeFutebol;

// Exercicio 04
public class SessaoDeTreinamento {
    private int experiencia;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public SessaoDeTreinamento() {
        this.setExperiencia(0);
    }

    public void treinar(JogadorDeFutebol jogador) {
        // Como é um treinamento, o jogador precisa:
        // Correr
        // Fazer um Gol
        // Correr
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        // imprimir a experiência inicial
        System.out.println("Experiência atual: " + jogador.getExperiencia());
        //somando um ponto na experiência
        jogador.setExperiencia(jogador.getExperiencia()+1);
        // experiência final do jogador
        System.out.println("Experiência atual: " + jogador.getExperiencia());
    }
}
