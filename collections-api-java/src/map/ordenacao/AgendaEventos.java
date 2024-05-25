package map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<Integer, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

public void adicionarEvento(Integer cod, Evento t){
        this.eventosMap.put(cod, t);
}

public void exibirAgenda(){
    ArrayList<Evento> agenda = new ArrayList<>(this.eventosMap.values());
    Collections.sort(agenda);
    System.out.println(agenda.toString());
}

public void exibirAgenda2(){
        Map<Integer, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
    System.out.println(eventosTreeMap);
}

public Evento obterProximoEvento(){
        Evento ev = null;
    LocalDate hoje = LocalDate.now();
    ArrayList<Evento> lista = new ArrayList<>(this.eventosMap.values());
    Collections.sort(lista);
        for(Evento e : lista){
            if(e.getData().isAfter(hoje)){
                ev = e;
                break;
            }
        }
        return ev;
}

    @Override
    public String toString() {
        return "AgendaEventos{" +
                "eventosMap=" + eventosMap +
                '}';
    }

    public Map<Integer, Evento> getEventosMap() {
        return eventosMap;
    }

    public void setEventosMap(Map<Integer, Evento> eventosMap) {
        this.eventosMap = eventosMap;
    }
}
