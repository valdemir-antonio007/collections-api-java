package list.pesquisa;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     /*   Livro l1 = new Livro("POO de Java", "Valdemir Antonio", 2020);
        Livro l2 = new Livro("PHP Basico", "Helena Rosa", 2022);
        Livro l3 = new Livro("C# Avançado", "Valdemir antonio", 2018);
        CatalogoLivros cat = new CatalogoLivros();
        cat.adicionaLivro(l1);
        cat.adicionaLivro(l2);
        cat.adicionaLivro(l3);
        System.out.println(cat.toString());
      //  cat.removeLivro(l1);

        List<Livro> livros =  cat.pesquisaPorAutor("Valdemir antonio");
        System.out.println(livros.toString());
        cat.pesquisarPorIntervaloAnos(2015, 2018);
        System.out.println("-----------");
        cat.pesquisarPorTitulo("POO de");

      */
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(10);
        soma.adicionarNumero(25);
        soma.adicionarNumero(1);
        soma.adicionarNumero(15);
        System.out.println(soma.toString());
        Collections.sort(soma.getNumeros());
        System.out.println(soma.toString());
        soma.encontrarMaiorNumero();
        soma.encontrarMenorNumero();
        soma.calculaSoma();


    }
}
