package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        int [] idades = new int[3]; // Array em Java. Array é um type reference.
        int [] dias = null;         // type reference pode ser null.
        System.out.println(idades); // Endereço de memória.
        idades[0] = 18;
        idades[1] = 20;
        idades[2] = 22;
        System.out.println(idades[1]);

        String [] nomes = new String[3];
        nomes[0] = "Jose";
        nomes[1] = "Pedro";
        nomes[2] = "Maria";
        System.out.println(nomes[1]);


    }
}
