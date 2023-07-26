package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<Serie> series = new ArrayList<>(List.of(
            new Serie("The Boys", 8.99),
            new Serie("Once upon a time", 3.99),
            new Serie("Vikings", 5.99),
            new Serie("Narcos", 2.99),
            new Serie("Friends", 5.99),
            new Serie("Knight Rider", 1.99),
            new Serie("Knight Rider", 1.99),
            new Serie("Mad Men", 4.00)
    ));

    public static void main(String[] args) {
        Stream<Serie> stream = series.stream();
        series.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(s -> s.getPrice() <= 4)
                .count();
        System.out.println(count);
    }
}
