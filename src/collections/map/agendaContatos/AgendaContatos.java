package collections.map.agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }
    public void removerContato(String nome) {
        contatos.remove(nome);
    }
    public void exibirContatos() {
        System.out.println(contatos.toString());
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numero = null;
        if(!contatos.isEmpty()) {
            numero = contatos.get(nome);
        }
        return numero;
    }
}
class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Joao",15991);
        agenda.adicionarContato("Jose",15992);
        agenda.adicionarContato("Jose",15993);
        System.out.println(agenda.pesquisarPorNome("Jose"));
    }
}
