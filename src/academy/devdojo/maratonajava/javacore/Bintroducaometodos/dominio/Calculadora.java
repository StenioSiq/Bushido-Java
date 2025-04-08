package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void soma(double first, double second) {
        double res = first + second;
        System.out.println(res);
    }
    public void subtracao(double first, double second) {
        double res = first - second;
        System.out.println(res);
    }
    public void multiplicacao(double first, double second) {
        double res = first * second;
        System.out.println(res);
    }
    public void divisao(double first, double second) {
        double res = first / second;
        System.out.println(res);
    }
    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println(numero1 +" "+ numero2);
    }
    public void somaArray(int [] numeros) {
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){ // VarArgs precisa ser o ultimo parametro do metodo!
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
