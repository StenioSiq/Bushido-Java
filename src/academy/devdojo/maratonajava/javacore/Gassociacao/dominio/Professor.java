package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String expecialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String expecialidade) {
        this.nome = nome;
        this.expecialidade = expecialidade;
    }

    public Professor(String nome, String expecialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.expecialidade = expecialidade;
        this.seminarios = seminarios;
    }

    public void imprimir() {
        System.out.println("---");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("Seminarios Cadastrados: ");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+aluno.getNome()+" Idade: "+aluno.getIdade());
            }

        }
    }

    public String getExpecialidade() {
        return expecialidade;
    }

    public void setExpecialidade(String expecialidade) {
        this.expecialidade = expecialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
