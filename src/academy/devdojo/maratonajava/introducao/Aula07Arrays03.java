package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int [] {1,2,3,4,5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for(int j : numeros2) { // ForEach
            System.out.println(j);
        }

        String[] nomes = new String[3];
        nomes[0] = "Jonas";
        nomes[1] = "Joao";
        nomes[2] = "Jose";

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
