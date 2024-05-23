package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new TreeSet<>();
    }

    public void adicionaConvidado(Convidado convidado){
        if(this.convidados.contains(convidado)){
            System.out.println("Este convidado ja está na lista..");
        }else {
            this.convidados.add(convidado);
        }
    }

    public void removerConvidadoPorCodigo(int codigo){
        for (Convidado c : this.convidados){
            if(c.getCodigoConvite() == codigo){
                this.convidados.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return this.convidados.size();
    }

    public void exibeConviddos(){
        System.out.println(this.convidados.toString());
    }


    public Set<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(Set<Convidado> convidados) {
        this.convidados = convidados;
    }

    @Override
    public String toString() {
        return "convidados=" + convidados +
                '}';
    }
}
