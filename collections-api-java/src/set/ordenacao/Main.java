package set.ordenacao;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Cama", 1,255.55d, 10);
        Produto p2 = new Produto("Celular", 2,2455.00d, 5);
        Produto p3 = new Produto("Armario", 3,4578.00d, 4);

        CadastroProdutos cad = new CadastroProdutos();
        cad.adicionarProduto(p1);
        cad.adicionarProduto(p2);
        cad.adicionarProduto(p3);
        System.out.println(cad.toString());
        cad.exibirProdutosPorNome();
        cad.exibirProdutosPorPreco();
    }
}
