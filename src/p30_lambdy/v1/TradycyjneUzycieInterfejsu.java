package p30_lambdy.v1;

public class TradycyjneUzycieInterfejsu {

    public static void main(String[] args) {

        DoKwadratu f1 = new DoKwadratu();
        System.out.println( f1.oblicz(1.0) );
        System.out.println( f1.oblicz(1.5) );

        // obiekt klasy implementującej interfejs mogę zapisać na zmienną typu interfejs

        FunkcjaLiczbowa f2 = new DoKwadratu();
        System.out.println( f2.oblicz(2.0) );

        // Przed Javą 8 najbardziej zwięzłym sposobem na utworzenie obiektu zgodnego z interfejsem
        // była "klasa anonimowa":

        FunkcjaLiczbowa f3 = new FunkcjaLiczbowa() {
            public double oblicz(double x) {
                return x*x*x;
            }
        };

        System.out.println( f3.oblicz(3.0) );

    }

}
