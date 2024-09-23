package ExerciciosMap.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> mapaDeEventos;

    public AgendaEventos() {
        this.mapaDeEventos= new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        mapaDeEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoExibido= new TreeMap<>(mapaDeEventos);
        System.out.println(mapaDeEventos);
    }

    public void obterProximoEvento() {        
        LocalDate dataAtual= LocalDate.now();
        LocalDate proximaData= null;
        Evento proximoEvento= null;
        Map<LocalDate, Evento> eventoExibido= new TreeMap<>(mapaDeEventos);
        for (Map.Entry<LocalDate, Evento> entry: mapaDeEventos.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData= entry.getKey();
                proximoEvento= entry.getValue();                
                break;
            }            
        }
        if (proximoEvento!=null)
            System.out.println("Proximo evento: "+proximoEvento.getNome()+" será: "+proximaData);
    }

    public static void main(String[] args) {
        AgendaEventos evento= new AgendaEventos();
        evento.adicionarEvento(LocalDate.of(2024, 10, 20), "evento 1", "atração 1");
        evento.adicionarEvento(LocalDate.of(2024, 10, 10), "evento 2", "atração 2");
        evento.adicionarEvento(LocalDate.of(2024, 11, 18), "evento 3", "atração 3");
        evento.adicionarEvento(LocalDate.of(2024, 12, 30), "evento 4", "atração 4");        
        evento.exibirAgenda();
        evento.obterProximoEvento();
    }
}
