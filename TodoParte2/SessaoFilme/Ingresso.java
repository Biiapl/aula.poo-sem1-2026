package SessaoFilme;

public class Ingresso {
    private int id;
    private String assento;
    private String tipo; // Inteira ou Meia
    private float preco;

    public Ingresso(int id, String assento, String tipo, float preco) {
        this.id = id;
        this.assento = assento;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Ingresso " + id + " - Assento " + assento +
                " (" + tipo + ") R$ " + preco;
    }
}
