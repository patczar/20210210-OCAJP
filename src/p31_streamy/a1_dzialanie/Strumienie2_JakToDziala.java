package p31_streamy.a1_dzialanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Operacje wypisują co robią na ekran, abyśmy mogli sprawdzić kolejność ich wykonania.
public class Strumienie2_JakToDziala {
	static boolean sprawdz(String s) {
		System.out.println("sprawdzam " + s);
		return s.length() > 3;
	}

	static String mapuj(String s) {
		System.out.println("mapuję " + s);
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		String[] tablica = { "Ala", "Ola", "Iwona", "Magdalena", "Joanna", "Anna", "Teresa",
				"Żaneta", "Ęcki", "Ącki", "Agnieszka", "ala", "Łucja", "Julia", "Julitta", "Zuzanna" };

		List<String> lista = new ArrayList<>(Arrays.asList(tablica));
		
		System.out.println("Przed tworzeniem strumienia");
		
		// Chociaż wskazuję operacje sprawdź i mapuj w momencie definiowania strumienia
		// to one jeszcze się nie wykonują.
		Stream<String> strumien = lista.stream()
			.filter(s -> sprawdz(s))
			.map(s -> mapuj(s));
			
		System.out.println("Strumień utworzony: " + strumien);
		
		lista.add("Dodatkowy");
		
		System.out.println();
		System.out.println("Operacja terminująca:");
		strumien.forEach(s -> System.out.println(" * " + s));
		System.out.println("KONIEC");		
	}

}
