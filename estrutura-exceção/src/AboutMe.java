import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura em m");
        double altura = scanner.nextDouble();
        
        System.out.println("Me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("minha altura \u00e9 " + altura + " m");
        scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}


