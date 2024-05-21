import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {

        String[] alunos = {"Valdemir", "Helena", "Valteci", "Ana"};
        Scanner scanner = new Scanner(System.in);

        double media = calculaMedias(alunos, scanner);
        System.out.printf("Media da turma: %.2f ", media);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Media da turma: "+df.format(media));
    }

    static double calculaMedias(String[] alunos, Scanner scanner){
        double soma =0;
        for(String aluno: alunos){
            System.out.printf("Nota de %s ", aluno );
            double nota = scanner.nextDouble();
            soma += nota;
        }
            return soma / alunos.length;
    }

}
