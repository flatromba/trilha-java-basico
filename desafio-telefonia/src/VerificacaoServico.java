import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        
        
        System.out.println("Digite o serviço a ser verificado");
        String servico = scanner.nextLine().trim();
        System.out.println("Digite o nome do cliente e os serviços contratados");
        String entradaCliente = scanner.nextLine().trim();           
        
        String[] partes = entradaCliente.split(",");
        boolean contratado=false;
        for (int i=0;i<partes.length;i++) {        	
            String nomeCliente = partes[i];
            if (servico.equalsIgnoreCase(nomeCliente)) {
                contratado=true;
                break;
            }
            
        }
        if (contratado==true)
            System.out.println("SIM");
        else    
            System.out.println("NÃO");     
    }        
}
