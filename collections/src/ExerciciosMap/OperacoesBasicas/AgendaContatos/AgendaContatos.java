package ExerciciosMap.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> mapaDeContatos;

    public  AgendaContatos() {
        this.mapaDeContatos= new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        mapaDeContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!mapaDeContatos.isEmpty()) {
            mapaDeContatos.remove(nome);
        }
        else {
            System.out.println("não existe");
        }
    }

    public void exibirContato() {
        System.out.println(mapaDeContatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPesquisado= null;
        if (!mapaDeContatos.isEmpty()) {
            numeroPesquisado= mapaDeContatos.get(nome);
        }
        return numeroPesquisado;             
    }

    public static void main(String[] args) {
        AgendaContatos contato= new AgendaContatos();
        contato.exibirContato();
        System.out.println("\n\n");

        contato.adicionarContato("Sara", 912345678);
        contato.adicionarContato("Flavio", 987654321);
        contato.exibirContato();
        System.out.println("\n\n");

        System.out.println(contato.pesquisarPorNome("Flavio"));
        System.out.println(contato.pesquisarPorNome("ciclano"));
        System.out.println("\n\n");

        contato.removerContato("Flavio");
        contato.exibirContato();       
    }
}
