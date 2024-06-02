package list.pesquisa;

public class Main {
    public static void main(String[] args) {
     /*   Livro l1 = new Livro("POO Java", "Valdemir Antonio", 2022);
        Livro l2 = new Livro("PHYTON Basico", "Veronica Rosa", 2018);
        Livro l3 = new Livro("C# Basico", "Valdemir Antonio", 2024);

        CatalogoLivros cat = new CatalogoLivros();
        cat.adicionarLivro(l1);
        cat.adicionarLivro(l2);
        cat.adicionarLivro(l3);
        System.out.println(cat.toString());
        cat.pesquisarPorAutor("Valdemir Ant");
        cat.pesquisatitulo("POO");
        cat.pesquisarPorIntervaloDeAnos(2015,2018);

      */

        SomaNumeros som = new SomaNumeros();
        som.adicionaNumero(50);
        som.adicionaNumero(15);
        som.adicionaNumero(155);
        som.adicionaNumero(4);
        System.out.println(som.toString());
        som.encontrarMaiorNumero();
        som.encontrarMenorNumero();
        som.calculaSoma();
        som.ordenarNumeros();
        System.out.println(som.getNumeros());


    }
}
