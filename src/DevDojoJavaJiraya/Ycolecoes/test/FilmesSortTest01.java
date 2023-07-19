package DevDojoJavaJiraya.Ycolecoes.test;

import DevDojoJavaJiraya.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ManageByIdComparator implements Comparator<Filme> {
    @Override
    public int compare(Filme filme1, Filme filme2) {
        return filme1.getId().compareTo(filme2.getId());
    }

}
public class FilmesSortTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>(6);
        filmes.add(new Filme(5L, "Ilha do Medo", 20.1));
        filmes.add(new Filme(1L, "Baby Driver", 9.5));
        filmes.add(new Filme(4L, "Peter Pan", 3.2));
        filmes.add(new Filme(3L, "Alice no País das Maravilhas", 11.20));
        filmes.add(new Filme(2L, "Daredevill", 2.99));

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        // Comparable Sort
        Collections.sort(filmes);
        System.out.println("---------------------");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        // Comparator Sort
        filmes.sort(new ManageByIdComparator());
        System.out.println("-------------------");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }

    }
}
