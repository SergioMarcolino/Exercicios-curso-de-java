package arrayList.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivro {
    private List<livro> livroList;

    public catalogoLivro() {
        this.livroList = new ArrayList<>() ;
    }
    public void adicionarLivro(String titulo,  String autor,  int anoDePublicacao) {
        livroList.add(new livro(titulo, autor, anoDePublicacao));
    }
    public List<livro> pesquisaPorAutor(String autor) {
        List< livro> livrosPorAutore = new ArrayList<>() ;
        if(!livroList.isEmpty()) {
            for (livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutore.add(l);
                }
            }
        }
        return livrosPorAutore;
    }
    public List<livro> PesquisaPorIntervaloDeAnos (int anoInicial, int anoDeTermino ){
        List<livro> PesquisaPorMargemDeAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (livro l : livroList){
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoDeTermino){
                    PesquisaPorMargemDeAno.add(l);
                }
            }
        }
        return PesquisaPorMargemDeAno;
    }
    public String pesquisaPorTitulo(String titulo) {
        livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (livro l : livroList) {
                 if (l.getTitulo().equalsIgnoreCase(titulo)){
                     livroPorTitulo = l;
                 }
            }

        }
        return livroPorTitulo.getTitulo();
    }

}
