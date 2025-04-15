package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("static block funcionario");
    }
    {
        System.out.println("void block funcionario");
    }
    public Funcionario(String nome) { // Se houver contrutor na classe mãe, a classe filho precisa ter um também
        super(nome);                                                        // Fazendo o uso do super(ATRIBUTO).
        System.out.println("builder funcionario");
    }

    @Override
    public void imprimir() {
        super.imprimir(); // Busca tudo o que pessoa.imprimir() faz.
        System.out.println("Salario: " + salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu, "+this.nome+" recebi o valor de R$"+ this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
