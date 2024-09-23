package ExerciciosList.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> listaDeNumeros;

    public SomaNumeros() {
        this.listaDeNumeros= new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaDeNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma= 0;
        for (Integer numero: listaDeNumeros) {
            soma+=numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero=Integer.MIN_VALUE;
        for (Integer numero: listaDeNumeros) {
            if (numero>maiorNumero) {
            maiorNumero=numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero=Integer.MAX_VALUE;
        for (Integer numero: listaDeNumeros) {
            if (numero<menorNumero) {
                menorNumero=numero;
            }
        }
        return menorNumero;
    } 
    
    public void exibirNumeros() {
        System.out.println(listaDeNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros numeros=new SomaNumeros();
        numeros.exibirNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(12);   
        numeros.exibirNumeros();

        System.out.println("Maior número da lista: "+numeros.encontrarMaiorNumero());

        System.out.println("Menor número da lista: "+numeros.encontrarMenorNumero());

    }
}
