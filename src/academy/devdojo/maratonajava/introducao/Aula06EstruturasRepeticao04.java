package academy.devdojo.maratonajava.introducao;

// Assisti até a aula 30 (01/04/2025) 10 aulas no dia!
// 20/04/2025 - Faculdade :(
public class Aula06EstruturasRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 3000;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela + " Valor: " + valorParcela);
        }
    }
}
