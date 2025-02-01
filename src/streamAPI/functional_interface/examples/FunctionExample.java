package streamAPI.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
         /** Representa uma função que recebe um argumeno do tipo T e retorna um resultado do tipo R.
        * è utilizado para transformar um mapear os elementos do Stream em outros valores ou tipos
         */


public class FunctionExample {
    public static void main(String[] args) {
        //Cria uma lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usar Functions com expressao lambida para fazer o número ao quadrado
        Function<Integer, Integer> enquadradar = num -> num * 4;

        //Usar a função para fazer o (num) ao quadrado e armazenalos em uma lista
        List<Integer> numerosAoQuadrado = numeros.stream()
                .map(enquadradar)
                .toList();

        //Imprimindo a lista ao quadrado
        System.out.println(numerosAoQuadrado);

    }
}
