package list.ordenacao;

public class Main {
    public static void main(String[] args) {
      /*  Pessoa p1 = new Pessoa("Valdemir", 55, 1.75f);
        Pessoa p2 = new Pessoa("Ana", 45, 1.85f);
        Pessoa p3 = new Pessoa("Michel", 25, 1.55f);
        OrdenacaoPessoas ord = new OrdenacaoPessoas();
        ord.adicionarPessoa(p1);
        ord.adicionarPessoa(p2);
        ord.adicionarPessoa(p3);
        System.out.println(ord.toString());
        ord.ordenarPorIdade();
        ord.ordeanrPorAltura();

       */

        OrdenacaoNumeros order = new OrdenacaoNumeros();
        order.adicionarNumero(10);
        order.adicionarNumero(150);
        order.adicionarNumero(1);
        order.adicionarNumero(55);
        System.out.println(order.toString());
        order.ordenarAscedente();
        order.ordenarDesscedente();
    }
}
