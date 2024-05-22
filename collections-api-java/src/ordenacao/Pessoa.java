package ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}'+"\n";
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Float.compare(o1.getAltura(), o2.getAltura());
    }
}

class ComparatorPorIdade implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
       return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
