package p31_streamy.a1_dzialanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Strumienie2g {
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
		
		Stream<String> strumien = lista.parallelStream()
			.unordered()
			.filter(s -> sprawdz(s))
			.map(s -> mapuj(s))
			.limit(5);
		// unordered - zapomnij o kolejności; to może zwiekszyć wydajność, ale wyniki tego przykładu
		// (gdzie mamy limit) są niedetrministyczne
		// teraz zmienia się zestaw elementów wyświetlanym na końcu forEachem
			
		System.out.println("Strumień utworzony: " + strumien);
		System.out.println();
		System.out.println("Operacja terminująca:");
		strumien.forEachOrdered(s -> System.out.println(" * " + s));
		System.out.println("KONIEC");
	}

}
