package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.ArrayList;
import java.util.Scanner;
/* Crie um programa onde o usuário possa digitar cinco valores numéricos e cadastre-os em uma lista
, já na posição correta de inserção (sem usar o sort()). No final, mostre a lista ordenada na tela. */
public class Listas80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int valor;

        for (int i = 0; i < 5; i++) {
            System.out.println("Adicione um número a lista:");
            valor = scanner.nextInt();

            if (i == 0 || valor > lista.get(lista.size() - 1)) {
                lista.add(valor);
            } else {
                for (int j = 0; j < lista.size(); j++) {
                    if (lista.get(j) > valor) {
                        lista.add(j, valor);
                        break;
                    }
                }
            }
        }
        System.out.println(lista);

    }
}
