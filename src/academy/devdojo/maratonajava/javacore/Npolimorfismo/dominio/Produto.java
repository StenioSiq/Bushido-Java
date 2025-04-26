package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto implements TaxaImposto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
