package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {

    // todos os atributos em uma interface são constantes
    public static final int Max_Data_Size = 100;

    // toda inferface é public e abstract
    public abstract void load();

    public default void checkPermission() {
        System.out.println("Check permission");
    }

    // Reforçar conhecimento: função static dentro de interface
}
