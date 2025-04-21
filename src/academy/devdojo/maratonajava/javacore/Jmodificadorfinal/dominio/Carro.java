package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;

    //private static double velocidadeLimite = 250;

    // Variavel constante em JAVA. Se for declarada, precisa inicializar!
    public static final double VELOCIDADE_LIMITE = 250;

    public final Comprador COMPRADOR = new Comprador("Julius");

    public final void  imprime(){
        System.out.println("Fxck");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
