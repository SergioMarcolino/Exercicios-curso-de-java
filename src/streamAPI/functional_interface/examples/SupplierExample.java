package streamAPI.functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Usar o Supplier com expressões lambidas para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá Mundo (a)";

        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaucacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //Impreimir as saudações geradas
        listaSaucacoes.forEach(System.out::println);
    }
}
