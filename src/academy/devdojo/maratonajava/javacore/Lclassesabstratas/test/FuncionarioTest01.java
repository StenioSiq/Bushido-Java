package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gestor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Vendedor;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Rodrigo",5000.0);
        System.out.println(vendedor);
        vendedor.calcularBonus();
        System.out.println(vendedor);

        Gestor gestor = new Gestor("Marcelo", 12000.0);
        System.out.println(gestor);
        gestor.calcularBonus();
        System.out.println(gestor);
    }
}
