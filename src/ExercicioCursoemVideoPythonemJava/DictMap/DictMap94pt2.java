package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.*;

public class DictMap94pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdade = 0;

        List<Map<String, Object>> pessoas = new ArrayList<>();

        while (true) {
            Map<String, Object> pessoa = new HashMap<>();
            System.out.println("Nome (ou sair):");
            String nome = scanner.next();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            pessoa.put("nome", nome);

            System.out.println("Idade:");
            int idade = scanner.nextInt();
            somaIdade += idade;

            pessoa.put("idade", idade);

            System.out.println("Sexo [F/M]:");
            String sexo = scanner.next();

            pessoa.put("sexo", sexo);

            pessoas.add(pessoa);

        }

        // A) Quantas Pessoas foram cadastradas
        System.out.println(pessoas.size() + " pessoas foram cadastradas.");
        // B) Média de idade
        System.out.println("Média de idade: " + somaIdade / pessoas.size());
        // C) Lista com Mulheres
        List<String> listaMulheres = new ArrayList<>();
        for (Map<String, Object> pessoa : pessoas) {
            String sexo = (String) pessoa.get("sexo");

            if (sexo.equalsIgnoreCase("F")) {
                String nome = (String) pessoa.get("nome");
                listaMulheres.add(nome);
            }
        }

        System.out.println("Lista de mulheres: " + listaMulheres);
        // D) Lista pessoa com idade acima da média
        List<Map<String, Object>> listaIdadeAcimadaMedia  = new ArrayList<>();
        for (Map<String, Object> pessoa : pessoas) {
            int idade = (Integer) pessoa.get("idade");

            if (idade > somaIdade / pessoas.size()) {
                listaIdadeAcimadaMedia.add(pessoa);
            }
        }
        System.out.println("Pessoas com idade acima da média:");
        for (Map<String, Object> pessoa : listaIdadeAcimadaMedia) {
            String nome = (String) pessoa.get("nome");
            int idade = (Integer) pessoa.get("idade");

            System.out.println(nome + " com " + idade + " anos");
        }
    }
}
