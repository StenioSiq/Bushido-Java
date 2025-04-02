package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 6500.00;

        String msgDoar = "Doar 500,00 para o DevDojo";
        String msgNaoDoar = "Sem saldo!";

        //  Ternario           condicao      true       false
        String resultado = salario > 3000 ? msgDoar : msgNaoDoar;

        System.out.println(resultado);
    }
}
