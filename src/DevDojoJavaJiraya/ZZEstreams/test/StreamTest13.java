package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Category;
import DevDojoJavaJiraya.ZZEstreams.dominio.Promotion;
import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static DevDojoJavaJiraya.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static DevDojoJavaJiraya.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
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

    public static void main(String[] args) {
        // passando enum promotion
        Map<Promotion, List<Serie>> collect = series
                .stream()
                .collect(groupingBy(StreamTest13::getPromotion));
        System.out.println(collect);

        // passando categoria e depois enum promotion
        Map<Category, Map<Promotion, List<Serie>>> collect1 = series
                .stream()
                .collect(groupingBy(Serie::getCategory, groupingBy(StreamTest13::getPromotion)));
        System.out.println(collect1);
    }


    private static Promotion getPromotion(Serie serie) {
        return serie.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
