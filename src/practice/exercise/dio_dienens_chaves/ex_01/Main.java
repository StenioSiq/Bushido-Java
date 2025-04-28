package practice.exercise.dio_dienens_chaves.ex_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe três números: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double ab = a + b;

        System.out.println("A + B = " + ab);

        if (ab < c){
            System.out.println("( A + B ) < C");
        }
        else{
            System.out.println("( A + B ) >= C");
        }
    }
}
