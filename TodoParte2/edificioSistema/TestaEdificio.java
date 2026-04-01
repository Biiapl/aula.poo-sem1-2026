package edificioSistema;

public class TestaEdificio {
    public static void main(String[] args) {
        Edificio e = new Edificio("Residencial Franca", "Rua das Flores, 123");

        e.construirApartamento(101, 1);
        e.construirApartamento(202, 2);
        e.construirApartamento(303, 3);

        System.out.println(e);
    }
}

