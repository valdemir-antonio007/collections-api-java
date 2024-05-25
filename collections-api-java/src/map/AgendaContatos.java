package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(Contato c){
        this.contatos.put(c.getNome(), c.getTelefone());
    }

    public void removerContato(String nome){
        this.contatos.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(this.contatos.toString());
    }

    public String pesquisarPorNome(String nome){
        return this.contatos.get(nome);
    }

    public Map<String, String> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatos=" + contatos +
                '}';
    }
}
