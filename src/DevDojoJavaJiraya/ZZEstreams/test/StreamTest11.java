package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        // métodos básicos (strema, Collectors)
        System.out.println(series.stream().count());
        System.out.println(series.stream().collect(Collectors.counting()));

        series.stream().max(Comparator.comparing(Serie::getPrice)).ifPresent(System.out::println);
        series.stream().collect(Collectors.maxBy(Comparator.comparing(Serie::getPrice))).ifPresent(System.out::println);

        System.out.println(series.stream().mapToDouble(Serie::getPrice).sum());
        System.out.println(series.stream().collect(Collectors.summingDouble(Serie::getPrice)));

        series.stream().mapToDouble(Serie::getPrice).average().ifPresent(System.out::println);
        System.out.println(series.stream().collect(Collectors.averagingDouble(Serie::getPrice)));

        // Collectors - gerando sumário de preço
        DoubleSummaryStatistics collect = series.stream().collect(Collectors.summarizingDouble(Serie::getPrice));
        System.out.println(collect);

        // Collectors joining titles
        String titles = series.stream().map(Serie::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}
