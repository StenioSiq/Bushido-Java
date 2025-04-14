package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclado02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Previsão futura!");
        System.out.println("Digite a sua pergunta e eu responderei sim ou não");

        String pergunta = scanner.nextLine();

        if(pergunta.charAt(0) == ' '){ // Verifica se o primeiro caracter '0' é vazio
            System.out.println("SIM");
        }
        else {
            System.out.println("NÃO");
        }
    }
}
