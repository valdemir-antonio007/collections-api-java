package tarefa;

import carrinhoCompras.CarrinhoDeCompras;
import pesquisa.CatalagoLivros;
import pesquisa.Livro;

import javax.xml.catalog.Catalog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrrinho = new CarrinhoDeCompras();
        carrrinho.adicionarItem("macarrao", 10, 5);
        carrrinho.adicionarItem("feijao", 5, 25);

        System.out.println(carrrinho.toString());
        System.out.println(carrrinho.calculaValorTotal());

        Livro l1 = new Livro("POO de Java", "Stev Jobs", 2017);
        Livro l2 = new Livro("Javascript Avançado", "Tylor Sherman", 2019);
        Livro l3 = new Livro("Collections em Java", "Stev Jobs", 2022 );

        CatalagoLivros c = new CatalagoLivros();
        c.adicionarLivro(l1);
        c.adicionarLivro(l2);
        c.adicionarLivro(l3);
      //  System.out.println(c.toString());
      //  System.out.println(c.pesquisaPorTitulo("poo de java"));
      //  System.out.println(c.pesquisarPorAutor("stev jobs"));
      //  System.out.println(c.pesquisarPorIntervaloAnos(2015,2017));
        int tam = c.pesquisarPorIntervaloAnos(2015,2016).get().size();
        if(c.pesquisarPorIntervaloAnos(2015,2017).get().size()==0){
            System.out.println("Nenhuma dado encontrado");
        }else {
            System.out.println(c.pesquisarPorIntervaloAnos(2015,2017).get());
        }


    }
}