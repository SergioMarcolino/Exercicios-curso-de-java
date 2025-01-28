package set.agendaDeContato;

public class Contato {
    //Attribute
    private String nome;
    private int telefone;

    public Contato(int telefone, String nome) {
        this.telefone = telefone;
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
