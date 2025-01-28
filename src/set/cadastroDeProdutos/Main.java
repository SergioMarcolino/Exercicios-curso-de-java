package set.cadastroDeProdutos;

import set.listaDeAlunos.GerenciadorDeAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeAlunos gerenciador = new GerenciadorDeAlunos();

        gerenciador.adicionarAluno("Sergio",1111L,3);
        gerenciador.adicionarAluno("Maria",2222L,1);
        gerenciador.adicionarAluno("Alexandre",3333L,7);


        System.out.println(gerenciador.exibirAlunosPorMedia());

    }
}
