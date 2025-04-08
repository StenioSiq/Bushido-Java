package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Mario";
        funcionario.idade = 48;
        funcionario.salario = new double[]{18594.5,1518.0,2514.5};

        funcionario.imprimir();
        funcionario.mediaSalario();
    }
}
