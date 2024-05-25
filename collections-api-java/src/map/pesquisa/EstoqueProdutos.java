package map.pesquisa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer, Produto> prods;

    public EstoqueProdutos() {
        this.prods = new HashMap<>();
    }

    public void adicionarProduto(Produto p){
        this.prods.put(p.getId(), p);
    }

    public void exibirProdutos(){
        System.out.println(this.prods.toString());
    }

    public void calcularValorTotalEstoque(){
        double total =0;
        for(Produto p : prods.values()){
                total += p.getQuantidade()*p.getPreco();
        }
        System.out.println("Valor total do estoque é: "+total);
    }

    public void obterProdutoMaisCaro(){
        double maiorValor= Double.MIN_VALUE;
        Produto prod_mais_caro = null;

        for(Produto p : prods.values()){
            if(p.getPreco() > maiorValor){
                prod_mais_caro = p;
                maiorValor=p.getPreco();

            }
        }
        System.out.println("O produto mais caro é: "+prod_mais_caro.getNome()+" e custa "+prod_mais_caro.getPreco());
    }

    public void obterProdutoMaisBarato(){
        double valor = Double.MAX_VALUE;
        Produto prod_mais_barato = null;
        for(Produto p : prods.values()){
            if(p.getPreco() < valor){
                prod_mais_barato = p;
                valor = p.getPreco();
            }
        }
        System.out.println("O produto mais barato é: "+prod_mais_barato.getNome()+" e custa: "+prod_mais_barato.getPreco());
    }

    public void obterProdutoMaiorQuantidadeValortotalEstoque(){
        Produto prod = null;
        double total= Double.MIN_VALUE;
        for(Produto p : prods.values()){
            if((p.getPreco()*p.getQuantidade()) > total){
                prod = p;
                total = p.getQuantidade()*p.getPreco();
            }
        }

        System.out.println("O produto com maior valor de estoque eh: "+prod.getNome());
    }

    @Override
    public String toString() {
        return "EstoqueProdutos{" +
                "prods=" + prods +
                '}';
    }

    public Map<Integer, Produto> getProds() {
        return prods;
    }

    public void setProds(Map<Integer, Produto> prods) {
        this.prods = prods;
    }
}
