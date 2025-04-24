package practice.exercise.createbychatgpt.Associacao.Ex3_Composicao;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Salario: R$" + salario ;
    }
}
