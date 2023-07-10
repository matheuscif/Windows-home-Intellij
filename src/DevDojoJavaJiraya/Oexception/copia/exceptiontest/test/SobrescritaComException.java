package DevDojoJavaJiraya.Oexception.copia.exceptiontest.test;

import DevDojoJavaJiraya.Oexception.copia.exceptiontest.dominio.Funcionario;
import DevDojoJavaJiraya.Oexception.copia.exceptiontest.dominio.LoginInvalidoException;
import DevDojoJavaJiraya.Oexception.copia.exceptiontest.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComException {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
