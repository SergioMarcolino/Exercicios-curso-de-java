package streamAPI.functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Desafio 6 - Verificar se a lista contém algum número maior que 10:
 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */
public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maior10 = numeros.stream().anyMatch(n -> n > 10);

        if (maior10) {
            System.out.println("Maior 10");
        }
        else{
            System.out.println("Menor 10");
        }
    }
}
