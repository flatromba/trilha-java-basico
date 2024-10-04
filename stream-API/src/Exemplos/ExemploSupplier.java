package Exemplos;
//Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T,
//é comumente usada para criar ou fornecer novos objetos de um determinado tipo.

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSupplier {
    
    public static void main(String[] args) {        
        Supplier<String> saudacao= () -> "Olá";

        List<String> listaSaudacao = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());

        listaSaudacao.forEach(System.out::println);
    }
}
