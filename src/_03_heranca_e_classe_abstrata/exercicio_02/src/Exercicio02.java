import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

       do{
            System.out.println("Menu Delivery");
            System.out.println("[1] Sanduiches");
            System.out.println("[2] Massas ");
            System.out.println("[3] Bolos");
           System.out.println("[4] Sair do sistema");
            System.out.println("Digite a sua opção: ");

            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção escolhida: sanduíche");

                    break;
                case 2:
                    System.out.println("Opção escolhida: massas");
                    System.out.println("Escolha o tipo de massa");
                    System.out.println("[1] Pizza");
                    System.out.println("[2] Lasanha ");
                    System.out.println("[3] Macarrão");
                    Scanner scanner1 = new Scanner(System.in);
                    int opcao1 = scanner1.nextInt();
                    switch (opcao1) {
                        case 1:
                            System.out.println("Opção escolhida: Pizza");
                            break;
                        case 2:
                            System.out.println("Opção escolhida: Lasanha");
                            break;
                        case 3:
                            System.out.println("Opção escolhida: Macarrão");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Opção escolhida: bolo");
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }while (true);
    }
}
