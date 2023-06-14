package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.security.SecureRandom;
/* Faça um programa que ajude um jogador da MEGA SENA a criar palpites.O programa vai perguntar quantos jogos serão
gerados e vai sortear 6 números entre 1 e 60 para cada jogo, cadastrando tudo em uma lista composta.
OS NUMEROS SORTEADOS NÃO PODEM REPETIR!
 */
public class Listas88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int njogos;

        List<List<Integer>> jogos = new ArrayList<>();

        System.out.println("Quantos jogos da mega deseja gerar?");
        njogos = scanner.nextInt();

        do {
            List<Integer> jogo = new ArrayList<>();
            while (jogo.size() < 6) {
                int randomInt = secureRandom.nextInt(60 + 1);

                if (!jogo.contains(randomInt)) {
                    jogo.add(randomInt);
                }
            }
            jogos.add(jogo);

        } while (jogos.size() < njogos);

        for (List<Integer> jogo : jogos) {
            System.out.println(jogo);
        }
    }
}
