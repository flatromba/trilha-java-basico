package ExerciciosSet.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> conjuntoConvidado; 

    public ConjuntoConvidados() {
        this.conjuntoConvidado= new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        conjuntoConvidado.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoRemovido= null;
        for (Convidado convidado: conjuntoConvidado) {
            if (convidado.getCodigoConvite()==codigoConvite) {
                convidadoRemovido=convidado;
                break;
            }
        }
        conjuntoConvidado.remove(convidadoRemovido);
    }

    public int contarConvidados() {
        return conjuntoConvidado.size();
    }

    public void exibirConvidados() {
        System.out.println(conjuntoConvidado);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto= new ConjuntoConvidados();
        conjunto.contarConvidados();
        conjunto.exibirConvidados();
        System.out.println("\n\n");

        conjunto.adicionarConvidado("Sara", 1);
        conjunto.contarConvidados();
        conjunto.exibirConvidados();
        System.out.println("\n\n");

        conjunto.adicionarConvidado("Flavio", 2);
        conjunto.adicionarConvidado("Madruga", 3);
        conjunto.adicionarConvidado("Coralina", 4);
        conjunto.adicionarConvidado("Jorel", 5);
        conjunto.exibirConvidados();
        System.out.println("\n\n");

        conjunto.removerConvidadoPorCodigo(5);
        conjunto.exibirConvidados();
        conjunto.contarConvidados();
    }
}
