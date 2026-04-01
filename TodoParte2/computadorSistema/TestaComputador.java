package computadorSistema;

public class TestaComputador {
    public static void main(String[] args) {

        Processador p1 = new Processador("Intel", "i5", 3.5);

        Computador c1 = new Computador(1, "Dell", p1);

        System.out.println(c1);
    }
}
