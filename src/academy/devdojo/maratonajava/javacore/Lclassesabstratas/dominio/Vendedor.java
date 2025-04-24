package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.1;
    }

    @Override
    public void imprimir() {
        System.out.println("imprimir vendedor");
    }
}
