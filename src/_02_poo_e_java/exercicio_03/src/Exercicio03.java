public class Exercicio03 {

    public static void main(String[] args) {
        Atleta atleta01 = new Atleta();
        atleta01.setNome("Fulano");
        atleta01.setNivel(10);
        atleta01.setEnergia(100);
        Atleta atleta02 = new Atleta();
        atleta02.setNome("Ciclano");
        atleta02.setNivel(5);
        atleta02.setEnergia(40);


        Prova prova01 = new Prova();
        prova01.setEnergiaNecessaria(30);
        prova01.setDificuldade(4);
        Prova prova02 = new Prova();
        prova02.setEnergiaNecessaria(40);
        prova02.setDificuldade(6);
        Prova prova03 = new Prova();
        prova03.setEnergiaNecessaria(80);
        prova03.setDificuldade(10);

        System.out.println(prova01.podeRealizar(atleta01));
        System.out.println(prova01.podeRealizar(atleta02));

        System.out.println(prova02.podeRealizar(atleta01));
        System.out.println(prova02.podeRealizar(atleta02));

        System.out.println(prova03.podeRealizar(atleta01));
        System.out.println(prova03.podeRealizar(atleta02));


    }
}
