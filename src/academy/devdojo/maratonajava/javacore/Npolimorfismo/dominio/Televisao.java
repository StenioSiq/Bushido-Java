package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {

    public static final double PORCENTAGEM_IMPOSTO = 0.21;

    public Televisao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double taxaImposto() {
        return this.preco * PORCENTAGEM_IMPOSTO;
    }
}
