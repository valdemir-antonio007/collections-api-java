package map.pesquisa;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("rack",10, 1299.0d, 1);
        Produto p2 = new Produto("estante",10, 499.0d, 2);
        Produto p3 = new Produto("cama",10, 199.0d, 3);
        Produto p4 = new Produto("celular",10, 450.0d, 4);

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);
        estoque.adicionarProduto(p4);

        System.out.println(estoque.toString());
        estoque.calcularValorTotalEstoque();
        estoque.obterProdutoMaisCaro();
        estoque.obterProdutoMaisBarato();
        estoque.obterProdutoMaiorQuantidadeValortotalEstoque();
    }
}
