package academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio;

public class RepositorioCache implements Repositorio {

    @Override
    public void salvar(){
        System.out.println("Salvando em memória");
    }
}
