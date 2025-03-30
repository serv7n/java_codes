import java.util.Scanner;

public class codigo_03 {
    public static void main(String[] args) {
        System.out.println("Digite um numero entre 1 e 10");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        switch (numero) {
            case 1:
                System.out.println("O seu numero e 1");
                break;
            case 2:
                System.out.println("O seu numero e 2");
                break;
            case 3:
                System.out.println("O seu numero e 3");
                break;
            case 4:
                System.out.println("O seu numero e 4");
                break;
            case 5:
                System.out.println("O seu numero e 5");
                break;
            case 6:
                System.out.println("O seu numero e 6");
                break;
            case 7:
                System.out.println("O seu numero e 7");
                break;
            case 9:
                System.out.println("O seu numero e 9");
                break;
            case 10:
                System.out.println("O seu numero e 10");
                break;

            default:
                System.out.println("O seu numero e INVALIDO");

                break;
        }
    }
}
