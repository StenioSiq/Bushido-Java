package practice.exercise.createbychatgpt.Associacao.Ex2_Agregacao;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João","01.0001.00");
        Aluno aluno2 = new Aluno("Jonas","02.0001.00");
        Aluno aluno3 = new Aluno("Jorge","03.0001.00");

        Aluno[] alunos = {aluno1, aluno2, aluno3};

        Curso curso = new Curso("ADS",alunos);

        System.out.println(curso);
    }
}
