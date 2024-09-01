import java.util.Scanner;

public class DesafioCodigoJava {
    public static void main(String[] args) throws Exception {

        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o valor do salário");
        float salarioBruto=entrada.nextFloat();
        System.out.println("Digite o valor dos benefícios");
        float beneficio=entrada.nextFloat();

        float imposto;
        if (salarioBruto>=0 && salarioBruto<=1100) {
            imposto=salarioBruto*0.05F;            
        }
        else if (salarioBruto>1100 && salarioBruto<=2500) {
            imposto=salarioBruto*0.1F;
        }
        else {
            imposto=salarioBruto*0.15F;
        }
        float salarioRecebido=(salarioBruto-imposto)+beneficio;
        System.out.println("Valor recebido pelo funcionário foi: R$"+salarioRecebido);        
    }
}
