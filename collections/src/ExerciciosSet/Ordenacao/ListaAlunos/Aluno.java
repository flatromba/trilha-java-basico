package ExerciciosSet.Ordenacao.ListaAlunos;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    
    private String nome;
    private long matricula;
    private double media;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    
    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public String toString() {
        return "\nAluno: "+nome+"\nMatricula: "+matricula+"\nMédia: "+media;
    }
    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }    
}

class CompararPorMedia implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getMedia(), aluno2.getMedia());
    }
    
}