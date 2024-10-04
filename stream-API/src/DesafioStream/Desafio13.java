package DesafioStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Utilize a Stream API para filtrar os números que estão dentro de um intervalo 
// específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
public class Desafio13 {
    public static void main(String[] args) {   

        List<Integer> numeros = Arrays.asList(1, -2, -3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Predicate<Integer> numeroIntervalo= numero -> numero>5 && numero<10;

        numeros.stream().filter(numeroIntervalo).forEach(System.out::println);
    }
}
