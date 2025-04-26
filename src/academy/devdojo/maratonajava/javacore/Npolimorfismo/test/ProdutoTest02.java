package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("i310f - 16gbRAM3300 - GTX1650",2400);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.taxaImposto());

        System.out.println("\n");

        Produto produto2 = new Tomate("Cereja",13);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getPreco());
        System.out.println(produto2.taxaImposto());

        /*
        System.out.println(produto2.getDataValidade);

        produto2 é uma variável do tipo Produto,
        e o método getDataValidade só existe na classe Tomate.
        Como Produto não declara esse método,
        o compilador não permite acessá-lo diretamente por produto2.

        Se quiser acessar, teria que fazer um cast.
        Ou então garantir que o método exista em Produto.
        */

        System.out.println("\n");

        Tomate tomate = new Tomate("Perola",9, "2025-05-11");
        System.out.println(tomate.getNome());
        System.out.println(tomate.getPreco());
        System.out.println(tomate.taxaImposto());
        System.out.println(tomate.getDataValidade());

    }
}
