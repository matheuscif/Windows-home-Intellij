package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
import java.util.ArrayList;
/* Crie um programa que vai ler vários números e colocar
 em uma lista. Depois disso, crie duas listas extras que vão conter apenas
 os valores pares e os valores ímpares digitados, respectivamente. Ao final, mostre o conteúdo das três listas geradas.*/
public class Listas82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();
        int value = 0;

        while (value != 999) {
            System.out.println("Add um número a lista [999 = sair]:");
            value = scanner.nextInt();
            lista.add(value);
        }
        lista.remove(lista.size() -1);
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) % 2 == 0) {
                par.add(lista.get(i));
            } else {
                impar.add(lista.get(i));
            }
        }
        System.out.println("Lista Completa: " + lista);
        System.out.println("Lista Pares: " + par);
        System.out.println("Lista Ímpares: " + impar);
    }
}
