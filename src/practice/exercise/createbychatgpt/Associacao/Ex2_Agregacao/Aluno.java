package practice.exercise.createbychatgpt.Associacao.Ex2_Agregacao;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                " nome: '" + nome + '\'' +
                ", matricula: '" + matricula + '\'' +
                ' '+'}';
    }
}
