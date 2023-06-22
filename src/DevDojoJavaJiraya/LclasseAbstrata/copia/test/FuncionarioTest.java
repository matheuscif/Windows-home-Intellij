package DevDojoJavaJiraya.LclasseAbstrata.copia.test;

import DevDojoJavaJiraya.LclasseAbstrata.copia.dominio.Desenvolvedor;
import DevDojoJavaJiraya.LclasseAbstrata.copia.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Tommy",15000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Matt", 13000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
