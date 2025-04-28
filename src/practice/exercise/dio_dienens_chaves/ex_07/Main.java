package practice.exercise.dio_dienens_chaves.ex_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean y = scanner.nextBoolean();
        boolean z = scanner.nextBoolean();

        if (y && z) {
            System.out.println("Verdadeiro");
        }
        else if (y && !z) {
            System.out.println("Falso");
        }
        else if (!y && z) {
            System.out.println("Falso");
        }
        else if (!y && !z) {
            System.out.println("Verdadeiro");
        }
    }
}
