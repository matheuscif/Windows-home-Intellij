package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/*
 Crie um programa que gerencie o aproveitamento de um jogador de futebol. O programa vai ler o nome do jogador e quantas
  partidas ele jogou. Depois vai ler a quantidade de gols feitos em cada partida.
   No final, tudo isso será guardado em um dicionário, incluindo o total de gols feitos durante o campeonato.
 */
public class DictMap93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gols = 0;

        Map<String, Integer> jogador = new HashMap<>();

        System.out.println("Digite o nome do jogador:" );
        String nome = scanner.next();
        System.out.println("Quantas partidas jogou?");
        int partidas = scanner.nextInt();

        for (int i = 1; i < partidas + 1; i++) {
            System.out.println("Quantos gols na partida " + i + ":");
            gols += scanner.nextInt();
        }

        jogador.put(nome, gols);

        System.out.println(jogador.entrySet());
    }
}
