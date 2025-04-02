package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        byte dia = 4;
        String diaNome;

        // char, int, byte, short, enum, String >> Java 8
        switch (dia){
            case 1:
                diaNome = "Domingo";
                break;
            case 2:
                diaNome = "Segunda";
                break;
            case 3:
                diaNome = "Terca";
                break;
            case 4:
                diaNome = "Quarta";
                break;
            case 5:
                diaNome = "Quinta";
                break;
            case 6:
                diaNome = "Sexta";
                break;
            case 7:
                diaNome = "Sabado";
                break;
            default:
                diaNome = "Erro";
        }
    System.out.println(diaNome);
    }
}
