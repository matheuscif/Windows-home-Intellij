package ExercicioCursoemVideoPythonemJava.DictMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/*
Faça um programa que leia nome e média de um aluno, guardando também a situação em um dicionário.
No final, mostre o conteúdo da estrutura na tela.
* */
public class DictMap90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> boletim = new HashMap<>();

        while (true) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.next();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            } 
            
            System.out.println("Digite a nota de " + nome);
            double nota = scanner.nextDouble();

            if (nota < 7.0) {
                boletim.put(nome, "Reprovado");
            } else {
                boletim.put(nome, "Aprovado");
            }


        }

        System.out.println(boletim.entrySet());

        scanner.close();
    }
}
