package set.agendaDeContato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> SetContatos;

    public AgendaContatos() {
        this.SetContatos = new HashSet<>();

    }
    public void adicionarContato(String nome, int telefone) {
       SetContatos.add(new Contato(telefone, nome));
    }
    public void exibirContatos() {
        System.out.println(SetContatos);
    }
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> SetPesquisa = new HashSet<>();
        for (Contato c : SetContatos) {
            if (c.getNome().startsWith(nome)) {
                SetPesquisa.add(c);
                break;
            }
            else {
                throw new RuntimeException("O nome não está cadastrado");
            }
        }
        return SetPesquisa;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : SetContatos) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;

            }
        }
        return contatoAtualizado;
    }
}
