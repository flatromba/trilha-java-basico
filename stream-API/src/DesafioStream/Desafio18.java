package DesafioStream;

import java.util.List;
import java.util.Arrays;

// Utilizando a Stream API, verifique se todos os números da 
// lista são iguais e exiba o resultado no console.
public class Desafio18 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, -2, -3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosIguais= numeros.stream().noneMatch(n -> n.equals(n));

        System.out.println("Numeros iguais: "+numerosIguais);
    }
}
