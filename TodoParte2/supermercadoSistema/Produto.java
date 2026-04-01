package supermercadoSistema;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto() {}

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}
