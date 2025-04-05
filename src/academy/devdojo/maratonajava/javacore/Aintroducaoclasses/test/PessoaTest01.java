package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.nome = "Luffy";
        pessoa1.idade = 18;
        pessoa1.sexo = 'M';

        pessoa2.nome = "Zoro";
        pessoa2.idade = 21;
        pessoa2.sexo = 'M';

        pessoa3.nome = "Sanji";
        pessoa3.idade = 20;
        pessoa3.sexo = 'M';

        System.out.println(pessoa1.nome+" "+pessoa1.idade+" "+pessoa1.sexo);
        System.out.println(pessoa2.nome+" "+pessoa2.idade+" "+pessoa2.sexo);
        System.out.println(pessoa3.nome+" "+pessoa3.idade+" "+pessoa3.sexo);
    }
}
