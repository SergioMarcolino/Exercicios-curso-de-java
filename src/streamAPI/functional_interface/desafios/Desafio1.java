package streamAPI.functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Desafio 1 - Mostre a lista na ordem numérica:
 * Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
 */
public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 3, 2, 4, 5, 6, 7, 8, 9, 10);

        numeros.stream().sorted().forEach(System.out::println);
    }
}
