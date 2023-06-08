package TrabalhoVetor;

import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao;

        //to do (Garantir que o tamanho seja positivo e inteiro)
        System.out.println("Informe o tamanho do vetor:");
        tamanho = scanner.nextInt();
        while(tamanho < 0) {
            System.out.println("O valor informado não é válido");
            System.out.println("Informe um valor inteiro e positivo para ser o tamanho do vetor:");
            tamanho = scanner.nextInt();
        }

        int [] vetor = new int[tamanho];
        // String [] vetor = new String[tamanho];

        do {
            System.out.println("Operação 1 - Inserir todos elementos do vetor.");
            System.out.println("Operação 2 - Mostrar todos elementos do vetor.");
            System.out.println("Operação 3 - Buscar um elemento do vetor pelo seu índice.");
            System.out.println("Operação 4 - Remover um elemento do vetor pelo seu índice.");
            System.out.println("Operação 5 - Finalizar o programa.\n");

            //to do (Garantir que o usuário informe uma operação válida)
            System.out.println("Informe a operação desejada:");
            operacao = scanner.nextInt();

            while (operacao < 0 || operacao > 5) {
                System.out.println("Operação inválida!");
                System.out.println("Digite um valor válido:");
                operacao = scanner.nextInt();
            }

            if (operacao == 1) {
                //operacao é 1
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Insira um valor no vetor na posição " + i + ".");
                    vetor[i] = scanner.nextInt();
                }
            } else if (operacao == 2) {
                //operacao 2.
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("vetor[" + i + "] = " + vetor[i]);
                }
            } else if (operacao == 3) {
                System.out.println("Informe o índice que deseja visualizar:");
                int indice = scanner.nextInt();

                while(indice < 0 || indice > tamanho) {
                    System.out.println("O valor informado não é positivo.");
                    System.out.println("Informe um valor válido para o vetor:");
                    indice  = scanner.nextInt();
                }
                System.out.println("vetor[" + indice + "] = " + vetor[indice]);
            } else if (operacao == 4) {
                System.out.println("Digite o índice do vetor que deseja remover:");
                int indice = scanner.nextInt();

                while (indice < 0 || indice > tamanho){
                    System.out.println("Digite um índice válido:");
                    indice = scanner.nextInt();
                }

                for(int i = indice; i < tamanho -1; i++) {
                    vetor[i] = vetor[i + 1];
                }

                tamanho = tamanho - 1;

            }
        } while (operacao != 5);
    }
}