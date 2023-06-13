package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
/* Crie um programa que declare uma matriz de dimensão 3×3 e preencha com valores lidos pelo teclado. No final,
mostre a matriz na tela, com a formatação correta. */
public class Listas86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int linha = 3;
        final int coluna = 3;

        int [][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++){
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite um número para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
