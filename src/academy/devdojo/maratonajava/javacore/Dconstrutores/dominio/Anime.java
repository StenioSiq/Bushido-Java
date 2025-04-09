package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome){ // Construtor (Construtor não pode ter retorno, pois se torna metodo)
        this.nome = nome;
    }
    public Anime(String nome, String tipo, int episodios) { // Sobrecarga em Construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios); // Só pode ser usando dentro de construtor,
        this.genero = genero;        // precisa estar na primeira linha do bloco
        this.estudio = estudio;
    }

    // --Exemplo de sobrecarga --
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    // --------------------------

    public void imprimir() {
        System.out.println(this.nome + " " + this.tipo + " " + this.episodios);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

