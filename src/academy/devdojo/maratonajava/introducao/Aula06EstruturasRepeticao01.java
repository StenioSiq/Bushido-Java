package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {

        int x = 1;

        while(x < 11){
            System.out.println("While: "+x);
            x++;
        }

        int y = 1;

        do {
            System.out.println("Do While: "+y);
            y++;
        } while(y < 11);

        for(int i =1;i<11;i++){
            System.out.println("For: "+i);
        }

    }
}
