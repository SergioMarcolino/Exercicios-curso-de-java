package streamAPI.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {
    public static void main(String[] args) {
        //Cria uma lista  de nomes
        List<String> nomes = Arrays.asList("João", "Pedro", "Maria" );

        //Cria um Predicate com lambidas
        Predicate<String> quadroLetras = nome -> nome.length() == 4;

        List<String> nomesQuadro = nomes.stream()
                //filter é usado para filtrar os verdadeiros que correspondem ao argumento colocado
                .filter(quadroLetras)
                //Armazena em uma lista
                .toList();

        //Imprimir lista
        nomesQuadro.forEach(System.out::println);
    }
}
