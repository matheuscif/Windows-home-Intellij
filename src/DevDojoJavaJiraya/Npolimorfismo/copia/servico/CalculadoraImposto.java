package DevDojoJavaJiraya.Npolimorfismo.copia.servico;


import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Produto;
import DevDojoJavaJiraya.Npolimorfismo.copia.dominio.Tomate;


public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            // instanceof verifica se produto é uma instancia de tomate
            String dataValidade = ((Tomate) produto).getDataValidade();

            System.out.println("Data de validade: " + dataValidade);
        }
    }
}
