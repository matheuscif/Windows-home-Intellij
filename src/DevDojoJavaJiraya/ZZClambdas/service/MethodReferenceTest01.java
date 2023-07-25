package DevDojoJavaJiraya.ZZClambdas.service;

import DevDojoJavaJiraya.ZZClambdas.dominio.Serie;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    // REFERENCE TO A STATIC METHOD
    public static void main(String[] args) {
        List<Serie> serieList = new ArrayList<>(List.of(new Serie("Breaking Bad", 65), new Serie("Once Upon a Time", 200), new Serie("Narcos", 45)));

        serieList.sort(SerieComparator::compareByTitle);
        serieList.sort(SerieComparator::compareByEpisodes);
        System.out.println(serieList);
    }
}
