package list.operacoesBasicas;

import java.util.ArrayList;

public class ListaTarefa {
    private ArrayList<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa t){
        this.listaTarefas.add(t);
    }
    public void removerTarefa(Tarefa t){
         this.listaTarefas.remove(t);
    }
    public int obterNumeroTotalTarefas(){
        return this.listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(this.listaTarefas.toString());
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    @Override
    public String toString() {
        return "ListaTarefa{" +
                "listaTarefas=" + listaTarefas +
                '}';
    }
}
