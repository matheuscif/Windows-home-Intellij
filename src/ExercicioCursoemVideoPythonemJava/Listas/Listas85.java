package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/*Crie um programa onde o usuário possa digitar sete valores numéricos e cadastre-os em uma lista única que mantenha
separados os valores pares e ímpares. No final, mostre os valores pares e ímpares em ordem crescente. */
public class Listas85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;

        ArrayList<ArrayList<Integer>> listaPrincipal = new ArrayList<>();
        ArrayList<Integer> listaPar = new ArrayList<>();
        ArrayList<Integer> listaImpar = new ArrayList<>();

        listaPrincipal.add(listaPar);
        listaPrincipal.add(listaImpar);

        for (int i = 0; i < 7; i++){
            System.out.println("Adicione um número a lista:");
            value = scanner.nextInt();

            if (value % 2 == 0) {
                listaPar.add(value);
            } else {
                listaImpar.add(value);
            }
        }
        Collections.sort(listaPar);
        Collections.sort(listaImpar);

        System.out.println(listaPrincipal);

    }
}
