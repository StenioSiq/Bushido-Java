package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int [] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(5,6,7,8,9);
    }

}
