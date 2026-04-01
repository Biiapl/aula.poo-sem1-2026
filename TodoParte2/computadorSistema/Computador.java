package computadorSistema;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador() {}

    public Computador(int id, String marca, Processador processador) {
        this.id = id;
        this.marca = marca;
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "COMPUTADOR:\n" +
                "ID: " + id +
                "\nMarca: " + marca +
                "\n" + processador;
    }
}
