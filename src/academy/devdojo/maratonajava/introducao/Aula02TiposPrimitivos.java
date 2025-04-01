package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {


        // int, double, float char, byte, short, long, boolean
        int inteiro = 1;
        int daddyAge = 30;
        int age = 0;
        int idade = 10;
        int x;
        long numeroGrande = 237840923;
        double salarioDouble = 2000.0;
        float salarioFloat = 5000.0F;
        byte idadeByte = 10;
        //                 casting = forçar uma variavel menor a aceitar um valor maior
        short idadeShort = (short) 33000L;
        boolean vivo = true;
        boolean life = false;
        char caratere = 't'; // pode ser um número que referencia o caracter

        // + concatenação
        System.out.println("idade é "+idade);
        System.out.println(idadeShort);

        String texto = "Uma string = aspas duplas";
        System.out.println(texto);

    }

}
