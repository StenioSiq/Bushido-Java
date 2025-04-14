package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe seu sexo (M ou F): ");
        char sexo = sc.next().charAt(0);

        System.out.println("\n\n\n");
        System.out.println("Nome: " + nome+ "\nIdade: " + idade + "\nSexo: " + sexo);


    }

}
