package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/*
DICA : fazer lista contendo 3 dicionarios
 Crie um programa que leia nome, sexo e idade de várias pessoas, guardando os dados de cada pessoa em um dicionário
  e todos os dicionários em uma lista. No final, mostre:
   A) Quantas pessoas foram cadastradas
   B) A média de idade
   C) Uma lista com as mulheres
   D) Uma lista de pessoas com idade acima da média
 */
public class DictMap94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ms = 0;
        int soma = 0;
        // String ksexo = "sexo";
        String kidade = "idade";

        List<Map<String, List<Map<String, ?>>>> listaPrincipal = new ArrayList<>();

        while (true) {
            System.out.println("Nome(ou sair):");
            String nome = scanner.next();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Idade:");
            int idade = scanner.nextInt();
            soma += idade;

            System.out.println("Sexo: [F/M]:");
            String sexo = scanner.next();

            // EMPACOTANDO DADOS
            // A) 2X DICTS INTERNOS E ADD A LISTA2
            Map<String, String> gender = new HashMap<>();
            gender.put("sexo", sexo);

            Map<String, Integer> age = new HashMap<>();
            age.put(kidade, idade);

            List<Map<String, ?>> listaDados = new ArrayList<>();
            listaDados.add(gender);
            listaDados.add(age);

            // B) ADD LISTA2 A DICT NOME
            Map<String, List<Map<String, ?>>> pessoa = new HashMap<>();
            pessoa.put(nome, listaDados);

            // C) ADD DICT NOME A LISTA PRINCIPAL
            listaPrincipal.add(pessoa);

        }

        // A) Quantas pessoas foram cadastradas
        System.out.println(listaPrincipal.size() + " pessoas foram cadastradas.");
        // B) A média de idade
        int media = soma / listaPrincipal.size();
        System.out.println("Média das idades: " + media);
        // C) Uma lista com as mulheres
        for (int i = 0; i < listaPrincipal.size(); i++) {

        }
        System.out.println(ms);
        //for (Map<String, List<Map<String, ?>>> pessoas : listaPrincipal) {
        //    for (Map.Entry<String, ?> entry : pessoas.entrySet()) {
        //        System.out.println(listaPrincipal.get());
        //
        //    }
        //}

        // D) Uma lista de pessoas com idade acima da média
    }
}