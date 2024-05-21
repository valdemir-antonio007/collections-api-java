package carrinhoCompras;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade){
          this.itens.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome){
        for(Item item : itens){
            if(item.getNome().equalsIgnoreCase(nome)){
                this.itens.remove(item);
            }
        }
    }

    public float calculaValorTotal(){
        float total = 0;
        for(Item item : itens){
            total += (item.getQuantidade()*item.getPreco());
        }
        return total;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itens +
                '}';
    }
}
