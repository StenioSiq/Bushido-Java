package practice.exercise.createbychatgpt.Associacao.Ex1_AssociacaoSimples;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua das Oliveiras",101,"São Paulo");
        Pessoa pessoa = new Pessoa("João", 30, endereco);

        System.out.println(pessoa);

    }
}
