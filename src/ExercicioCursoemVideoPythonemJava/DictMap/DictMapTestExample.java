package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictMapTestExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> aluno = new HashMap<>();

        int opcao;

        do {
            System.out.println("0 - Sair.");
            System.out.println("1 - Adicionar aluno e média no dicionário."); // put(key,value)
            System.out.println("2 - Consultar nota pelo nome."); // get(key)
            System.out.println("3 - Verificar se aluno existe."); // containsKey(key)
            System.out.println("4 - Verificar se algum aluno tirou nota específica."); //containsValue(value)
            System.out.println("5 - Remova um aluno"); // remove(key)
            System.out.println("6 - Quantidade de alunos."); // size()
            System.out.println("7 - Nome de todos os alunos."); // keySet()
            System.out.println("8 - Retorna todas as notas."); // values()
            System.out.println("9 - Retorna todos os nomes e notas."); // entrySet()

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("(S) para sair.");
                while (true) {
                    System.out.println("Nome do aluno:");
                    String nome = scanner.next();

                    if (nome.equalsIgnoreCase("S")) {
                        break;
                    }

                    System.out.println("Média do aluno:");
                    double media = scanner.nextDouble();

                    aluno.put(nome, media);
                }
            } else if (opcao == 2) {
                System.out.println("(S) para sair.");
                while (true) {
                    System.out.println("Nome do aluno que deseja saber a nota:");
                    String nome = scanner.next();

                    if (nome.equalsIgnoreCase("S")) {
                        break;
                    }

                    System.out.println("Nota = " + aluno.get(nome));
                }
            } else if (opcao == 3) {
                // 3 - Verificar se aluno existe."); // containsKey(key)
            } else if (opcao == 4) {
                // 4 - Verificar se algum aluno tirou nota específica."); //containsValue(value)
            } else if (opcao == 5) {
                // 5 - Remova um aluno"); // remove(key)
            } else if (opcao == 6) {
                // 6 - Quantidade de alunos."); // size()
            } else if (opcao == 7) {
                // 7 - Nome de todos os alunos."); // keySet()
            } else if (opcao == 8) {
                // 8 - Retorna todas as notas."); // values()
            } else if (opcao == 9) {
                // 9 - Retorna todos os nomes e notas."); // entrySet()
            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

    }
}
