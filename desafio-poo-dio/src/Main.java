import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso de Java", "POO em java", 40);
        Curso curso2 = new Curso("Curso de Javascript", "DOM na pratica", 20);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Fluxos em Java", LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}