package p22_wrappery;

import java.util.HashMap;
import java.util.Map;

public class Wrappery5_Null {
	
	static int pomnoz(Integer a) {
		return 2*a;
	}

	static int dodaj(int a) {
		return 2*a;
	}
	
	public static void main(String[] args) {
		// Ten program powoduje błędy w czasie wykonania. Oczywiście przerwie się przy pierwszym błędzie.
		// Jeśli chcesz zobaczyć kolejne kroki, to zakomentuj linie powodujące błędy.
		
		Integer x, y;		
		x = 55;
		y = null;
		
		System.out.println(pomnoz(x)); 
		System.out.println(dodaj(x));
		
		System.out.println(pomnoz(y)); // NPE w środku metody
		System.out.println(dodaj(y)); // NPE przy przekazywaniu parametru
		
		int z = y; // NPE przy przypisaniu
		System.out.println(z);
		// Bo tak naprawdę unboxing jest realizowany za pomocą:
		int z2 = y.intValue();
		
		// Szczególnie trzeba uważać przy korzystaniu z map:
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("Ala", 30);
		mapa.put("Ola", 40);
		
		// typy błąd programisty:
		// NullPointerException, bo mapa.get zwraca null, a my wpisujemy to na zmienną int
		int wiek = mapa.get("Ula");
		System.out.println(wiek);
		
		// Z kolei gdy wyciągniemy wartość na zmienną Integer, to tu nie ma błędu.
		Integer wiek2 = mapa.get("Ula");
		System.out.println(wiek2);
		// I ew. można sprawdzać
		if(wiek2 != null) {
			System.out.println("jest wartość: " + wiek2);
		}
		
		// Ale bez takie sprawdzenia operacje liczbowe będą powodowały błędy:
		System.out.println(wiek2 + 1);
	}

}
