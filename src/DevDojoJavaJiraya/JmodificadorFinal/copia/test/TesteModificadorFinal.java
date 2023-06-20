package DevDojoJavaJiraya.JmodificadorFinal.copia.test;

import DevDojoJavaJiraya.JmodificadorFinal.copia.dominio.Carro;
import DevDojoJavaJiraya.JmodificadorFinal.copia.dominio.Ferrari;

public class TesteModificadorFinal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Cillian");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
