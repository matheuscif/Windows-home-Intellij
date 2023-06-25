package DevDojoJavaJiraya.Npolimorfismo.copia.teste;

/* Polimorfismo de Referência
* Ocorre quando um objeto de uma classe filha é atribuido a uma variável de referência da classe pai
* Ex: Produto produto = new Computador
* o objeto produto consegue usar todos os métodos que a classe abstrata possui sobrescrita na classe filha Comput
* Porém não consegue acessar os métodos específicos de Comput
* */

import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Computador;
import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Produto;
import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Tomate;

public class ProdutorTeste2 {
    public static void main(String[] args) {
        Produto produto = new Computador("Alienware", 15000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println();

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());


    }
}
