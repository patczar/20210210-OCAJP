package p14_wyjatki;

public class ProsteDzialanieWyjatkow_BezCatch {
	
	static void metoda(String arg) {
		System.out.println("Początek metody: " + arg);
		int x = arg.length();
		System.out.println("Długość napisu: " + x);
		if(x == 1) {
			return; // przerwanie metody
		}
		
		int y = 10 / x;
		System.out.println("Wynik dzielenia: " + y);
	}

	public static void main(String[] args) {
		metoda("Ala ma kota");
		// metoda(null);
		// metoda("");
		// metoda("A");
		System.out.println("Przed catch");
		
		System.out.println("Koniec programu");
	}
}
