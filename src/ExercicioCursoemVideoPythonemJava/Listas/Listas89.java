package ExercicioCursoemVideoPythonemJava.Listas;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/* Crie um programa que leia nome e duas notas de vários alunos e guarde tudo em uma lista composta. No final, mostre
 um boletim contendo a média de cada um e permita que o usuário possa mostrar as notas de cada aluno individualmente. */
public class Listas89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<String>> boletim = new ArrayList<>();

        while (true)
        {
            System.out.println("Digite o nome do Aluno (ou sair):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a nota 1:");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a nota 2:");
            double nota2 = scanner.nextDouble();

            scanner.nextLine();

            List<String> aluno = new ArrayList<>();
            aluno.add(nome);
            aluno.add(String.valueOf(nota1));
            aluno.add(String.valueOf(nota2));
            boletim.add(aluno);

        }

        // EXIBIR BOLETIM
        // FOR PARA CADA ITEM DA LISTA
        // VARIAVEIS DEVEM SER DECLARADAS DE NOVO

        System.out.println("BOLETIM");
        for (List<String> aluno : boletim)
        {
         String nome = aluno.get(0);
         double nota1 = Double.parseDouble(aluno.get(1));
         double nota2 = Double.parseDouble(aluno.get(2));
         double media = (nota1 + nota2) / 2;

        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);
        System.out.println();

        }

        System.out.println("NOTAS");

        while (true) {
            System.out.println("Digite o nome do aluno que deseja verificar as notas: (ou sair)");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            boolean alunoEncontrado = false;
            for (List<String> aluno : boletim) {
                if (nome.equalsIgnoreCase(aluno.get(0))) {
                    System.out.println("Nome: " + aluno.get(0));
                    System.out.println("Nota 1 : " + aluno.get(1));
                    System.out.println("Nota 2 : " + aluno.get(2));

                    alunoEncontrado = true;
                    break;
                }
                }
            if (!alunoEncontrado) {
                System.out.println("Aluno não encontrado!");
            }

        }

    }
}
