package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.ArrayList;
import java.util.Scanner;
public class TestArraysList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ArrayList<String> clientes = new ArrayList<>();

        do{
            System.out.println("----------------------------------------");
            System.out.println("1 - Add item a lista.");
            System.out.println("2 - Mostrar toda lista.");
            System.out.println("3 - Remove uma posição.");
            System.out.println("4 - Verifique o valor em uma posição.");
            System.out.println("5 - Verifica se a lista esta vazia.");
            System.out.println("6 - Verifica se valor existe.");
            System.out.println("7 - Consultar tamanho do array.");
            System.out.println("8 - Finalizar Script.");
            System.out.println("----------------------------------------");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Digite uma String para add a lista:");
                clientes.add(scanner.next());
            } else if (opcao == 2) {
                System.out.println(clientes);
            } else if (opcao == 3) {
                System.out.println("Digite a posição do item que deseja remover:");
                System.out.println(clientes.remove(scanner.nextInt()) + " foi removida com sucesso!"); // Tem que passar
                // um inteiro
            } else if (opcao == 4) {
                System.out.println("Digite a posição que deseja verificar o valor:");
                System.out.println(clientes.get(scanner.nextInt()));
            } else if (opcao == 5) {
                System.out.println(clientes.isEmpty());
            } else if (opcao == 6) {
                System.out.println("Digite a string que deseja verificar se está dentro da lista:");
                System.out.println(clientes.contains(scanner.next()));
            } else if (opcao == 7) {
                System.out.println("Tamanho da lista = " + clientes.size());
            }
        } while (opcao != 8);


    }
}
