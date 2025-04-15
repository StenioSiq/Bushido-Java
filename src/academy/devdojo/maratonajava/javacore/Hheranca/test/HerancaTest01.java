package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua do Mario");
        endereco.setCep("00000-000");

        Pessoa pessoa = new Pessoa("Mario");

        pessoa.setCpf("000.000.000-00");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

        System.out.println();

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua do José");
        endereco2.setCep("00000-777");

        Funcionario funcionario = new Funcionario("José");

        funcionario.setCpf("000.000.000-00");

        funcionario.setSalario(15000);

        funcionario.setEndereco(endereco2);

        funcionario.imprimir();

        System.out.println();

        funcionario.relatorioPagamento();
    }
}
