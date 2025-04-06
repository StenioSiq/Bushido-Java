package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void impressoraEstudante(Estudante estudante) {
        System.out.println(estudante.nome+" "+estudante.idade+" "+estudante.sexo);
        estudante.nome = "John";
    }
}
