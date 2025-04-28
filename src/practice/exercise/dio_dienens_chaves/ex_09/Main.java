package practice.exercise.dio_dienens_chaves.ex_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Informe seu altura: ");
        double altura = scanner.nextDouble();

        double imcX =  peso / (altura * altura);

        double imc = imcX * 10000; // Solução PORCA - fiquei por mais de 30 minutos e não achei solução e sendo sincero,
        //                                                                                               nem quero mais.

        System.out.println("IMC: " + imc);

        /*

        Abaixo de 18,5   | Abaixo do peso

        Entre 18,6 e 24,9 | Peso ideal (parabéns)

        Entre 25,0 e 29,9 | Levemente acima do peso

        Entre 30,0 e 34,9 | Obesidade grau I

        Entre 35,0 e 39,9 | Obesidade grau II (severa)

        Maior ou igual a 40 | Obesidade grau III (mórbida)

        */

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }
        else if (imc >=30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        }
        else {
            System.out.println("Obesidade grau III");
        }
    }
}
