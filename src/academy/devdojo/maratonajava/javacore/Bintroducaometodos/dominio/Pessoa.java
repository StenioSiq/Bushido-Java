package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir() {
        System.out.println("Nome: " + nome+" Idade: " + idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            /*
             throw new IllegalArgumentException("Idade deve ser maior que zero");
             Exceção | Ainda não sei exatamente o que é, mas o IntelliJ recomendou como autocompletar.
            */
            System.out.println("Idade deve ser maior que zero");
        }

        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
