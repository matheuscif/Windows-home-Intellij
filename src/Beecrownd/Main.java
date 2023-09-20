package Beecrownd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            int posicao = scanner.nextInt();
            if (posicao != 1) {
                int posicaoMeio = posicao / 2;
                list.add(posicaoMeio);
            }
            if (posicao == 1) {
                list.add(1);
            }



        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
