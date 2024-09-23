package ExerciciosSet.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> conjuntoDeTarefas;

    public ListaTarefas() {
        this.conjuntoDeTarefas= new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        conjuntoDeTarefas.add(new Tarefa(descricao));
    }

    public void remorverTarefa(String descricao) {
        Set<Tarefa> tarefaRemovida=new HashSet<>();
        for (Tarefa tarefa: conjuntoDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemovida.add(tarefa);
                break;
            }
        }
        conjuntoDeTarefas.removeAll(tarefaRemovida);
    }

    public void exibirTarefa() {
        System.out.println(conjuntoDeTarefas);
    }

    public int contarTarefas() {
        return conjuntoDeTarefas.size();
    }    

    public Set<Tarefa> obterTarefaConcluida() {
        Set<Tarefa> tarefaConcluida=new HashSet<>();
        for (Tarefa tarefa: conjuntoDeTarefas) {
            if (tarefa.isConcluida()) {
                tarefaConcluida.add(tarefa);
            }
        }
        return tarefaConcluida;
    }

    public Set<Tarefa> obterTarefaPendente() {
        Set<Tarefa> tarefaPendente=new HashSet<>();
        for (Tarefa tarefa: conjuntoDeTarefas) {
            if (!tarefa.isConcluida()) {
                tarefaPendente.add(tarefa);
            }
        }
        return tarefaPendente;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa: conjuntoDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    } 

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente= null;
        for (Tarefa tarefa: conjuntoDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente=tarefa;
            }
        }
        if (tarefaPendente!=null) {
            if (tarefaPendente.isConcluida()) {
                tarefaPendente.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        conjuntoDeTarefas.removeAll(conjuntoDeTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas tarefa= new ListaTarefas();
        tarefa.exibirTarefa();
        System.out.println(tarefa.contarTarefas());
        System.out.println("\n\n");

        tarefa.adicionarTarefa("lavar a louça");
        tarefa.exibirTarefa();
        System.out.println(tarefa.contarTarefas());
        System.out.println("\n\n");

        tarefa.adicionarTarefa("lavar o quintal");
        tarefa.adicionarTarefa("recolher o lixo");
        tarefa.exibirTarefa();
        System.out.println(tarefa.contarTarefas());
        System.out.println("\n\n");

        tarefa.remorverTarefa("lavar a louça");
        tarefa.exibirTarefa();
        System.out.println(tarefa.contarTarefas());
        System.out.println("\n\n");

        tarefa.remorverTarefa("varrer a casa");
        tarefa.exibirTarefa();
        System.out.println(tarefa.contarTarefas());
        System.out.println("\n\n");

        tarefa.marcarTarefaConcluida("recolher o lixo");
        tarefa.marcarTarefaPendente("lavar o quintal");
        tarefa.obterTarefaConcluida();
        tarefa.obterTarefaPendente();
        System.out.println("\n\n");      

        tarefa.limparListaTarefas();
        tarefa.exibirTarefa();
        System.out.println(tarefa.contarTarefas());
    }
}
