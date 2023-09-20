package Beecrownd;

import java.io.IOException;
import java.util.Scanner;

public class HelpPhd {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();

            if (input.equals("P=NP")) {
                System.out.println("skipped");
            } else {
                String[] parts = input.split("\\+");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);
                int resultado = a + b;
                System.out.println(resultado);
            }
        }

        scanner.close();
    }
}

 