package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250; // Atributo pertence a classe

    public void imprimir() {
        System.out.println("Nome: " + nome + " VelocidadeMaxima: " + velocidadeMaxima + " VelocidadeLimite: " + velocidadeLimite);
    }
    public static void setVelocidadeLimite(double velocidadeLimite) {
       Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
