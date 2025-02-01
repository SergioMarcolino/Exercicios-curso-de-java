package streamAPI.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryoperationExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BinaryOperator<Integer> sum = (a,b) ->  a + b;

        int resultado = numbers.stream()
                .reduce(0,sum);

        System.out.println(resultado);

    }
}
