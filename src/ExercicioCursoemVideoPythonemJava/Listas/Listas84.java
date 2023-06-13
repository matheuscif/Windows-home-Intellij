package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
import java.util.ArrayList;

/* Exercício Python 084: Faça um programa que leia nome e peso de várias pessoas,
guardando tudo em uma lista. No final, mostre:
A) Quantas pessoas foram cadastradas.
B) Uma listagem com as pessoas mais pesadas.
C) Uma listagem com as pessoas mais leves. */
public class Listas84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        Double maiorPeso = 0.0;
        Double menorPeso = 1000.0;

        ArrayList<ArrayList<?>> listaPrincipal = new ArrayList<>();
        ArrayList<String> listaNomes = new ArrayList<>();
        ArrayList<Double> listaPeso = new ArrayList<>();
        ArrayList<Integer> listaIndexMaiorPeso = new ArrayList<>();
        ArrayList<Integer> listaIndexMenorPeso = new ArrayList<>();

        listaPrincipal.add(listaNomes);
        listaPrincipal.add(listaPeso);

        while (true) {
            System.out.println("Digite o nome [N para sair]:");
            nome = scanner.next();
            if (nome.equals("N")) {
                break;
            } else {
                listaNomes.add(nome);

                System.out.println("Digite um peso para " + listaNomes.get(listaNomes.size() - 1) + ":");
                listaPeso.add(scanner.nextDouble());
            }
        }

        // Descobrir maior e menor peso
        for (int i = 0; i < listaPeso.size() - 1; i++){
            if (listaPeso.get(i) > maiorPeso) {
                maiorPeso = listaPeso.get(i);
            }
            if (listaPeso.get(i) < menorPeso) {
                menorPeso = listaPeso.get(i);
            }
        }
        // Descobrir index dos maiores e menores pesos
        for (int i = 0 ; i < listaPeso.size() - 1; i++) {
            if (listaPeso.get(i).equals(maiorPeso)) {
                listaIndexMaiorPeso.add(i);
            }
            if (listaPeso.get(i).equals(menorPeso)  ) {
                listaIndexMenorPeso.add(i);
            }
        }
        // prints Nome maior, Nome menor peso
        System.out.println(listaPrincipal);

        System.out.println("O maior peso foi " + maiorPeso + " de:");
        for (Integer value : listaIndexMaiorPeso) {
            System.out.print(listaNomes.get(value) + ", ");
        }

        System.out.println("\nO menor peso foi " + menorPeso + " de:");
        for (Integer integer : listaIndexMenorPeso) {
            System.out.print(listaNomes.get(integer) + ", ");
        }

    }
}
