package streamAPI.functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Desafio 2 - Imprima a soma dos números pares da lista:
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */
public class Desafio2 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isDivisible = num -> num % 2 == 0;
        int  resultado = numeros.stream()
                .filter(isDivisible)
                .reduce(0, (x, y) -> x + y);

        System.out.println(resultado);


    }
}
