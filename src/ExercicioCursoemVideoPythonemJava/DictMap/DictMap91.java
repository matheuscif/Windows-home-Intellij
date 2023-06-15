package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.security.SecureRandom;
/*  Crie um programa onde 4 jogadores joguem um dado e tenham resultados aleatórios. Guarde esses resultados em um
dicionário em java. No final, coloque esse dicionário em ordem, sabendo que o vencedor tirou o maior número no dado.
*/
public class DictMap91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        Map<String, Integer> jogo = new HashMap<>();

        String player1 = "player1";
        String player2 = "player2";
        String player3 = "player3";
        String player4 = "player4";

        int dado1 = random.nextInt(6 + 1);
        int dado2 = random.nextInt(6 + 1);
        int dado3 = random.nextInt(6 + 1);
        int dado4 = random.nextInt(6 + 1);

        

        jogo.put(player1, dado1);
        jogo.put(player2, dado2);
        jogo.put(player3, dado3);
        jogo.put(player4, dado4);



    }
}
