package p30_lambdy.v1;

public class Lambdy1 {

	public static void main(String[] args) {
		// wyrażenie lambda / lambda expression
		FunkcjaLiczbowa f1 = arg -> arg*arg;
		System.out.println(f1.oblicz(5.0));
		System.out.println(f1.oblicz(7.0));
		System.out.println();
		
		
		FunkcjaLiczbowa f2 = x -> 100 * x;
		System.out.println(f2.oblicz(13));
		System.out.println();
		
		// Oprócz wyrażeń lambda, funkcje można wskazywać także za pomocą "method reference"
		FunkcjaLiczbowa f3 = Math::sqrt;
		System.out.println(f3.oblicz(36));
		
		FunkcjaLiczbowa f4 = x -> Math.sqrt(x);
		System.out.println(f4.oblicz(36));
		System.out.println();

		
	    // Technicznie: w f1 i f2 są wpisane OBIEKTY
        Object o4 = f2;
        System.out.println(o4);

        // Są to obiekty klas generowanych automatycznie,
        // te klasy implementują interfejs FunkcjaLiczbowa.

        System.out.println(f2.getClass());
        if(f2 instanceof FunkcjaLiczbowa) {
            System.out.println("Jest instancją");
        } else {
            System.out.println("Nie jest instancją");
        }

        // Podczas kompilacji z kontekstu musi wynikać do jakiego interfejsu ma być dopasowana dana lambda.
        // Object o = x -> 100*x + 13;
        // Object p = (double x) -> {return 100*x + 13;};
	}

}
