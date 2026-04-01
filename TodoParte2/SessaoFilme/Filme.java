package SessaoFilme;

public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int duracao; // minutos

    public Filme(int id, String titulo, String genero, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return titulo + " (" + genero + ", " + duracao + " min)";
    }
}

