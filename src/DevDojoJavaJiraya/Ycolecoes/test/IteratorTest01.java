package DevDojoJavaJiraya.Ycolecoes.test;

import DevDojoJavaJiraya.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>(6);
        filmes.add(new Filme(5L, "Ilha do Medo", 20.1, 3));
        filmes.add(new Filme(1L, "Baby Driver", 9.5, 0));
        filmes.add(new Filme(4L, "Peter Pan", 3.2, 2));
        filmes.add(new Filme(3L, "Alice no País das Maravilhas", 11.20, 1));
        filmes.add(new Filme(2L, "Daredevill", 2.99, 0));

        // Iterator puro
//       Iterator<Filme> filmeIterator = filmes.iterator();
//        while (filmeIterator.hasNext()) {
//            if (filmeIterator.next().getQuantidade() == 0) {
//                filmeIterator.remove();
//            }
//        }

        filmes.removeIf(filme -> filme.getQuantidade() == 0);
        System.out.println(filmes);
    }
}
