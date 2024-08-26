package edu.flavio.sintaxeJava;
import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int anoFabricacao= 2020;
        byte idade= 15;
        String cep= "03035070";
        double salario= 2500.00;
        long cpf= 44212354662L;
        float pi= 3.14F;
        boolean doadorDeOrgao= true;
        char sexo= 'M';
        Date dataDeNascimento= new Date();
        final int NUMERO=10;
        
        System.out.println(anoFabricacao);
        System.out.println(idade);
        System.out.println(cep);
        System.out.println(salario);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(doadorDeOrgao);
        System.out.println(sexo);
        System.out.println(dataDeNascimento);
        System.out.println(NUMERO);

    }
}
