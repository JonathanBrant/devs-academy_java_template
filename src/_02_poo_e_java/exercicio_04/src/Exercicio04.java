public class Exercicio04 {
    public static void main(String[] args) {
        Tripe tripe = new Tripe();

        tripe.setDobrado(false);
        tripe.setAlturaMaxima(80);
        tripe.setAlturaMinima(50);
        tripe.setAlturaAtual(65);

        tripe.usar();
        tripe.dobrar();
        tripe.usar();
        System.out.println(tripe.isDobrado());
        tripe.definirAltura(50);
        tripe.prontoParaGuardar();
        tripe.guardar();




    }
}
