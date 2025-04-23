package practice.exercise.createbychatgpt.Associacao.Ex2_Agregacao;

import java.util.Arrays;
import java.util.List;

public class Curso {
    private String nome;
    private Aluno[] alunos;

    public Curso(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
