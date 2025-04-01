package academy.devdojo.maratonajava.introducao;

public class Aula05EstrutaCondicional {

    public static void main(String[] args) {

        int idade = 20;


        boolean dev = 5 > 3;
        if(dev){
            System.out.println("Você é Dev Sr.");
        }


        if(idade >= 18){
            System.out.println("Pode tirar CNH!");
        }


        boolean pode = true;
        boolean poder = !pode;

        if(poder){
            System.out.println("Apareca se puder!");
        } else{
            System.out.println("Não pode aparacer!");
        }


        // Assisti até a aula 20 (31/03/2025) 20 aulas no dia!y
    }
}
