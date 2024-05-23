package set.ordenacao;

import java.util.*;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new TreeSet<>();
    }

    public void adicionarProduto(Produto p){
        this.produtos.add(p);
    }

    public void exibirProdutosPorNome(){
        List<Produto> prods = new ArrayList<>(this.produtos);
        Collections.sort(prods);
        System.out.println(prods.toString());
    }

    public void exibirProdutosPorPreco(){
        List<Produto> prods = new ArrayList<>(this.produtos);
        prods.sort(new ComparatorPorPreco());
        System.out.println(prods.toString());
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "produtos=" + produtos +
                '}';
    }
}
