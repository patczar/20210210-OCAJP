package p12_klasy_tech.a01_dziedziczenie.przeslanianie;

public class TestOverridingu {

	public static void main(String[] args) {
		A obiekt = new B();
		
		System.out.println(obiekt.zmienna_statyczna);
		System.out.println(obiekt.zmienna_instancyjna);
		System.out.println(obiekt.metoda_statyczna());
		System.out.println(obiekt.metoda_instancyjna());
		
		// Overriding działa tylko dla metod instancyjnych. O tym która wersja metody się wykona decyduje klasa obiektu w pamięci w czasie działania programu.
		
		// Dla zmiennych oraz dla metod statycznych o tym co się wypisze/co zadziała decyduje typ zmiennej.
	}

}
