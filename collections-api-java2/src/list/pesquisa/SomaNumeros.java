package list.pesquisa;

import java.util.ArrayList;

public class SomaNumeros {
    private ArrayList<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int n){
        this.numeros.add(n);
    }
    public void removerNumero(int n){
        this.numeros.remove(n);
    }
    public void calculaSoma(){
        int soma = 0;
        for(Integer n : this.numeros){
            soma += n;
        }
        System.out.println("Soma total: "+soma);
    }
    public void encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for(Integer n : this.numeros){
            if(n > maior){
                maior = n;
            }
        }
        System.out.println("O amior numero eh:"+maior);
    }
    public void encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(Integer n : this.numeros){
             if(n < menor){
                 menor = n;
             }
        }
        System.out.println("Menor numero eh: "+menor);
    }
    public void exibirNumeros(){
        System.out.println(this.numeros);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }
}
