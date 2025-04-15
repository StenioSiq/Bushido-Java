package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome; // Todas as Classes que estiverem no mesmo pacote ou herança podem ter acesso.
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("static block pessoa");
    }
    {
        System.out.println("void block pessoa");
    }
    public Pessoa(String nome){ // Se houver contrutor na classe mãe, a classe filho precisa ter um também
        this.nome = nome;                                       // Fazendo o uso do super(ATRIBUTO).
        System.out.println("builder pessoa");
    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome +
                "\nCPF: " + this.cpf +
                "\nEndereço: " + this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
