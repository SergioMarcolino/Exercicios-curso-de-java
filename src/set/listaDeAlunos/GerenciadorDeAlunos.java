package set.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
    Set<Aluno> ListaAlunos;

    public GerenciadorDeAlunos() {
        this.ListaAlunos = new HashSet<Aluno>();

    }
    public void adicionarAluno(String nome, Long matricula, double media) {
        ListaAlunos.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : ListaAlunos) {
            if (aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
            }
        }
        ListaAlunos.remove(alunoParaRemover);
    }
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunos = new TreeSet<>(ListaAlunos);
        return alunos;
    }
    public Set<Aluno> exibirAlunosPorMedia(){
        Set<Aluno> alunosMedia = new TreeSet<>(new AlunoComparatorMedia());
        alunosMedia.addAll(ListaAlunos);
        return alunosMedia;
    }
}

