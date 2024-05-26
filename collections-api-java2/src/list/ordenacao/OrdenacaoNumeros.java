package list.ordenacao;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    private ArrayList<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }
    public void removerNumero(int numero){
        this.numeros.remove(numero);
    }
    public void ordenarAscedente(){
        Collections.sort(this.numeros);
        System.out.println(this.numeros);
    }
    public void ordenarDesscedente(){
        Collections.reverse(this.numeros);
        System.out.println(this.numeros);
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }
}
