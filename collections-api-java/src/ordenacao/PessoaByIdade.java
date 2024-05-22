package ordenacao;

import java.util.Comparator;

public class PessoaByIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {

    return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
