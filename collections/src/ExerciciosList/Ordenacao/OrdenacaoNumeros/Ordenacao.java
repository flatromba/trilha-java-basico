package ExerciciosList.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {

    private List<Integer> listaDeNumeros;

    public Ordenacao() {
        this.listaDeNumeros= new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordemAscendente= new ArrayList<>(this.listaDeNumeros);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemAscendente= new ArrayList<>(this.listaDeNumeros);
        ordemAscendente.sort(Collections.reverseOrder());
        return ordemAscendente;
    }

    public static void main(String[] args) {
        Ordenacao numeros= new Ordenacao();
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(8);

        System.out.println("Ordem Ascendente: "+numeros.ordenarAscendente());

        System.out.println("Ordem Descendente: "+numeros.ordenarDescendente());
    }
}
