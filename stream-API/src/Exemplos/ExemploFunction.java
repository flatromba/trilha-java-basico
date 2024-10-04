package Exemplos;
// Function<T, R>: Representa uma função que aceita um argumento do tipo T e 
// retorna um resultado do tipo R.
// É utilizada para transformar ou mapear os elementos do Stream em 
// outros valores ou tipos.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExemploFunction {    
    public static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> dobro= numero -> numero*2;
        List<Integer> numeroDobrado= numeros.stream()
        .map(n -> n*2)
        .toList();

        numeroDobrado.forEach(System.out::println);
    }
}
