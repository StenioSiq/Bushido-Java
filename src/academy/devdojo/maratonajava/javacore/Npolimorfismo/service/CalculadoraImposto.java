package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcImpostoComputador(Computador computador) {
        System.out.println("Nome do Computador: "+computador.getNome());
        System.out.println("Preço do Computador: "+computador.getPreco());
        double imposto = computador.taxaImposto();
        System.out.println("Imposto a ser pago: "+imposto);
        double valorTotal = computador.getPreco() + imposto;
        System.out.println("Valor total a ser pago pelo Computador: "+valorTotal);
    }

    public static void calcImpostoTomate(Tomate tomate) {
        System.out.println("Nome do Tomate: "+tomate.getNome());
        System.out.println("Preço do Tomate: "+tomate.getPreco());
        double imposto = tomate.taxaImposto();
        System.out.println("Imposto a ser pago: "+imposto);
        double valorTotal = tomate.getPreco() + imposto;
        System.out.println("Valor total a ser pago pelo Tomate: "+valorTotal);
    }
}
