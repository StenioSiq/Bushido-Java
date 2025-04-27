package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlow01 {
    public static void main(String[] args) {

        // recursividade(); StackOverFlowError
    }
    public static void recursividade() {
        recursividade();
    }

    /*
        "Error" não pode ser recuperado em tempo de execução.
        A JVM já fez o possivel e mesmo assim não resolveu.

             _______[Throwable]__________
            |                            |
        [Error]        _____________[Exception]___________________
                       |                                          |
               [RuntimeException]                                 |
            ___________|____________                    __________|__________
           |  NullPointerException, |                  |    IOException,     |
           | NumberFormatException, |                  |    SQLException,    |
           |   ClassCastException,  |                  |MalformedURLException|
           |IndexOutOfBoundExpection|                  |         ...         |
           |          ...           |                  |_____________________|
           |________________________|

     */
}
