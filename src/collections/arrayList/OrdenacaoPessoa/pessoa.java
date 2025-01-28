package collections.arrayList.OrdenacaoPessoa;

import java.util.Comparator;

public class pessoa implements Comparable<pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }


    @Override
    public int compareTo(pessoa o) {

        return Integer.compare(idade,o.getIdade());
    }
}
class pessoaComparator implements Comparator<pessoa> {

    @Override
    public int compare(pessoa p1, pessoa p2) {

        return Double.compare(p1.getAltura(),p2.getAltura()) ;
    }
}
