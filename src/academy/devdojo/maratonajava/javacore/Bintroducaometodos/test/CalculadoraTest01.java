package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.soma(2, 5);

        calculadora.subtracao(2, 5);

        calculadora.multiplicacao(2, 5);

        calculadora.divisao(2, 5);

        if (calculadora.ehPar(4)) {
            System.out.println("eh par");
        }
    }

}