package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public void imprimir() {
        System.out.println(this.nome+" "+ this.idade +" "+ this.sexo);
    }
}
