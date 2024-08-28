import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nome;
        double saldo;

        Scanner entrada=new Scanner(System.in);

        System.out.println("Digite o número da sua conta");
        numeroConta=entrada.nextInt();
        System.out.println("Digite o número da sua agência, com dígito se existir");
        agencia=entrada.next();
        System.out.println("Digite seu nome completo");
        nome=entrada.next();
        System.out.println("Digite o valor da transferência");
        saldo=entrada.nextDouble();

        System.out.println("Olá "+nome+" obrigado por criar uma conta em nosso banco!");
        System.out.println("Dados da conta\n\n\nagência: "+agencia+"\nconta: "+numeroConta+"\nsaldo: R$="+saldo+" disponível para saque");
    }
}
