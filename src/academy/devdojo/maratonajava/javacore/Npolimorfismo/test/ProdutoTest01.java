package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("GalaxyBook",2300.0);
        Tomate tomate = new Tomate("Tomate",11.0);

        CalculadoraImposto.calcImpostoComputador(computador);
        System.out.println("\n");
        CalculadoraImposto.calcImpostoTomate(tomate);
    }
}
