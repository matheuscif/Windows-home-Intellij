package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
import java.util.Arrays;

/* user digita vários valores númericos e cadastra em uma lista
* Caso o número já exista na lista ele não é adicionado
* No fim mostra todos os valores em ordem crescente
* Sempre pergunta se user quer add mais um numero*/
public class Listas79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[100];
        boolean continuar = true;
        int tamanho = 0;


        while(continuar && tamanho < vetor.length) {
            System.out.println("Adicione um número no array ou [0] para encerrar: ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                continuar = false;
            } else {
                boolean jaexiste = false;

                for (int i = 0; i < tamanho; i++) {
                    if (vetor[i] == numero) {
                        jaexiste = true;
                        break;
                    }
                }
                if (!jaexiste) {
                    vetor[tamanho] = numero;
                    tamanho++;
                }
            }

        }
        Arrays.sort(vetor, 0, tamanho);

        for (int i = 0; i < tamanho; i++) {
            System.out.println(i + " " + vetor[i]);
        }

    }
}
