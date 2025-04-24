package practice.exercise.createbychatgpt.Associacao.Ex3_Composicao;

public class Departamento {
    private String nome;
    private Funcionario[] funcionarios;
    private int contadorFuncionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new Funcionario[10];
        this.contadorFuncionarios = contadorFuncionarios = 0;
    }

    public void adicionarFuncionario(String nome, double salario) {
        if (contadorFuncionarios < funcionarios.length) {
            funcionarios[contadorFuncionarios] = new Funcionario(nome, salario);
            contadorFuncionarios++;
        }
        else {System.out.println("limite de funcionarios atingido. ");}
    }

    public void exibirDados(){
        System.out.println("Departamento: " + nome);
        if (contadorFuncionarios == 0){
            System.out.println("Nenhum funcionario. ");
        }
        else {
            System.out.println(" Funcionarios: ");
            for (int i = 0; i < contadorFuncionarios; i++) {
                System.out.println(" " + funcionarios[i]);
            }
        }
    }
    public void excluirDepartamento(){
        for (int i = 0; i < contadorFuncionarios; i++) {
            funcionarios[i] = null;
        }
        contadorFuncionarios = 0;
        System.out.println("Departamento "+ nome +" removido, junto a todos os funcionários...");
    }
}
