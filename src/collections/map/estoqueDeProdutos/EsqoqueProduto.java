package collections.map.estoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EsqoqueProduto {
    Map<Long, Produtos> produtosMap;

    public EsqoqueProduto() {
        this.produtosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produtos(preco,quantidade,nome));

    }
    public void exibirProdutos() {
        System.out.println(produtosMap);
    }
    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Produtos p : produtosMap.values()) {
            total += p.getPreco();
        }
        return total;
    }
    public Produtos obterProdutoMaisCaro() {
        Produtos produtoMaisCaro = null;
        double maiorpreco = 0;
        for (Produtos p : produtosMap.values()) {
            if (p.getPreco() > maiorpreco) {
                produtoMaisCaro = p;
                maiorpreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }
    public Produtos obterProdutoMaisBarato() {
        Produtos produtoMaisBarato = null;
        double menorPreco = Double.MIN_VALUE;
        for (Produtos p : produtosMap.values()) {
            if (p.getPreco() < menorPreco) {
                menorPreco = p.getPreco();
                produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

}
