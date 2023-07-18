package DevDojoJavaJiraya.Ycolecoes.test;

import DevDojoJavaJiraya.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    }
}
