package map;

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Valdemir", "99802-2627");
        Contato c2 = new Contato("Veronica", "99855-7485");
        AgendaContatos ag = new AgendaContatos();
        ag.adicionarContato(c2);
        ag.adicionarContato(c1);
        System.out.println(ag.toString());
        System.out.println(ag.pesquisarPorNome("Veronica"));


    }
}
