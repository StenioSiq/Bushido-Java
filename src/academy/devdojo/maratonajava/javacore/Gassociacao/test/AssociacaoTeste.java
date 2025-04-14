package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {

        Local local = new Local("Rua das Corujas");

        Aluno aluno = new Aluno("Bruce", 26);

        Professor professor = new Professor("Thomas","Historia");

        Aluno[] alunosSeminario = {aluno};

        Seminario seminario = new Seminario("Roma antiga",alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimir();

    }
}
