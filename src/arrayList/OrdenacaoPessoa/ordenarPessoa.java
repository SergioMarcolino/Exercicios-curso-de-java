package arrayList.OrdenacaoPessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenarPessoa {
    private List<pessoa> pessoas;

    public ordenarPessoa() {

        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {

        pessoas.add(new pessoa(nome, idade, altura));
    }
    public List<pessoa> ordenarPorIdade() {
    List<pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
    }
    public List<pessoa> ordenarPorAltura() {
        List<pessoa> pessoaPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoaPorAltura, new pessoaComparator() );
        return pessoaPorAltura;

    }
}
