package pesquisa;

import java.util.ArrayList;
import java.util.Optional;

public class CatalagoLivros {
    private ArrayList<Livro> livros;



    public CatalagoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }
    public void removerLivro(Livro livro){
            this.livros.remove(livro);
    }

    public Optional<ArrayList<Livro>> pesquisarPorAutor(String autor){
        ArrayList<Livro> livros_por_autor=new ArrayList<>();
        for(Livro l : livros){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livros_por_autor.add(l);
            }
        }
        return Optional.of(livros_por_autor);
    }

    public Optional<ArrayList<Livro>> pesquisarPorIntervaloAnos(int anoInicial, int anofinal){
        ArrayList<Livro> livros_por_ano = new ArrayList<>();
        for(Livro l : livros){
            if(l.getPublicacao()>=anoInicial && l.getPublicacao() <=anofinal){
                livros_por_ano.add(l);
            }
        }
        return  Optional.ofNullable(livros_por_ano);
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro l1= new Livro();
        for(Livro l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                l1=l;
                break;
            }
        }
        return l1;
    }

    @Override
    public String toString() {
        return "CatalagoLivros{" +
                "livros=" + livros +
                '}';
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}
