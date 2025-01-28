package collections.arrayList.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDePessoa {
    List<Pessoa> ListaDePessoa;

    public OrdenacaoDePessoa() {
        ListaDePessoa = new ArrayList<>();
    }

    //methods
    public void adicionarPessoa(String nome, int idade, Double altura) {
        ListaDePessoa.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPessoa() {
        List<Pessoa> ListPessoaIdade = new ArrayList<>(ListaDePessoa);
        Collections.sort(ListPessoaIdade);
        return ListPessoaIdade;

    }

}
