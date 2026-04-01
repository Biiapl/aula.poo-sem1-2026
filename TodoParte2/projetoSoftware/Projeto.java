package projetoSoftware;

import java.util.ArrayList;

public class Projeto {
    int id;
    String nomeProjeto;
    ArrayList<Programador> programadores = new ArrayList<>();

    public void adicionarProgramador(Programador p) {
        programadores.add(p);
    }

    public void listarProgramadores() {
        for (Programador p : programadores) {
            System.out.println(p);
        }
    }
}
