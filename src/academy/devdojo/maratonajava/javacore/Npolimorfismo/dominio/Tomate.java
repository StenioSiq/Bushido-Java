package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public static final double PORCENTAGEM_IMPOSTO = 0.06;

    public String dataValidade;

    public Tomate(String nome, double preco) {
        super(nome, preco);
    }
    public Tomate(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public double taxaImposto() {
        return this.preco * PORCENTAGEM_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
