package collections.set.cadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> conjunto = new HashSet<Produto>();

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        conjunto.add(new Produto(nome, cod, quantidade, preco));
    }
    public Set<Produto> exibirProdutosPorNome(String nome ) {
        Set<Produto> exibir = new TreeSet<>(conjunto);
        return exibir;
    }
    public Set<Produto> exibirProdutosPorPreco(double preco) {
        Set<Produto> ProdutoPreço = new TreeSet<>(new ComparatorPorPreco());
        ProdutoPreço.addAll(conjunto);
        return ProdutoPreço;
    }

}

