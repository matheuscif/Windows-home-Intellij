package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Category;
import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<Serie> series = new ArrayList<>(List.of(
            new Serie("The Boys", 8.99, Category.FANTASY),
            new Serie("Once upon a time", 3.99, Category.FANTASY),
            new Serie("Vikings", 5.99, Category.DRAMA),
            new Serie("Narcos", 2.99, Category.DRAMA),
            new Serie("Friends", 5.99, Category.COMEDY),
            new Serie("Knight Rider", 1.99, Category.FANTASY),
            new Serie("Knight Rider", 1.99, Category.FANTASY),
            new Serie("Mad Men", 4.00, Category.DRAMA)
    ));
// MOSTRAR MAIOR PREÇO AGRUPANDO POR CATEGORIA
    public static void main(String[] args) {
        // contando quantos tem de cada categoria
        Map<Category, Long> collect = series.stream().collect(groupingBy(Serie::getCategory, counting()));
        System.out.println(collect);

        // pegando maior preço de cada categoria, collectingAndThen para usar o método get do Optional e remove-lo do out
        Map<Category, Serie> collect1 = series.stream()
                .collect(groupingBy(Serie::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Serie::getPrice)), Optional::get)));
        System.out.println(collect1);

        // maneira sugerida pelo intellij
        Map<Category, Serie> collect2 = series.stream()
                .collect(Collectors.toMap(Serie::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Serie::getPrice))));
        System.out.println(collect2);



    }
}
