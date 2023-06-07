package TrabalhoVetorFiltro4;
import java.util.Scanner;
public class Java4 {
    public static void main(String[] args) {
        int tamanho, valor, aux;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro e positivo para ser o tamanho do vetor:");
        tamanho = scanner.nextInt();

        while (tamanho < 0) {
            System.out.println("O valor informado não é positivo...");
            System.out.println("Informe outro valor para o tamanho:");
            tamanho = scanner.nextInt();
        }

        int [] vetor = new int[tamanho];

        // Preenchendo as posições do meu vetor

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Informe um valor para ser inserido na posição " + i + " do meu vetor:");
            valor = scanner.nextInt();
            vetor[i] = valor;
        }

        // Ordenação BUBBLE SORT
        for (int i = 0; i < tamanho - 1; i++) {
            for(int j = 0; j < tamanho - 1; j++) {
                if(vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }


        // Exibindo o vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }

    }
}
