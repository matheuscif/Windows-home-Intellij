package TrabalhoKimassa;
import java.util.Scanner;

public class CadastroFuncionarios {
    // EXIBIR CADASTRO
    public static void exibirCadastro(String [][] matriz, int linhas, int colunas) {
        System.out.println("    NOME | SEXO | IDADE | SALÁRIO ");
        for(int i = 0; i < linhas; i++) {
            System.out.print((i+1) + " - ");
            for(int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " | ");

            }
            System.out.println();
        }
    }

    // CADASTRAR FUNCIONARIOS
    public static void cadastrarFuncionario(String [][] matriz, int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);
        int linha;
        exibirCadastro(matriz, linhas, colunas);
        do {
            System.out.println("Informe onde deseja inserir o funcionário: ");
            linha = scanner.nextInt(); // V***
        } while (linha < 1 ||  linha > linhas);

        System.out.println("Nome: ");
        matriz[linha - 1][0] = scanner.next();

        System.out.println("Sexo (M/F): ");
        matriz[linha - 1][1] = scanner.next();

        System.out.println("Idade: ");
        matriz[linha - 1][2] = scanner.next();

        System.out.println("Salário: ");
        matriz[linha - 1][3] = scanner.next();

        System.out.println("Funcionário adicionado.");
    }
    // CALCULAR SALARIO TOTAL
    public static double calcularSalarioTotal(String[][] matriz, int linhas, int colunas) {
        double salarioTotal = 0.0;
        for (int i = 0; i < linhas; i++) {
            if (matriz[i][3] != null) {
                salarioTotal += Double.parseDouble(matriz[i][3]);
            }
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
            if (matriz[i][1] != null && matriz[i][1].equalsIgnoreCase(String.valueOf(sexo))) {
                if (matriz[i][3] != null) {
                    salarioTotal += Double.parseDouble(matriz[i][3]);
                }
                contador++;
            }
        }
        if (contador > 0) {
            return salarioTotal / contador;
        } else {
            return 0.0;
        }
    }
    // CALCULAR MÉDIDA DE IDADE
    public static double calcularMediaIdade(String[][] matriz, int linhas, int colunas) {
        int idadeTotal = 0;
        int contador = 0;
        for (int i = 0; i < linhas; i++) {
            if (matriz[i][2] != null) {
                idadeTotal += Integer.parseInt(matriz[i][2]);
                contador++;
            }
        }
        if (contador > 0) {
            return (double) idadeTotal / contador;
        } else {
            return 0.0;
        }
    }

    // DEMITIR FUNCIONÁRIO
    public static void demitirFuncionario(String[][] matriz, int linhas, int colunas, String nome) {
        boolean encontrado = false;
        for (int i = 0; i < linhas; i++) {
            if (matriz[i][0] != null && matriz[i][0].equalsIgnoreCase(nome)) {
                encontrado = true;
                matriz[i][0] = null;
                matriz[i][1] = null;
                matriz[i][2] = null;
                matriz[i][3] = null;
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
        String [][] tabelaFuncionarios;
        int funcionarios = -1;
        int opcao;
        int colunas = 4;
        String nomeFuncionario;

        while (funcionarios < 0) {
            System.out.println("Insira a quantidade de Funcionários na empresa:");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Tente novamente:");
                scanner.next(); // Descarta a entrada inválida do scanner
            }
            funcionarios = scanner.nextInt();
            if (funcionarios < 0) {
                System.out.println("Tente novamente:");
            }
        }
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
            while (true) {
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    break;
                }
                System.out.println("Opção Inválida!");
                scanner.next();
                System.out.println("Escolha uma opção:");
            }
            switch(opcao) {
                case 0:
                    break;
                case 1:
                    exibirCadastro(tabelaFuncionarios, funcionarios, colunas);
                    break;
                case 2:
                    cadastrarFuncionario(tabelaFuncionarios, funcionarios, colunas);
                    break;
                case 3:
                    System.out.println("Salário Total = " + calcularSalarioTotal(tabelaFuncionarios, funcionarios, colunas));
                    break;
                case 4:
                    System.out.println("Média Salarial = " + calcularMediaSalarial(tabelaFuncionarios, funcionarios, colunas));
                    break;
                case 5:
                    System.out.println("Média de idade na empresa = " + calcularMediaIdade(tabelaFuncionarios, funcionarios, colunas ) + " anos.");
                    break;
                case 6:
                    System.out.println("Insira o sexo (F/M) que deseja calcular a média salarial: ");
                    char sexo = scanner.next().toUpperCase().charAt(0);
                    double mediaSalarialPorSexo = calcularMediaSalarialPorSexo(tabelaFuncionarios, funcionarios, colunas, sexo);
                    if (mediaSalarialPorSexo > 0.0) {
                        System.out.println("Média salarial para o sexo " + sexo + " é: R$" + mediaSalarialPorSexo);
                    } else {
                        System.out.println("Não há funcionários cadastrados com o sexo " + sexo);
                    }
                    break;
                case 7:
                    System.out.println("Insira o nome do funcionário a ser demitido: ");
                    nomeFuncionario = scanner.next(); // *** Validação dentro do método
                    demitirFuncionario(tabelaFuncionarios, funcionarios, colunas, nomeFuncionario);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
