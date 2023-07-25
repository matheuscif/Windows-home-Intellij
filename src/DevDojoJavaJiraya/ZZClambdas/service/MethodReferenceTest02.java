package DevDojoJavaJiraya.ZZClambdas.service;

import DevDojoJavaJiraya.ZZClambdas.dominio.Serie;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    // Reference to an instance method of particular object
    public static void main(String[] args) {
        SerieComparator serieComparator = new SerieComparator();
        List<Serie> serieList = new ArrayList<>(List.of(new Serie("Breaking Bad", 65), new Serie("Once Upon a Time", 200), new Serie("Narcos", 45)));

        serieList.sort(serieComparator::compareByEpisodesNonStatic);
//        serieList.sort((a1,a2) -> serieComparator.compareByEpisodesNonStatic(a1,a2)); VERSAO COM LAMBDA MENOS PREFERIDA
        System.out.println(serieList);
    }
}
