package practice.exercise.createbychatgpt.Associacao.Ex1_AssociacaoSimples;

public class Endereco {

    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco {" +
                "rua: '" + rua + '\'' +
                ", numero: " + numero +
                ", cidade: '" + cidade + '\'' +
                '}'+" ";
    }
}
