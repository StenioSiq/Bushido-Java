package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte day = 7;

        String Util = "Dia util";
        String NaoUtil = "Nao util";

        switch (day) {
            case 1:
                System.out.println(NaoUtil);
                break;
            case 2:
                System.out.println(Util);
                break;
            case 3:
                System.out.println(Util);
                break;
            case 4:
                System.out.println(Util);
                break;
            case 5:
                System.out.println(Util);
                break;
            case 6:
                System.out.println(Util);
                break;
            case 7:
                System.out.println(NaoUtil);
                break;
            default:
                System.out.println("Erro!");
        }
    }
}
