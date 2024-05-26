package list.operacoesBasicas;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
     /*   Tarefa t1 = new Tarefa("Montar computador");
        Tarefa t2 = new Tarefa("Gerar Relatorio");
        ListaTarefa lista = new ListaTarefa();
        lista.adicionarTarefa(t1);
        lista.adicionarTarefa(t2);
        System.out.println(lista.toString());
        Collections.sort(lista.getListaTarefas());
        System.out.println(lista.toString());
        //lista.removerTarefa(t1);
        lista.obterDescricoesTarefas();

      */

        Item i = new Item("arroz", 7.0d, 10);
        Item i2 = new Item("feijao", 5.0d, 10);
        Item i3 = new Item("oleo", 12.0d, 10);
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(i);
        carrinho.adicionaItem(i2);
        carrinho.adicionaItem(i3);
        System.out.println(carrinho.toString());
       // carrinho.removeItem(i2);
       // System.out.println(carrinho.toString());
        carrinho.buscarMaiorValorProduto();
        carrinho.buscarMenorValorProduto();
        carrinho.calcularValorTotal();

    }
}
