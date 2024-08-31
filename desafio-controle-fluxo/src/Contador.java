import java.util.Scanner;
public class Contador {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = entrada.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = entrada.nextInt();
		
		try {
			contar(parametroUm, parametroDois);			
        }
        catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
	}
		
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm>parametroDois) {
            throw new ParametrosInvalidosException();
        }        
        else {
            int contagem = (parametroDois - parametroUm);
            for (int i=1;i<=contagem;i++) {
                System.out.println("Imprimindo número "+i); 
            }  
        }
    }
}

