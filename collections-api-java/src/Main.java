import carrinhoCompras.CarrinhoDeCompras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrrinho = new CarrinhoDeCompras();
        carrrinho.adicionarItem("macarrao", 10, 5);
        carrrinho.adicionarItem("feijao", 5, 25);

        System.out.println(carrrinho.toString());
        System.out.println(carrrinho.calculaValorTotal());

    }
}