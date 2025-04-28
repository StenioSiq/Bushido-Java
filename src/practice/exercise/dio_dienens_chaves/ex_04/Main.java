package practice.exercise.dio_dienens_chaves.ex_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println("Antecessor: "+(x-1)+" Sucessor: "+(x+1));
    }
}
