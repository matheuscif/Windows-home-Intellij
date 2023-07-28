package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    // REDUCE
    private static List<Serie> series = new ArrayList<>(List.of(
            new Serie("The Boys", 8.99),
            new Serie("Once upon a time", 3.99),
            new Serie("Vikings", 5.99),
            new Serie("Narcos", 2.99),
            new Serie("Friends", 5.99),
            new Serie("Knight Rider", 1.99),
            new Serie("Mad Men", 4.00)
    ));

    public static void main(String[] args) {
        // retornar a soma dos preços maiores que 3:
        // A) Com wrapper
        series.stream()
                .map(Serie::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
        // B) primitivo (mais eficiente e pode ser armazenado em uma variavel)
        double sumPrice = series.stream()
                .mapToDouble(Serie::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sumPrice);

    }
}
