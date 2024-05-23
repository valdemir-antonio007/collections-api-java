package set;

public class Main {
    public static void main(String[] args) {
        Convidado c1 = new Convidado("Valdemir", 1);
        Convidado c2 = new Convidado("Veronica",2);
        ConjuntoConvidados conj = new ConjuntoConvidados();
        conj.adicionaConvidado(c1);
        conj.adicionaConvidado(c2);
        System.out.println(conj.toString());
        System.out.println("------");
        conj.exibeConviddos();
        conj.removerConvidadoPorCodigo(1);
        System.out.println(conj.contarConvidados());

    }
}
