import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite seu nome");
            String nome = leitor.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = leitor.next();

            System.out.println("Digite sua idade");
            int idade = leitor.nextInt();

            System.out.println("Digite sua altura");
            double altura = leitor.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Insira apenas dados numericos para peso e altura");
        }




    }
}
