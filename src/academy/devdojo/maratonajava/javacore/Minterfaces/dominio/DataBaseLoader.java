package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Loading DataBase...");
    }

    @Override
    public void remover() {
        System.out.println("Removing DataBase...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission for DataBase");
    }
}
