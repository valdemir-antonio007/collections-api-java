package tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private ArrayList<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa){
        this.tarefas.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String tarefa){
       for (Tarefa t: tarefas){
           if(t.getDescricao().equalsIgnoreCase(tarefa)){
               this.tarefas.remove(t);
           }
       }

    }

    public int obterNumeroTotalTarefas(){
        return this.tarefas.size();
    }
    public List<Tarefa> obterDescricoesTarefas(){
        return this.tarefas;
    }

}
