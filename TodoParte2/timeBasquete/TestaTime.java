package timeBasquete;

public class TestaTime {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(1, "Lucas", "Armador");

        Time t = new Time(1, "Franca", "Helinho");
        t.contratarAtleta(a1);

        System.out.println(t);
    }
}
