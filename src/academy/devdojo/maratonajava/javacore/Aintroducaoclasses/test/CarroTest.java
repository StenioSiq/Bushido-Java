package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Clio";
        carro1.cor = "Prata";
        carro1.ano = 2002;

        Carro carro2 = new Carro();
        carro2.modelo = "Onix";
        carro2.cor = "Preto";
        carro2.ano = 2016;

        carro2 = carro1; // Só Clio agora :P

        System.out.println("Modelo: " + carro1.modelo+"\nCor: " + carro1.cor+"\nAno: " + carro1.ano);
        carro1.buzina();

        System.out.println();

        System.out.println("Modelo: "+carro2.modelo+"\nCor: "+carro2.cor+"\nAno: "+carro2.ano);
        carro2.buzina();
    }
}
