package projetoSoftware;

public class Programador {
    int id;
    String nome;
    String linguagemPrincipal;

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }
    @Override
    public String toString() {
        return "ID: " + id +
                "\nNome: " + nome +
                "\nLinguagem: " + linguagemPrincipal + "\n";
    }
}
