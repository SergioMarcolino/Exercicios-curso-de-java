package arrayList.OrdenacaoPessoa;

public class main {
    public static void main(String[] args) {
       ordenarPessoa pessoa = new ordenarPessoa();
       pessoa.adicionarPessoa("nome 1", 23, 1.56);
       pessoa.adicionarPessoa("nome 2", 22, 2.56);

        System.out.println(pessoa.ordenarPorIdade());
    }
}
