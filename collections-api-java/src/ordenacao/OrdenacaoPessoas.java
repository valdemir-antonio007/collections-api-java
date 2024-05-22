package ordenacao;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
    private ArrayList<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa p){
        this.pessoas.add(p);
    }

    public void ordenarPorIdade(){
        Collections.sort(this.pessoas, new PessoaByIdade());
    }

    public void ordenarPorAltura(){
        Collections.sort(this.pessoas, new PessoaByAltura());
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoas{" +
                "pessoas=" + pessoas +
                '}';
    }
}
