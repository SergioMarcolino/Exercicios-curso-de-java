package set.convidado;

import java.util.HashSet;
import java.util.Set;

public class conjuntoDeConvidados {
    //atributo
    private Set<convidado> ConjuntoDeConvidados;

    public conjuntoDeConvidados() {
        this.ConjuntoDeConvidados = new HashSet<convidado>();
    }

    public void adicionarConvidado(String nome, int codigo) {
       ConjuntoDeConvidados.add(new convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        convidado convidadoParaRemover = null;
        for (convidado c : ConjuntoDeConvidados){
            if (c.getCodigo() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
            else {
                throw new RuntimeException("Não há convidado com o codigo "+codigoConvite);
            }
        }
        ConjuntoDeConvidados.remove(codigoConvite);
    }
    public int contarConvidados(){
        return ConjuntoDeConvidados.size();
    }
     public void exibirConvidados(){
         System.out.println(ConjuntoDeConvidados);

     }
}
