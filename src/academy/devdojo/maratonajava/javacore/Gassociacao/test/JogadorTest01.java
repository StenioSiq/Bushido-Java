package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador0 = new Jogador("Pelé");
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador0, jogador1, jogador2};

        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }
    }
}
