package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Category;
import DevDojoJavaJiraya.ZZEstreams.dominio.Promotion;
import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
    private static Promotion getPromotion(Serie s) {
        return s.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }

    public static void main(String[] args) {
        // Sumario por categoria
        Map<Category, DoubleSummaryStatistics> collect = series.stream()
                .collect(groupingBy(Serie::getCategory, summarizingDouble(Serie::getPrice)));
        System.out.println(collect);

        // Mostrando tipo de promotion contido dentro de cada categoria
        Map<Category, Set<Promotion>> collect1 = series.stream()
                .collect(groupingBy(Serie::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);
        // Usando Linked HashSet (preserva ordem de inserção)
        Map<Category, LinkedHashSet<Promotion>> collect2 = series.stream()
                .collect(groupingBy(Serie::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);


    }
}
