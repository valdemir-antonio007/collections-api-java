package list.pesquisa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private ArrayList<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionaLivro(Livro l){
        this.livros.add(l);
    }

    public void removeLivro(Livro l){
        this.livros.remove(l);
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livros_pesquisados = new ArrayList<>();
        for(Livro l : this.livros){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livros_pesquisados.add(l);
            }
        }
        return livros_pesquisados;
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livros_pesquisados = new ArrayList<>();
        for(Livro l : this.livros){
            if(l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao() <= anoFinal){
                livros_pesquisados.add(l);
            }
        }
        System.out.println(livros_pesquisados.toString());
    }
    public void pesquisarPorTitulo(String titulo){
        List<Livro> livros_pesquisados = new ArrayList<>();
        for(Livro l : this.livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                livros_pesquisados.add(l);
            }
                       }
        System.out.println(livros_pesquisados.toString());
        }



    public ArrayList<Livro> getLivros() {
        return livros;
    }

    @Override
    public String toString() {
        return "CatalogoLivros{" +
                "livros=" + livros +
                '}';
    }
}
