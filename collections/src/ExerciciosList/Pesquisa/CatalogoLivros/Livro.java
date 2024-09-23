package ExerciciosList.Pesquisa.CatalogoLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(String titulo, String autor, int anoPuplicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPuplicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPuplicado() {
        return anoPublicado;
    }

    public void setAnoPuplicado(int anoPuplicado) {
        this.anoPublicado = anoPuplicado;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + "\nAutor: " + autor + "\nAno publicado: " + anoPublicado;
    }   
}
