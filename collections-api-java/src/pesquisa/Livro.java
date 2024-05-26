package pesquisa;

import java.util.Comparator;

public class Livro {
    private String titulo;
    private String autor;
    private int publicacao;

    public Livro(String titulo, String autor, int publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", publicacao=" + publicacao +
                '}';
    }
}

class ComparatorPorAnoAutorTirulo implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        int ano = Integer.compare(o1.getPublicacao(), o2.getPublicacao());
        if(ano != 0)
            return ano;
        int autor = o1.getAutor().compareTo(o2.getAutor());
        if(autor != 0)
            return autor;
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
