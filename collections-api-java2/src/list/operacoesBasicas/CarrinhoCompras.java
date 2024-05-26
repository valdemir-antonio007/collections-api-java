package list.operacoesBasicas;

import java.util.ArrayList;

public class CarrinhoCompras {
    private ArrayList<Item> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }
    public void adicionaItem(Item item){
        this.carrinho.add(item);
    }
    public void removeItem(Item item){
        this.carrinho.remove(item);
    }
    public void calcularValorTotal(){
        double total =0;
        for(Item i: this.carrinho){
            total += (i.getQuantidade()*i.getPreco());
        }
        System.out.println("Valor total do carrinho: "+total);
    }

    public void buscarMaiorValorProduto(){
        Item item = null;
        double valor = Double.MIN_VALUE;
        for(Item i : this.carrinho){
            if(i.getPreco() > valor){
                item = i;
                valor=i.getPreco();
            }
        }
        System.out.println("O produto com maior valor é: "+item.getNome()+" e seu valor eh: "+item.getPreco());
    }

    public void buscarMenorValorProduto(){
        Item item = null;
        double menor=Double.MAX_VALUE;
        for(Item i : this.carrinho){
            if(i.getPreco() < menor){
                item = i;
                menor= i.getPreco();
            }
        }
        System.out.println("O produto com menor valor eh: "+item.getNome()+" com valor de: "+item.getPreco());
    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "carrinho=" + carrinho +
                '}';
    }

    public ArrayList<Item> getCarrinho() {
        return carrinho;
    }
}
