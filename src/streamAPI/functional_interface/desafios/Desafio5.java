package streamAPI.functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Desafio 5 - Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double soma = numeros.stream().mapToInt(Integer::intValue).sum();
        long quantidade = numeros.stream().count();

        if (quantidade > 0){
           double resultado = soma / quantidade;
           System.out.printf("Média é: %.2f\n", resultado );
        }
    }
}
