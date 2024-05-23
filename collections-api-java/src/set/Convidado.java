package set;

import java.util.Objects;
import java.util.Random;

public class Convidado implements Comparable<Convidado> {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigoConvite = codigo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                " codigoConvite=" + codigoConvite +
                '}'+"\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }


    @Override
    public int compareTo(Convidado o) {
        return Integer.compare(this.getCodigoConvite(),o.getCodigoConvite());
    }
}
