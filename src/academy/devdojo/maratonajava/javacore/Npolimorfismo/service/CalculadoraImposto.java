package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcImposto(Produto produto) {
        System.out.println("Calculo de imposto");
        System.out.println("Nome: "+ produto.getNome());
        System.out.println("Preço: "+ produto.getPreco());
        double imposto = produto.taxaImposto();
        System.out.println("Imposto a ser pago: "+imposto);

        if (produto instanceof Tomate) {
            String dataValiade = ((Tomate) produto).dataValidade;
            System.out.println("Data de Valiade: "+ dataValiade);
        }
    }
}
