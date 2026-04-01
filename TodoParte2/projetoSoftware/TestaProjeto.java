package projetoSoftware;

public class TestaProjeto {
    public static void main(String[] args) {
        Programador p1 = new Programador(1, "Ana", "Java");
        Programador p2 = new Programador(2, "Carlos", "Python");

        Projeto projeto = new Projeto();
        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);

        projeto.listarProgramadores();
    }
}
