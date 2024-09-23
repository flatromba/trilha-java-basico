package ExerciciosSet.OperacoesBasicas.ConjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras= new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (conjuntoPalavras.contains(palavra)) {
            conjuntoPalavras.remove(palavra);
        }
        else {
            System.out.println("A palavra "+palavra+" não foi removida pois não foi encontrada");
        }        
    }

    public void verificarPalavra(String palavra) {
        if (conjuntoPalavras.contains(palavra)) {
            System.out.println("A palavra "+palavra+" foi encontrada");  
        }         
        else {            
            System.out.println("A palavra "+palavra+" não foi encontrada");
        }        
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavras);
    }

    @Override
    public String toString() {
        return "\n"+conjuntoPalavras;
    }    

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto= new ConjuntoPalavrasUnicas();
        conjunto.exibirPalavrasUnicas();
        System.out.println("\n\n");

        conjunto.adicionarPalavra("celular");
        conjunto.adicionarPalavra("cinzeiro");
        conjunto.adicionarPalavra("oculos");
        conjunto.exibirPalavrasUnicas();
        System.out.println("\n\n");

        conjunto.removerPalavra("oculos");
        conjunto.verificarPalavra("celular");
        System.out.println("\n\n");

        conjunto.removerPalavra("isqueiro");
        conjunto.verificarPalavra("caneta");
        System.out.println("\n\n");

        conjunto.exibirPalavrasUnicas();
    }
}
