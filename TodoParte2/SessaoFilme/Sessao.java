package SessaoFilme;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; // agregação
    private ArrayList<Ingresso> ingressos; // composição

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sessão ").append(id)
                .append(" - Sala ").append(sala)
                .append("\nHorário: ").append(horario)
                .append("\nFilme: ").append(filme)
                .append("\nIngressos:\n");
        for (Ingresso i : ingressos) {
            sb.append(i).append("\n");
        }
        return sb.toString();
    }
}

