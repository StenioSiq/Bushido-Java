package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario;

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
}
