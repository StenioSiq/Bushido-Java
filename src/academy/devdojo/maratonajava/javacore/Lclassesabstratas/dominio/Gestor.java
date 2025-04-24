package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gestor extends Funcionario{

    public Gestor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.2;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Gestor");
    }
}
