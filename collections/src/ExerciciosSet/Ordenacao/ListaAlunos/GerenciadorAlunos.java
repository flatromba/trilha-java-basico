package ExerciciosSet.Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    private Set<Aluno> conjuntoAlunos;

    public GerenciadorAlunos() {
        this.conjuntoAlunos=new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        conjuntoAlunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemovido= null;
        for (Aluno aluno: conjuntoAlunos) {
            if (aluno.getMatricula()==matricula) {
                alunoRemovido=aluno;
                break;
            }
        }
        conjuntoAlunos.remove(alunoRemovido);
    }

    public Set<Aluno> exibirAlunoPorNome() {
        Set<Aluno> exibirPorNome= new TreeSet<>(conjuntoAlunos);
        return exibirPorNome;
    }

    public Set<Aluno> exibirAlunoPorNota() {
        Set<Aluno> exibirPorNota= new TreeSet<>(conjuntoAlunos);
        conjuntoAlunos.addAll(exibirPorNota);
        return exibirPorNota;
    }

    public void exibirAlunos() {
        System.out.println(conjuntoAlunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos aluno= new GerenciadorAlunos();
        System.out.println("Alunos por nome: "+aluno.exibirAlunoPorNome());
        System.out.println("Aluno por nota: "+aluno.exibirAlunoPorNota());
        aluno.exibirAlunos();
        System.out.println("\n\n");

        aluno.adicionarAluno("Sara", 1, 10);
        aluno.adicionarAluno("Flavio", 2, 8);
        aluno.adicionarAluno("Madruga", 3, 8);
        aluno.adicionarAluno("Jorel", 4, 5);
        System.out.println("Alunos por nome: "+aluno.exibirAlunoPorNome());
        System.out.println("\n\n");
        System.out.println("Aluno por nota: "+aluno.exibirAlunoPorNota());
        System.out.println("\n\n");
        aluno.exibirAlunos();   
    }
}
