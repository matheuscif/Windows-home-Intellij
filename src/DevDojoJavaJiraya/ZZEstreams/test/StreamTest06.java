package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(series.stream().anyMatch(ln -> ln.getPrice() > 9));
        System.out.println(series.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(series.stream().noneMatch(ln -> ln.getPrice() < 0));

        // find preço maior que 3
        series.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        series
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(Serie::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);

        series
                .stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(Serie::getPrice))
                .ifPresent(System.out::println);
    }
}
