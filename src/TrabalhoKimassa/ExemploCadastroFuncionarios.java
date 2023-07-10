package TrabalhoKimassa;

import java.util.Scanner;

public class ExemploCadastroFuncionarios {
    // EXIBIR CADASTRO
    public static void exibirCadastro(String[][] matriz, int linhas, int colunas) {
        System.out.println("    NOME | SEXO | IDADE | SALÁRIO ");
        for (int i = 0; i < linhas; i++) {
            System.out.print((i + 1) + " - ");
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    // CADASTRAR FUNCIONÁRIOS
    public static void cadastrarFuncionario(String[][] matriz, int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);
        int linha;

        exibirCadastro(matriz, linhas, colunas);
        do {
            System.out.println("Informe onde você deseja inserir o funcionário (valores de 1 a " + linhas + "):");
            linha = scanner.nextInt();
        } while (linha < 1 || linha > linhas);

        System.out.println("Insira o nome do funcionário: ");
        matriz[linha - 1][0] = scanner.next();
        System.out.println("Insira o sexo do funcionário (M/F): ");
        matriz[linha - 1][1] = scanner.next().toUpperCase();
        System.out.println("Insira a idade do funcionário: ");
        matriz[linha - 1][2] = scanner.next();
        System.out.println("Insira o salário do funcionário: ");
        matriz[linha - 1][3] = scanner.next();
        System.out.println("Funcionário adicionado.");
    }

    // CALCULAR SALÁRIO TOTAL
    public static double calcularSalarioTotal(String[][] matriz, int linhas, int colunas) {
        double salarioTotal = 0.0;
        for (int i = 0; i < linhas; i++) {
            salarioTotal += Double.parseDouble(matriz[i][3]);
        }
        return salarioTotal;
    }

    // CALCULAR MÉDIA SALARIAL
    public static double calcularMediaSalarial(String[][] matriz, int linhas, int colunas) {
        double salarioTotal = calcularSalarioTotal(matriz, linhas, colunas);
        return salarioTotal / linhas;
    }

    // CALCULAR MÉDIA SALARIAL POR SEXO
    public static double calcularMediaSalarialPorSexo(String[][] matriz, int linhas, int colunas, char sexo) {
        int contador = 0;
        double salarioTotal = 0.0;
        for (int i = 0; i < linhas; i++) {
            if (matriz[i][1].equalsIgnoreCase(String.valueOf(sexo))) {
                salarioTotal += Double.parseDouble(matriz[i][3]);
                contador++;
            }
        }
        if (contador > 0) {
            return salarioTotal / contador;
        } else {
            return 0.0;
        }
    }

    // CALCULAR MÉDIA DE IDADE
    public static double calcularMediaIdade(String[][] matriz, int linhas, int colunas) {
        int idadeTotal = 0;
        for (int i = 0; i < linhas; i++) {
            idadeTotal += Integer.parseInt(matriz[i][2]);
        }
        return (double) idadeTotal / linhas;
    }

    // DEMITIR FUNCIONÁRIO
    public static void demitirFuncionario(String[][] matriz, int linhas, int colunas, String nome) {
        boolean encontrado = false;
        for (int i = 0; i < linhas; i++) {
            if (matriz[i][0].equalsIgnoreCase(nome)) {
                encontrado = true;
                matriz[i][0] = "";
                matriz[i][1] = "";
                matriz[i][2] = "";
                matriz[i][3] = "";
                break;
            }
        }
        if (encontrado) {
            System.out.println("Funcionário demitido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tabelaFuncionarios;
        int funcionarios, opcao;
        int colunas = 4;
        String nomeFuncionario;

        System.out.println("Insira a quantidade de Funcionários na empresa:");
        funcionarios = scanner.nextInt();

        tabelaFuncionarios = new String[funcionarios][colunas];

        do {
            System.out.println("""
                    Escolha uma opção:
                     1 - Exibir Tabela de Cadastro de Funcionários.
                     2 - Inserir Funcionários.
                     3 - Calcular valor total salarial.
                     4 - Calcular Média Salarial.
                     5 - Calcular Média de Idade da empresa.
                     6 - Calcular Média salarial por sexo, da empresa.
                     7 - Demitir Funcionário.
                     0 - Sair.
                    """);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    exibirCadastro(tabelaFuncionarios, funcionarios, colunas);
                    break;
                case 2:
                    cadastrarFuncionario(tabelaFuncionarios, funcionarios, colunas);
                    break;
                case 3:
                    double salarioTotal = calcularSalarioTotal(tabelaFuncionarios, funcionarios, colunas);
                    System.out.println("O valor total salarial é: R$" + salarioTotal);
                    break;
                case 4:
                    double mediaSalarial = calcularMediaSalarial(tabelaFuncionarios, funcionarios, colunas);
                    System.out.println("A média salarial é: R$" + mediaSalarial);
                    break;
                case 5:
                    double mediaIdade = calcularMediaIdade(tabelaFuncionarios, funcionarios, colunas);
                    System.out.println("A média de idade da empresa é: " + mediaIdade);
                    break;
                case 6:
                    System.out.println("Insira o sexo (M/F) para calcular a média salarial: ");
                    char sexo = scanner.next().toUpperCase().charAt(0);
                    double mediaSalarialPorSexo = calcularMediaSalarialPorSexo(tabelaFuncionarios, funcionarios, colunas, sexo);
                    if (mediaSalarialPorSexo > 0.0) {
                        System.out.println("A média salarial para o sexo " + sexo + " é: R$" + mediaSalarialPorSexo);
                    } else {
                        System.out.println("Não há funcionários cadastrados com o sexo " + sexo);
                    }
                    break;
                case 7:
                    System.out.println("Insira o nome do funcionário a ser demitido: ");
                    nomeFuncionario = scanner.next();
                    demitirFuncionario(tabelaFuncionarios, funcionarios, colunas, nomeFuncionario);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
