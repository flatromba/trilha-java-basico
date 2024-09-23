package ExerciciosMap.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> mapaDePalavras;

    public Dicionario() {
        this.mapaDePalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao) {
        mapaDePalavras.put(palavra, descricao);
    }

    public void removerPalavra(String palavra) {
        if (!mapaDePalavras.isEmpty()) {
            mapaDePalavras.remove(palavra);
        }                
    }

    public void exibirPalavras() {
        System.out.println(mapaDePalavras);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada= null;
        if (!mapaDePalavras.isEmpty()) {
            palavraPesquisada=mapaDePalavras.get(palavra);
        }
        return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario palavra= new Dicionario();
        palavra.exibirPalavras();
        System.out.println("\n\n");

        palavra.adicionarPalavra("bonito", "adjetivo");
        palavra.adicionarPalavra("nome", "substantivo");
        palavra.exibirPalavras();
        System.out.println("\n\n");

        palavra.adicionarPalavra("o", "pronome");
        System.out.println(palavra.pesquisarPorPalavra("nome"));

        palavra.removerPalavra("bonito");
        palavra.exibirPalavras();
    }
}
