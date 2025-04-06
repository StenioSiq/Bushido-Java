package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Yuki";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Mai";
        estudante2.idade = 15;
        estudante2.sexo = 'F';

        impressora.impressoraEstudante(estudante1);
        impressora.impressoraEstudante(estudante2);
        impressora.impressoraEstudante(estudante1); // Vai chamar "Gohan"
    }

}
