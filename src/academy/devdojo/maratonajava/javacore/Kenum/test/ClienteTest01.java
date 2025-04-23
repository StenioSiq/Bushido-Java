package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Angel", TipoCliente.PESSOA_FISICA, TipoPagamento.Debito);
        System.out.println(cliente1);
        Cliente cliente2 = new Cliente("Morgan", TipoCliente.PESSOA_JURIDICA, TipoPagamento.Credito);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.Credito.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
