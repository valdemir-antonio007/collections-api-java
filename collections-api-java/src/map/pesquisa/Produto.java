package map.pesquisa;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Integer id;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco, Integer id) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.id= id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o) {
        return this.getId().compareTo(o.getId());
    }
}
