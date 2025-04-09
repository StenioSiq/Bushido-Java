package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Mario");;
        funcionario.setIdade(48);
        funcionario.setSalario(new double[]{18594.5,1518.0,2514.5});

        funcionario.imprimir();
        funcionario.mediaSalario();
    }
}
