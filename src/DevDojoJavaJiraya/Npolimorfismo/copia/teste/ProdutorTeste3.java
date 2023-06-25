package DevDojoJavaJiraya.Npolimorfismo.copia.teste;

import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Computador;
import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Produto;
import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Tomate;
import DevDojoJavaJiraya.Npolimorfismo.copia.servico.CalculadoraImposto;

public class ProdutorTeste3 {
    public static void main(String[] args) {
        Produto produto = new Computador("Alienware", 7000);

        Tomate tomate = new Tomate("Cereja", 20);
        tomate.setDataValidade("30/07/2023");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();
        CalculadoraImposto.calcularImposto(produto);


    }
}
