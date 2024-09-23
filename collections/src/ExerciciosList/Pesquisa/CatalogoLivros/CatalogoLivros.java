package ExerciciosList.Pesquisa.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> listaDeLivros;

    public CatalogoLivros() {
        this.listaDeLivros=new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicado) {
        listaDeLivros.add(new Livro(titulo, autor, anoPublicado));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livroAutor= new ArrayList<>();
        for (Livro livro: listaDeLivros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livroAutor.add(livro);
            }
        }
        return livroAutor;
    }

    public List<Livro> pesquisarIntervalo(int anoInicial, int anoFinal) {
        List<Livro> livroIntervalo= new ArrayList<>();
        for (Livro livro: listaDeLivros) {
            if (livro.getAnoPuplicado()>=anoInicial && livro.getAnoPuplicado()<=anoFinal) {
                livroIntervalo.add(livro);
            }
        }
        return livroIntervalo;
    }

    public Livro pesquisarTitulo(String titulo) {
        Livro livroTitulo= null;
        for (Livro livro: listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroTitulo=livro;
                break;
            }
            }
    return livroTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo= new CatalogoLivros();
        catalogo.adicionarLivro("titulo 1", "autor 1", 2010);
        catalogo.adicionarLivro("titulo 2", "autor 2", 2011);
        catalogo.adicionarLivro("titulo 3", "autor 2", 2012);
        catalogo.adicionarLivro("titulo 4", "autor 1", 2013);
        catalogo.adicionarLivro("titulo 5", "autor 3", 2014);
        System.out.println("\n\n");  
        
        System.out.println(catalogo.pesquisarAutor("autor 1"));
        System.out.println("\n\n");

        System.out.println(catalogo.pesquisarIntervalo(2010, 2015));
        System.out.println("\n\n");

        System.out.println(catalogo.pesquisarTitulo("titulo 1"));
    }
}

