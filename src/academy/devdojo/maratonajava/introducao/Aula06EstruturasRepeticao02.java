package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao02 {
    public static void main(String[] args) {

        int x = 1;

        while(x < 1000000){
            if(x % 2 == 0){
                System.out.println(x);
            }
            x++;
        }
    }
}
