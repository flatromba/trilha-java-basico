package ExerciciosMap.Pesquisa.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    
    private Map<String, Integer> mapaDePalavras;

    public ContagemPalavras() {
        this.mapaDePalavras= new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.mapaDePalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!mapaDePalavras.isEmpty()) {
            if (mapaDePalavras.containsKey(palavra)) {
                mapaDePalavras.remove(palavra);
            }
        }
    } 

    public void exibirPalavras() {
        System.out.println(mapaDePalavras);
    }

    public int exibirContagem() {
        int contagemTotal= 0;
        for (int contagem: mapaDePalavras.values()) {
          contagemTotal+= contagem;
        }
        return contagemTotal;
      }

    public String encontrarPalavraFrequente() {
        String palavraFrequente=null;
        int maiorContagem=0;
        if (!mapaDePalavras.isEmpty()) {
            for (Map.Entry<String, Integer> entry: mapaDePalavras.entrySet()) {
                if (entry.getValue()>maiorContagem) {
                    maiorContagem=entry.getValue();
                    palavraFrequente=entry.getKey();
                }
            }
        }
        return palavraFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras palavra= new ContagemPalavras();
        palavra.adicionarPalavra("p1", 1);
        palavra.adicionarPalavra("p2", 2);
        palavra.adicionarPalavra("p3", 3);
        palavra.adicionarPalavra("p4", 4); 
        palavra.exibirPalavras();
        System.out.println("Existem "+palavra.exibirContagem()+" palavras");
        System.out.println(palavra.encontrarPalavraFrequente()+" é a palavra mais frequente");
    }
}
