package practice.exercise.dio_dienens_chaves.ex_08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com três números:three numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);


        for (int i = 0; i < numbers.length /2 ; i++) {
            int j = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - 1 - i] = j;

            System.out.println(Arrays.toString(numbers));
        }
    }
}
