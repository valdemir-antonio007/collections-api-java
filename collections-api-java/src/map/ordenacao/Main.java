package map.ordenacao;

import map.AgendaContatos;

public class Main {
    public static void main(String[] args) {
        Evento e1 = new Evento("Feijoada", "Pagodeiros da Sorte", "29/09/2024");
        Evento e2 = new Evento("Futebol com amigos", "Real Madrid", "10/06/2024");
        Evento e3 = new Evento("Aniversario de Pai", "Harmonia do Samba", "01/12/2024");

        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(3, e1);
        agenda.adicionarEvento(2, e2);
        agenda.adicionarEvento(1, e3);
        System.out.println(agenda.toString());
        Evento event = agenda.obterProximoEvento();
        System.out.println(event.toString());
        agenda.exibirAgenda();
        System.out.println("--------");
        agenda.exibirAgenda2();
    }
}
