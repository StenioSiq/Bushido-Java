package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");

        /*
            Ordem de inicialização:

            static block pessoa - Super Class
            static block funcionario - Sub Class

            void block pessoa
            builder pessoa - Inicializa Objeto

            void block funcionario
            builder funcionario -  Inicializa Objeto

        */
    }
}
