package DevDojoJavaJiraya.Kenum.copia.test;

import DevDojoJavaJiraya.Kenum.copia.dominio.Cliente;
import DevDojoJavaJiraya.Kenum.copia.dominio.TipoCliente;
import DevDojoJavaJiraya.Kenum.copia.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cillian", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Netflix", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");

        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física221");
        System.out.println(tipoCliente2);


    }
}
