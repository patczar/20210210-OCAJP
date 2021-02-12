package p14_wyjatki;

public class ProsteDzialanieWyjatkow {
	
	static void metoda(String arg) {
		try {
			System.out.println("Początek metody: " + arg);
			int x = arg.length();
			System.out.println("Długość napisu: " + x);
			if(x == 1) {
				return; // przerwanie metody
			}
			
			int y = 10 / x;
			System.out.println("Wynik dzielenia: " + y);
		} finally {
			System.out.println("FINALLY w metodzie");
		}
	}

	public static void main(String[] args) {
		
		try {
			//metoda("Ala ma kota");
			 metoda(null);
			// metoda("");
			// metoda("A");
			System.out.println("Przed catch");
		} catch(NullPointerException e) {
			System.out.println("Był wyjątek NPE");
		} finally {
			System.out.println("FINALLY w main");
		}
		
		System.out.println("Koniec programu");
	}
}
