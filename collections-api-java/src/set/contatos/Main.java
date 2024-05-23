package set.contatos;

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Valdemir", "99802-2627");
        Contato c2 = new Contato("Veronica", "99822-5241");
        AgendaContatos age = new AgendaContatos();
        age.adicionarContato(c1);
        age.adicionarContato(c2);
        age.exibeContatos();
        age.atualizarNumeroContato("Valdemir", "99802-2629");
        age.exibeContatos();

    }
}
