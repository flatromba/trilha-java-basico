package ExerciciosList.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    
    private List<Pessoa> listaDePessoas;

    public Ordenacao() {
        this.listaDePessoas= new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordemIdade= new ArrayList<>(listaDePessoas);
        Collections.sort(ordemIdade);
        return ordemIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordemAltura= new ArrayList<>(listaDePessoas);
        Collections.sort(ordemAltura,new OrdemPorAltura());
        return ordemAltura;        
    }

    public static void main(String[] args) {
        Ordenacao ordenacao=new Ordenacao();
        ordenacao.adicionarPessoa("Flavio", 30, 1.70);
        ordenacao.adicionarPessoa("Sara", 31, 1.56);
        ordenacao.adicionarPessoa("Ciclano", 15, 1.62);
        ordenacao.adicionarPessoa("Beltrano", 22, 1.85);

        System.out.println("Ordenando por idade: "+ordenacao.ordenarPorIdade());
        System.out.println("Ordenando por altura: "+ordenacao.ordenarPorAltura());
    }
}
