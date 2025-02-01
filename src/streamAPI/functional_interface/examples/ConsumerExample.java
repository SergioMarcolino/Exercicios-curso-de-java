package streamAPI.functional_interface.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usar o Consumer com espressão lambida para imprimir números pares
        Consumer<Integer> imprimirNumerosPares = num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        };

        //Usar o Consumer para imprimir numeros pares no stream
        numeros.stream().forEach(n ->{
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

    }
}
