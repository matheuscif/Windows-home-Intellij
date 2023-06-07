package TrabalhoVetor;

import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao;

        //to do (Garantir que o tamanho seja positivo e inteiro)
        // MUDAR TODOS OS FILTROS DE NUMERO INTEIRO..
        do {
            System.out.println("Digite o valor do tamanho do vetor:");
            while (!scanner.hasNextInt()) {
                System.out.println("Valor inválido! Digite outro valor");
                scanner.next();
            }
            tamanho = scanner.nextInt();
        } while (tamanho <= 0);


        //int [] vetor;
        String [] vetor = new String[tamanho];

        do {
            System.out.println("Operação 1 - Inserir todos elementos do vetor.");
            System.out.println("Operação 2 - Mostrar todos elementos do vetor.");
            System.out.println("Operação 3 - Monstrar elemento indicando vetor.");
            System.out.println("Operação 4 - Remover elemento indicando vetor.");
            System.out.println("Operação 5 - Finalizar o programa.\n");

            //to do (Garantir que o usuário informe uma operação válida)
            do {
                System.out.println("Informe a operação desejada:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Digite uma operação válida...");
                    scanner.next();
                }
                operacao = scanner.nextInt();
            } while (operacao <= 0 || operacao > 5);

            if (operacao == 1) {
                //operacao é 1.
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Insira um valor no vetor na posição " + i + ".");
                    vetor[i] = scanner.next();
                }
            } else if (operacao == 2) {
                //operacao 2.
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("vetor[" + i + "] = " + vetor[i]);
                }
            } else if (operacao == 3) {
                // operacao 3 consultar por índice
                int indice = -1;
                do {
                    System.out.println("Digite o índice que deseja visualizar:");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Índice não encontrado, digite outro...");
                        scanner.next();
                    }
                    indice = scanner.nextInt();
                } while (indice < 0 || indice > tamanho);
                System.out.println("vetor[" + indice + "] = " + vetor[indice]);
            } else if (operacao == 4) {
                continue;
                /* int indice = -1;
                do {
                    System.out.println("Digite o vetor que deseja remover: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Vetor não encontrado, digite outro...");
                        scanner.next();
                    }
                    indice = scanner.nextInt();
                } while (indice < 0 || indice > tamanho); */


            }




        } while (operacao != 5);




    }
}