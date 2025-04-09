package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salario;
    private double media;

    public void imprimir() {
        System.out.println(this.nome+"\n"+this.idade);
        for(int i = 0; i < salario.length; i++) {
            System.out.println(salario[i]);
        }
    }

    public void mediaSalario() {
        if(salario == null) {
            return;
        }
        double media = 0;
        for(int i = 0; i < salario.length; i++) {
            media += salario[i];
        }
        media = media / this.salario.length;
        System.out.println("A média dos salarios é: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}
