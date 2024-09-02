import java.util.Scanner;

public class VerificacaoCombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os serviços contratados");
        String input = scanner.nextLine();
        String[] servicosContratados = input.split(",");
        String resultado = verificarComboCompleto(servicosContratados);
        System.out.println(resultado);
        scanner.close();
    }

    public static String verificarComboCompleto(String[] servicosContratados) {
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;    
        boolean movelContratado=false;

        for (String servico : servicosContratados) {
            if ("movel".equalsIgnoreCase(servico))
                movelContratado=true;
            if ("banda larga".equalsIgnoreCase(servico))
                bandaLargaContratada=true;
            if ("tv".equalsIgnoreCase(servico))
                tvContratada=true;
            }

            if (movelContratado==true && bandaLargaContratada==true && tvContratada==true) {
                return "Combo Completo";
            } else {
                return "Combo Incompleto";
            }
        }
    
}
