package ordenacao;

import java.util.Comparator;

public class PessoaByAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
            return Float.compare(o1.getAltura(), o2.getAltura());
    }
}
