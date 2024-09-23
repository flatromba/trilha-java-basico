package ExerciciosList.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefas> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas= new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> tarefasRemovidas=new ArrayList<>();
        for (Tarefas tarefa: listaDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemovidas.add(tarefa);
            }
        }
        listaDeTarefas.removeAll(tarefasRemovidas);
    }

    public int obterNumeroTotalTarefas() {
        return listaDeTarefas.size();
    }

    public void obterDescricaoTarefas() {
        System.out.println(listaDeTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas lista=new ListaTarefas();
        System.out.println(lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("acordar");
        lista.adicionarTarefa("primeira tarefa");
        System.out.println(lista.obterNumeroTotalTarefas());
        lista.adicionarTarefa("segunda tarefa");
        System.out.println(lista.obterNumeroTotalTarefas());
        lista.removerTarefa("primeira tarefa");
        System.out.println(lista.obterNumeroTotalTarefas());
    }
}
