package p23_wrappery;

import java.util.HashMap;
import java.util.Map;

public class UwagaMapa {

	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();
		mapa.put("Ala", 30);
		mapa.put("Ola", 40);
		
		// typy błąd programisty:
		// NullPointerException, bo mapa.get zwraca null, a my wpisujemy to na zmienną int
//		int wiek = mapa.get("Ula");
//		System.out.println(wiek);
		
		Integer wiek2 = mapa.get("Ula");
		System.out.println(wiek2);
		
		// teraz operacje liczbowe będą powodowały błedy:
		// System.out.println(wiek2 + 1);
	}

}
