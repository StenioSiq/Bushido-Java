package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 = 10;
        int numero2 = 20;

        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println(numero1 +" "+ numero2);
    }
}
