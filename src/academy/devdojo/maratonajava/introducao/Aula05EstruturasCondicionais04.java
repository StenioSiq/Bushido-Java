package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        // Ex. Taxes netherlands 2020

        double salarioAnual = 70000;
        double imposto = 0;

        if (salarioAnual < 34712) {
            imposto = 0.097;
        } else if (salarioAnual >= 34712 && salarioAnual < 68507) {
            imposto = 0.3735;
        } else if (salarioAnual >= 68507) {
            imposto = 0.4950;
        }
        double calcImposto = salarioAnual * imposto;
        System.out.println("Você pagara "+ calcImposto +" de imposto ao governo");
    }
}
