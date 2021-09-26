package principal;

import dados.JogadorDeFutebol;
import dados.SessaoDeTreinamento;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // criar dois jogadores de futebol
        JogadorDeFutebol Ronaldinho = new JogadorDeFutebol();
        JogadorDeFutebol Garrincha = new JogadorDeFutebol();

        // configurando os atributos
        Ronaldinho.setNome("Ronaldinho");
        Ronaldinho.setEnergia(100);

        // configurando os atributos
        Garrincha.setNome("Garrincha");
        Garrincha.setEnergia(100);

        // criar uma sessão de treinamento
        SessaoDeTreinamento treino = new SessaoDeTreinamento();

        //dois jogadores devem realizar um treinamento
        System.out.println(Ronaldinho.getNome());
        treino.treinar(Ronaldinho);
        System.out.println(Garrincha.getNome());
        treino.treinar(Garrincha);
    }
}
