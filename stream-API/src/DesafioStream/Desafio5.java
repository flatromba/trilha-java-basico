package DesafioStream;

import java.util.Arrays;
import java.util.List;

// Com a Stream API, calcule a 
// média dos números maiores que 5 e exiba o resultado no console.
public class Desafio5 {
    public static void main(String[] args) {    

        List<Integer> numeros = Arrays.asList(1, -2, -3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    long numerosMaiorCinco = numeros.stream().filter(n -> n > 5).count();
        int soma = numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum);
        System.out.println("A media é dos numeros maior que 5 " + soma/numerosMaiorCinco);
    }
}
