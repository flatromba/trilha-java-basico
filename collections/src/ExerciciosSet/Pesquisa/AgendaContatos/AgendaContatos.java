package ExerciciosSet.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> conjuntoDeContatos;

    public AgendaContatos() {
        this.conjuntoDeContatos= new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        conjuntoDeContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(conjuntoDeContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPesquisado= new HashSet<>();
        for (Contato contato: conjuntoDeContatos) {
            if (contato.getNome().startsWith(nome)) {
                contatoPesquisado.add(contato);
            }
            else {
            System.out.println("Não foi encontrado um contato com esse nome");
            }
        }
        return contatoPesquisado;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado= null;
        for (Contato contato: conjuntoDeContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado=contato;
                System.out.println("Contato atualizado");
                break;
            }
            else {
                System.out.println("Não foi encontrado um contato com esse nome"); 
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contato= new AgendaContatos();
        contato.exibirContatos();
        System.out.println("\n\n");

        contato.adicionarContato("Sara", 912345678);
        contato.adicionarContato("Flavio", 987654321);
        contato.exibirContatos();
        System.out.println("\n\n");

        contato.pesquisarPorNome("Sara");
        contato.pesquisarPorNome("Madruga");
        System.out.println("\n\n");

        contato.atualizarNumeroContato("Flavio", 912348765);
        contato.exibirContatos();
    }
}
