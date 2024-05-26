package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }
    public void adicionarPessoa(Pessoa p){
        this.pessoas.add(p);
    }
    public void removerPessoa(Pessoa p){
        this.pessoas.remove(p);
    }
    public void ordenarPorIdade(){
        Collections.sort(this.pessoas, new ComparatorPorIdade());
        System.out.println(this.pessoas);
    }
    public void ordeanrPorAltura(){
        Collections.sort(this.pessoas, new ComparatorPorAltura());
        System.out.println(this.pessoas);
    }


    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "pessoas=" + pessoas +
                '}';
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}

class ComparatorPorIdade implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class  ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa o1, Pessoa o2) {

        return Float.compare(o1.getAltura(), o2.getAltura());
    }
}

