package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {

        Debito{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        Credito{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
        };

    // Metodo abstrato: criado apenas para ser Sobrescrito
    public abstract double calcularDesconto(double valor);

}
