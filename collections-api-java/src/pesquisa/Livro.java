package pesquisa;

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
