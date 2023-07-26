package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
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
        List<String> titles = series.stream()
                .sorted(Comparator.comparing(Serie::getTitle))
                .filter(s -> s.getPrice() <= 4)
                .limit(3)
                .map(Serie::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);
    }
}
