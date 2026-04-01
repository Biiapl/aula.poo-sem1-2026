package supermercadoSistema;


public class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + " (ID: " + id + ")";
    }
}

