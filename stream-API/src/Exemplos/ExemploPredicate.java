package Exemplos;
// Predicate<T>: Representa uma função que aceita um argumento do tipo T 
// e retorna um valor booleano (verdadeiro ou falso).
// É comumente usada para filtrar os elementos do Stream com base em alguma condição.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {       
    
    List<String> palavras= Arrays.asList("um","dois","tres","quatro","cinco");

    Predicate<String> maisDe4Caracteres= palavra -> palavra.length() >4;

    palavras.stream().filter(maisDe4Caracteres).forEach(System.out::println);
    }
}
