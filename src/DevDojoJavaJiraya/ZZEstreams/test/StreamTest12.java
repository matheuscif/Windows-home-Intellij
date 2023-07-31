package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Category;
import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        // FILTRANDO CATEGORIAS SEM COLLECTOR GROUPBY
        Map<Category, List<Serie>> categorySerieMap = new HashMap<>();
        List<Serie> fantasy = new ArrayList<>();
        List<Serie> comedy = new ArrayList<>();
        List<Serie> drama = new ArrayList<>();

        for (Serie serie : series) {
            switch (serie.getCategory()){
                case DRAMA: drama.add(serie); break;
                case FANTASY: fantasy.add(serie); break;
                case COMEDY: comedy.add(serie); break;
            }
        }
        categorySerieMap.put(Category.DRAMA, drama);
        categorySerieMap.put(Category.COMEDY, comedy);
        categorySerieMap.put(Category.FANTASY, fantasy);
        System.out.println(categorySerieMap);

        // COM COLLECTOR
        Map<Category, List<Serie>> collect = series.stream().collect(Collectors.groupingBy(Serie::getCategory));
        System.out.println(collect);
    }
}
