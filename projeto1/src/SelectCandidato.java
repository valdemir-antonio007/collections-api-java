import java.util.ArrayList;
import java.util.Random;

public class SelectCandidato {
    public static void main(String[] args) {


          //  selecaoCandidatos();
          //  imprimirSelecionados();
        ligacao();

    }

    static void ligacao(){
        String[] candidatos = {"Marcia", "Valdemir", "Veronica", "Luis", "Valteci"};
        for (String candidato : candidatos){
            int i=1;
            while(i <4){
                System.out.println("Ligando pro candidato "+candidato+" --"+i+"ª tentativa");
                Random random = new Random();
                int ch = random.nextInt(3);
                if(ch==2){
                    System.out.println("Conseguimos contato com o candidato "+ candidato + " apos "+i+" tentativas");
                    break;
                }
                if(i==3){
                    System.out.println("Não conseguimos contato com o candidato "+candidato);
                }
                i++;
            }
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Marcia", "Valdemir", "Veronica", "Luis", "Valteci", "Ester", "Jose", "Ana"};
        ArrayList<String> selecionados = new ArrayList<>();
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        int candidatoAtual=0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            Random randon = new Random();
            double salarioPretendido =  randon.nextDouble(1800.0, 2200.0);
            System.out.println("O candidato "+candidato+" soliciotu este valor como salario pretendido: "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
                selecionados.add(candidato);
            }
            candidatoAtual++;
        }
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Marcia", "Valdemir", "Veronica", "Luis", "Valteci"};
        for(int i=0; i<candidatos.length; i++ ){
            System.out.println("O candidato de nº "+(i+1)+" é " + candidatos[i]);
        }
    }

    static void analisarCandidato(double salarioPrentendido){
        double salarioBase = 2000.0;
            if(salarioBase > salarioPrentendido){
                System.out.println("Ligar para o candidadto");
            }else if (salarioBase == salarioPrentendido){
                System.out.println("Ligar para uma contra proposta");
            }else {
                System.out.println("Aguardar novos resultados");
            }
    }
}
