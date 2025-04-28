package practice.exercise.dio_dienens_chaves.ex_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        paridade(x);
        integralidade(x);

    }
    public static void paridade(double x){
        if (x == 0){
            return;
        }
        else if (x % 2 == 0) {
            System.out.println("Número é par");
        }
        else {
            System.out.println("Número é impar");
        }
    }
    public static void integralidade(double x){
        if (x == 0){
            return;
        }
        else if (x > -1){
            System.out.println("Número positivo");
        }
        else {
            System.out.println("Número negativo");
        }
    }
}
