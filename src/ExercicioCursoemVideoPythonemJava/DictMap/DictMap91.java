package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.Comparator;
/*  Crie um programa onde 4 jogadores joguem um dado e tenham resultados aleatórios. Guarde esses resultados em um
dicionário em java. No final, coloque esse dicionário em ordem, sabendo que o vencedor tirou o maior número no dado.
não faz sentido fazer esse exercício em java pq maps não tem ordenação!
De um jeito + díficil posso fazer um ArrayList com HashMap e ordenar o arraylist pelo value
só que é tão complicado que nem faz sentido
*/
public class DictMap91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        Map<String, Integer> jogo = new HashMap<>();

        for (int i = 1; i < 5; i++) {
            String jogador = "Jogador " + i;
            int dado = random.nextInt(1,6);
            jogo.put(jogador, dado);

        }

        List<Map.Entry<String, Integer>> resultado = new ArrayList<>(jogo.entrySet());
        resultado.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entrada : resultado) {
            System.out.println(entrada.getKey() + " " + entrada.getValue());

        }

    }
}
