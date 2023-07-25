package DevDojoJavaJiraya.ZZClambdas.service;

import DevDojoJavaJiraya.ZZClambdas.dominio.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a Constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<SerieComparator> newSerieComparator = SerieComparator::new;
        SerieComparator serieComparator = newSerieComparator.get();
        List<Serie> serieList = new ArrayList<>(List.of(new Serie("Breaking Bad", 65), new Serie("Once Upon a Time", 200), new Serie("Narcos", 45)));

        serieList.sort(serieComparator::compareByEpisodesNonStatic);
        System.out.println(serieList);

        BiFunction<String, Integer, Serie> serieBiFunction = (title, episodes) -> new Serie(title, episodes);
        BiFunction<String, Integer, Serie> serieBiFunction1 = Serie::new;

        System.out.println(serieBiFunction1.apply("Dexter", 150));
    }
}
