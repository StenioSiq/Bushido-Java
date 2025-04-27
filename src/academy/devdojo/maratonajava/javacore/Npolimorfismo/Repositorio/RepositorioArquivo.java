package academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em arquivo");
    }
}
