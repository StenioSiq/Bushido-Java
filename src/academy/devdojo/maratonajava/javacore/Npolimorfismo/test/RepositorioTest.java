package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.Repositorio.RepositorioCache;

public class RepositorioTest {
    public static void main(String[] args) {

        Repositorio repo = new RepositorioBancoDeDados();
    //  Repositorio repo = new RepositorioArquivo();
    //  Repositorio repo = new RepositorioCache();

        repo.salvar();
    }
}
