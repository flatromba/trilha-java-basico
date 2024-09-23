package ExerciciosMap.Ordenacao.LivrariaOnline;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LivrariaOnline {
    
    private Map<String, Livro> mapaDeLivros;

    public LivrariaOnline() {
        this.mapaDeLivros= new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        mapaDeLivros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!mapaDeLivros.isEmpty()) {
            mapaDeLivros.remove(titulo);
        }
    }    

    public Livro pesquisarLivrosPorAutor(String autor) {
        Livro livroPorAutor=null;
        if (!mapaDeLivros.isEmpty()) {
            for (Livro livro:  mapaDeLivros.values()) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor=livro;
                }
            }
        }
        return livroPorAutor;
    }

    public Livro exibirLivroMaisCaro() {
        Livro livroMaisCaro= null;
        double maiorPreco= Double.MIN_VALUE;
        if (!mapaDeLivros.isEmpty()) {
            for (Livro livro: mapaDeLivros.values()) {
                if (livro.getPreco()>maiorPreco) {
                    maiorPreco=livro.getPreco();
                    livroMaisCaro=livro;
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato= null;
        double menorPreco= Double.MAX_VALUE;
        if (!mapaDeLivros.isEmpty()) {
            for (Livro livro: mapaDeLivros.values()) {
                if (livro.getPreco()<menorPreco) {
                    menorPreco=livro.getPreco();
                    livroMaisBarato=livro;
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livro= new LivrariaOnline();
        livro.adicionarLivro("link 1", "titulo 1", "autor 1", 56.80);
        livro.adicionarLivro("link 2", "titulo 2", "autor 2", 67.90);
        livro.adicionarLivro("link 3", "titulo 3", "autor 1", 89.50);
        livro.adicionarLivro("link 4", "titulo 2", "autor 3", 70.00);
        livro.adicionarLivro("link 5", "titulo 4", "autor 4", 25.80);
        System.out.println("Livro mais barato: "+livro.exibirLivroMaisBarato());
        System.out.println("Livro mais caro: "+livro.exibirLivroMaisCaro());
        livro.removerLivro("titulo 4");
        livro.pesquisarLivrosPorAutor("autor 1");
        System.out.println("Livro mais barato: "+livro.exibirLivroMaisBarato());
        System.out.println("Livro mais caro: "+livro.exibirLivroMaisCaro());
    }
}
