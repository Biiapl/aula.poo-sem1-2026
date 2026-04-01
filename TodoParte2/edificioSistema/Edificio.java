package edificioSistema;

import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int numero, int andar) {
        apartamentos.add(new Apartamento(numero, andar));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Edifício: ").append(nome)
                .append("\nEndereço: ").append(endereco)
                .append("\nApartamentos:\n");
        for (Apartamento a : apartamentos) {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}

