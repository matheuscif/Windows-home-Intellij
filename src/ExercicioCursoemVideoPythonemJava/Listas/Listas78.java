package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
import java.util.Arrays;
/* Lista que leia 5 valores
* mostra qual é o maior e o menor e suas posições */
public class Listas78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Adicione um vetor para a posição " + i);
            vetor[i] = scanner.nextInt();
        }
        Arrays.sort(vetor);

        for (int value : vetor) {
            System.out.println(value);
        }
    }
}
