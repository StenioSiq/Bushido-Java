package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("i310f - 16gbRAM3300 - GTX1650",2400);
        CalculadoraImposto.calcImposto(produto);

        System.out.println("\n");

        Tomate tomate = new Tomate("Cereja",13);
        tomate.setDataValidade("02-05-2025");
        CalculadoraImposto.calcImposto(tomate);
    }
}
