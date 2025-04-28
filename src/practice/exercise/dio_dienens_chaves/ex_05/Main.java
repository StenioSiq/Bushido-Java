package practice.exercise.dio_dienens_chaves.ex_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salariomin = 1518.0;

        Scanner scanner = new Scanner(System.in);

        double salarioUser = scanner.nextDouble();

        double res = salarioUser / salariomin;

        System.out.printf("%.2f", res);
    }
}
