package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
/* Aprimore o desafio anterior, mostrando no final:
A) A soma de todos os valores pares digitados.
B) A soma dos valores da terceira coluna .
C) O maior valor da segunda linha.  */
public class Listas87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int line = 3;
        final int column = 3;
        int pares = 0;
        int somaTerColuna = 0;
        int maiorSegLinha = 0;

        int [][] matriz = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Digite um valor para [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();

                // SOMA DOS PARES
                if (matriz[i][j] % 2 == 0) {
                    pares = pares + matriz[i][j];
                }

                // SOMA DA TERCEIRA COLUNA
                if (j == 2) {
                    somaTerColuna = somaTerColuna + matriz[i][j];
                }

                // MAIOR VALOR DA SEGUNDA LINHA
                if (i == 1) {
                    if (matriz [1][0] > matriz[1][1] && matriz[1][0] > matriz[1][2]) {
                        maiorSegLinha = matriz[1][0];
                    } else if (matriz[1][1] > matriz[1][0] && matriz[1][1] > matriz[1][2]) {
                        maiorSegLinha = matriz[1][1];
                    } else {
                        maiorSegLinha = matriz[1][2];
                    }
                }
            }
        }
        // EXIBIR MATRIZ
        for (int i = 0; i < line; i++) {
            for (int j = 0 ; j < column; j++) {
                System.out.printf("%2d |", matriz[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.println("Soma dos pares = " + pares);
        System.out.println("Soma da terceira coluna = " + somaTerColuna);
        System.out.println("Maior da segunda linha = " + maiorSegLinha);
    }
}
