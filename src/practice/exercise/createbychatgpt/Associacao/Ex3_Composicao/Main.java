package practice.exercise.createbychatgpt.Associacao.Ex3_Composicao;

public class Main {
    public static void main(String[] args) {

        Departamento departamento = new Departamento("RH");

        departamento.adicionarFuncionario("Jonas", 2905.5);
        departamento.adicionarFuncionario("Jorge", 1518.0);
        departamento.adicionarFuncionario("João", 16500.0);

        System.out.println("Antes da exclusão: ");
        departamento.exibirDados();

        departamento.excluirDepartamento();
        System.out.println("Depois da exclusão: ");
        departamento.exibirDados();
    }
}
