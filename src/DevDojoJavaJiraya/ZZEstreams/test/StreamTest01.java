package DevDojoJavaJiraya.ZZEstreams.test;

import DevDojoJavaJiraya.ZZEstreams.dominio.Serie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
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
        series.sort(Comparator.comparing(Serie::getTitle));
        List<String> titles = new ArrayList<>();
        for (Serie serie : series) {
            if(serie.getPrice() <= 4) {
                titles.add(serie.getTitle());
            }
            if(titles.size() >=3) {
                break;
            }
        }
        System.out.println(series);
        System.out.println(titles);
    }
}

