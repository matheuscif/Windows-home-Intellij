package DevDojoJavaJiraya.Ycolecoes.test;

import DevDojoJavaJiraya.Ycolecoes.dominio.Consumidor;
import DevDojoJavaJiraya.Ycolecoes.dominio.Filme;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Cillian Murphy");
        Consumidor consumidor2 = new Consumidor("Taylor Swift");

        Filme filme1 = new Filme(5L, "Ilha do Medo", 20.1);
        Filme filme2 =new Filme(1L, "Baby Driver", 9.5);
        Filme filme3 = new Filme(4L, "Peter Pan", 3.2);
        Filme filme4 =new Filme(3L, "Alice no País das Maravilhas", 11.20);
        Filme filme5 =new Filme(2L, "Daredevill", 2.99);

        Map<Consumidor, Filme> consumidorFilme = new HashMap<>();
        consumidorFilme.put(consumidor1, filme1);
        consumidorFilme.put(consumidor2, filme4);

        for (Map.Entry<Consumidor, Filme> entry : consumidorFilme.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
