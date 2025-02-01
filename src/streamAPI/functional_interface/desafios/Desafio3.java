package streamAPI.functional_interface.desafios;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Desafio 3 - Verifique se todos os números da lista são positivos:
 * Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> VerificarPositivo = num -> num > 0;

        List<Integer> numerosPositivos = numeros.stream().filter(VerificarPositivo).toList();

        numerosPositivos.forEach(System.out::println);
    }
}
