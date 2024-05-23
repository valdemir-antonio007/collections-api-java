package set.contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new TreeSet<>();
    }

    public void adicionarContato(Contato contato){
          if(this.contatos.contains(contato)){
              System.out.println("Impossivel cadastrar");
          }else {
              this.contatos.add(contato);
          }
    }

    public void exibeContatos(){
        System.out.println(this.contatos.toString());
    }

    public List<Contato> pesquisarPorNome(String nome){
        List<Contato> contatos_result = new ArrayList<>();
        for(Contato c : this.contatos){
            if(c.getNome().startsWith(nome)){
                contatos_result.add(c);
            }
        }
        return contatos_result;
    }

    public void atualizarNumeroContato(String nome, String novo_numero){
        for(Contato c : this.contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novo_numero);
                break;
            }
        }
    }

    public Set<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatos=" + contatos +
                '}';
    }
}
