package collections.arrayList.SomaDosNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;
    public SomaNumeros() {

        numeros = new ArrayList<Integer>();
    }

    public void  adicionarNumero(int  numero){
        numeros.add(numero);

    }
    public int somaNumeros() {
        int soma = 0;
        for(Integer numero : numeros){
            soma += numero;
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maior = 0;
        for (Integer numero : numeros) {
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor = 0;
        for (Integer numero : numeros){
            if (numero < menor ){
                menor = numero;
            }
        }
        return menor;
    }
    public List<Integer> exibirLista(){
        return numeros;
    }
}
