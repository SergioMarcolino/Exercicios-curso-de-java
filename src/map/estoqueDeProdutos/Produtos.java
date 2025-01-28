package map.estoqueDeProdutos;

public class Produtos {
    private double preco;
    private int quantidade;
    private String nome;

    public Produtos(double preco, int quantidade, String nome) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
