package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {



    public static void main(String[] args) {


        // aritmeticos
        int n1 = 10;
        int n2 = 20;
        int r1 = n2 - n1;

        System.out.println(r1);

        // relacional <= >= == != (retorna boolean)


        boolean isDezMaiorQueVinte = 100> 20;
        System.out.println(isDezMaiorQueVinte);

        // % resto
        int resto  = 21 % 2;

        System.out.println(resto);

        // logico && (e and) || (ou or)  ! (not)


        //(AND)
        int idade = 31;
        float salario = 7500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        //(OR)
        int idadeJoao = 17;
        boolean acompanhado = true;
        boolean cineAdulto = idadeJoao >= 18 || acompanhado == true;
        System.out.println(cineAdulto);


        // Atribuição
        double salariomaster = 13;
        salariomaster += 3;
        System.out.println(salariomaster);

        salariomaster += 1;
        salariomaster++;


    }
}
