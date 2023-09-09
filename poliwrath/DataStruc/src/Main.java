import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("manzana");
        conjunto.add("pera");
        conjunto.add("fresa");
        conjunto.add("naranja");
        conjunto.add("papaya");
        conjunto.add("badea");
        conjunto.remove("pera");

        for(String s : conjunto) {
            System.out.println(s);
        }

        class Complejo {
            private double val_one;
            private double val_two;
            public Complejo(double val_one, double val_two ) {
                this.val_one = val_one;
                this.val_two = val_two;
            };

            @Override
            public String toString() {
                return "(" + val_one + ", " + val_two + ")";
            }
        }

        List<Complejo> lista = new LinkedList<>();
        lista.add( new Complejo( 1.0, 5.0 ) );
        lista.add( new Complejo( 2.0,4.2 ) );
        lista.add(1, new Complejo(3.0, 0.0) );lista.remove(0);
        for(Complejo c: lista) {
                System.out.println(c);
            }
    }
}