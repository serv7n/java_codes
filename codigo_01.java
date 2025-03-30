import java.util.Scanner;
public class codigo_01 {
    public static void main(String[] args){
        final Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        final String nome = scan.nextLine();
        // final =  const
        System.out.println("Ola " + nome);
    }
    
}