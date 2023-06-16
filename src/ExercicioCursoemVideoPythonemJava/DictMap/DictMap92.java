package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDateTime;
/*
 Crie um programa que leia nome, ano de nascimento e carteira de trabalho e cadastre-o (com idade) em um dicionário.
 Se por acaso a CTPS for diferente de ZERO, o dicionário receberá também o ano de contratação e o salário.
 Calcule e acrescente, além da idade, com quantos anos a pessoa vai se aposentar.
 */
public class DictMap92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.now();

        int anoAtual = dateTime.getYear();
        int anoAposentadoria = 0;
        int anosTrabalhados = 0;
        String kname = "Nome";
        String kage = "Idade";
        String kctps = "CTPS";
        String ksalary = "Salario";

        Map<String, String> dnome = new HashMap<>();
        Map<String, Integer> didade = new HashMap<>();
        Map<String, Integer> dctps = new HashMap<>();
        Map<String, Double> dsalary = new HashMap<>();

        System.out.println("Nome: ");
        String name = scanner.next();
        dnome.put(kname, name);

        System.out.println("Ano de nascimento: ");
        int aniversario = scanner.nextInt();

        int idade = anoAtual - aniversario;

        didade.put(kage, idade);

        System.out.println("Carteira de trabalho: (0 não tem)");
        int ctps = scanner.nextInt();
        dctps.put(kctps, ctps);

        if (ctps != 0) {
            System.out.println("Ano de contratação: ");
            int anoContratacao = scanner.nextInt();
            int idadeContratado = anoContratacao - aniversario;
            anosTrabalhados = anoAtual - anoContratacao;
            if (idadeContratado > 45) {
                anoAposentadoria = (65 - idade) + anoAtual;
            } else if (anosTrabalhados < 30) {
                anoAposentadoria = (30 - anosTrabalhados) + anoAtual;
            } else {
                anoAposentadoria = anoContratacao + 30;
            }

            System.out.println("Salário:");
            double salario = scanner.nextInt();
            dsalary.put(ksalary, salario);
        }
        System.out.println();
        System.out.println("Nome: " + dnome.get(kname));
        System.out.println("Idade: " + didade.get(kage) + " anos");
        if (ctps != 0) {
            System.out.println("CTPS: " + dctps.get(kctps));
            System.out.println("Salário: " + dsalary.get(ksalary));
            if (anosTrabalhados > 30) {
                System.out.println("Já poderia ter aposentado em " + anoAposentadoria);
            } else {
                System.out.println("Ano da aposentadoria: " + anoAposentadoria);
            }
        }
    }
}
