# Desafio de código

## Desafio em JAVA
```
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
```

## Desafio em C#
```
public class DesafioCodigoC# {
    public static void Main() {
        
        Console.WriteLine("Digite o valor do salário");
        float salarioBruto=Console.ReadLine();
        Console.WriteLine("Digite o valor dos benefícios");
        float beneficio=Console.ReadLine();

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
        Console.WriteLine("Valor recebido pelo funcionário foi: R$"+salarioRecebido");       
    }
}
```
## Desafio em JAVASCRIPT
```
print("Digite o valor do salário");
const salarioBruto=parseFloat(gets());
print("Digite o valor dos benefícios");
const  beneficio=parseFloat(gets());

const imposto=calcularImposto(salarioBruto);
const salarioRecebido=(salarioBruto-imposto)+beneficio;

print("Valor recebido pelo funcionário foi: R$"+salarioRecebido.toFixed(2));

function calcularImposto(salario) {
    let aliquota;
    if (salario>=0 && salario<=1100) {
        aliquota=0.05;
        }
        else if (salario>1100 && salario<=2500) {
            aliquota=0.1;
        }
        else {
            aliquota=0.15;
        }
        return aliquota*salario;
}
```
## Desafio em PYTHON
```
def calcular_imposto(salario):
    if (salario>=0 and salario<=1100):
        aliquota=0.05
    elif (salario>1100 and salario<=2500):
        aliquota=0.1
    else:
        aliquota=0.15
    return aliquota*salario

print("Digite o valor do salário")
salario_bruto=float(input())
print("Digite o valor dos benefícios")
beneficio=float(input())

imposto=calcular_imposto(salario)
salario_recebido=(salario_bruto-imposto)+beneficio
print("Valor recebido pelo funcionário foi: R$"{salario_recebido})
```
##Desafio em KOTLIN
```
object Objeto {
    fun calcularImposto(salario:Double): Double {
        val aliquota= when {
            (salario>=0 && salario<=1100)->0.05
            (salario>1100 && salario<=2500)->0.10
            else->0.15
        }
        return aliquota*salario
    }   
}

fun main() {
    println("Digite o valor do salário");
    val salarioBruto=readLine()!!.toDouble();
    prinln("Digite o valor dos benefícios");
    val beneficio=readLine()!!.toDouble();

    val imposto=Objeto.calcularImposto(salarioBruto);
    val salarioRecebido=(salarioBruto-imposto)+beneficio;
    println("Valor recebido pelo funcionário foi: R$",salarioRecebido);    
}
```








