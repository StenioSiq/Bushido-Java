package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Astarof";
        estudante.idade = 18;
        estudante.sexo = 'M';

        estudante.imprimir();
    }
}
