package DevDojoJavaJiraya.Npolimorfismo.copia.teste;

/* Polimorfismo de Parametro:
* Quando você tem uma classe com um método que recebe como parametro um objeto de uma classe pai
* como Produto produto
* desse modo o método terá efeito em todos os objetos de classes filhas também
* */


import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Computador;
import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Televisao;
import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Tomate;
import DevDojoJavaJiraya.Npolimorfismo.copia.servico.CalculadoraImposto;

public class ProdutoTeste1 {
    public static void main(String[] args) {
        Computador computador = new Computador("Helius", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println();
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();
        CalculadoraImposto.calcularImposto(tv);

    }
}
