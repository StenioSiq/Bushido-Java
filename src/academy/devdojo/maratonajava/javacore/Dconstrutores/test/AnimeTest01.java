package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Frieren");

        anime.init("Frieren", "TV", 28, "Shonen");
        anime.imprimir();

        Anime anime2 = new Anime("Frieren","TV",28,"Shounen","~"); // Sobrecarga construtor
        anime2.imprimir();
    }
}