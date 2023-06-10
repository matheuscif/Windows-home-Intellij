package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

/* Crie um programa que vai ler vários números e colocar em uma lista.
 Depois disso, mostre
 A) Quantos números foram digitados.
B) A lista de valores, ordenada de forma decrescente.
C) Se o valor 5 foi digitado e está ou não na lista. */
public class Listas81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int valor = 0;

        while (valor != 999){
            System.out.println("Adicione um número a lista:");
            valor = scanner.nextInt();
            lista.add(valor);
        }
        lista.remove(lista.size() - 1);
        System.out.println("Tamanho da lista = " + lista.size());
        lista.sort(Collections.reverseOrder());
        System.out.println(lista);
        if (lista.contains(5)) {
            System.out.println("A lista contém o número 5");
        } else {
            System.out.println("A lista não contém o número 5");
        }
    }
}
