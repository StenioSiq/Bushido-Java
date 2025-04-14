package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW",280);
        Carro carro2 = new Carro("Mercedes",270);
        Carro carro3 = new Carro("Audi",290);

        Carro.setVelocidadeLimite(180);

        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }


}
