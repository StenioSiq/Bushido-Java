package practice.exercise.dio_dienens_chaves.ex_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();



        if (a == b){
            int c = a + b;
            System.out.println("Números iguais\n"+c);
        }
        else {
            int c = a * b;
            System.out.println("Números diferentes\n"+c);
        }
    }
}
