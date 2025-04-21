package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Angel", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        Cliente cliente2 = new Cliente("Morgan", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente2);
    }
}
