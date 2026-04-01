package timeBasquete;

import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> atletas;

    public Time() {
        atletas = new ArrayList<>();
    }

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    public void contratarAtleta(Atleta a) {
        atletas.add(a);
    }

    @Override
    public String toString() {
        String listaAtletas = "";

        for (Atleta a : atletas) {
            listaAtletas += a.getNome() + " - " + a.getPosicao() + "\n";
        }

        return "TIME:\n" +
                "Nome: " + nome +
                "\nTécnico: " + tecnico +
                "\nAtletas:\n" + listaAtletas;
    }
}

