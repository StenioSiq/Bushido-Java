package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public int valor;
    public String descricao;



    public static TipoCliente tipoClientePorRelatorio(String relatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.descricao.equals(relatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    TipoCliente(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
