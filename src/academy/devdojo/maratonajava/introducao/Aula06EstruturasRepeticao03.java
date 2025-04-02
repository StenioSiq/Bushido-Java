package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03 {
    public static void main(String[] args) {

        int valorMax = 50;

        for (int i = 1; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}