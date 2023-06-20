package DevDojoJavaJiraya.HHeranca.copia.teste;

import DevDojoJavaJiraya.HHeranca.copia.dominio.Endereco;
import DevDojoJavaJiraya.HHeranca.copia.dominio.Funcionario;
import DevDojoJavaJiraya.HHeranca.copia.dominio.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 3", "012345-209");
        Pessoa pessoa = new Pessoa("Quentin");
        pessoa.setCpf("12345679");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Nolan");
        funcionario.setCpf("2222222");
        funcionario.setSalario(11000);
        funcionario.setEndereco(endereco);
        System.out.println("---------------------------");
        funcionario.imprime();

    }
}
