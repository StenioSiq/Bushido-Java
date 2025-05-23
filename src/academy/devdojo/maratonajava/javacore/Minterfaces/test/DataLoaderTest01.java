package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DataBaseLoader dataLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataLoader.load();
        fileLoader.load();

        dataLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
