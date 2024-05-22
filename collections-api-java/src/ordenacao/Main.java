package ordenacao;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa("Valdemir", 55, 1.75f);
        Pessoa p2 = new Pessoa("Heloisa", 45, 1.85f);
        Pessoa p3 = new Pessoa("Jose", 25, 1.65f);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        OrdenacaoPessoas or = new OrdenacaoPessoas();
        or.adicionarPessoa(p1);
        or.adicionarPessoa(p2);
        or.adicionarPessoa(p3);
        or.ordenarPorAltura();
        System.out.println(or.toString());
        or.ordenarPorIdade();
        System.out.println(or.toString());
        Collections.sort(pessoas);
        System.out.println(pessoas.toString());
    }
}
