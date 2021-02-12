package p31_streamy.a1_dzialanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Strumienie2c {
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
			.filter(s -> sprawdz(s))
			.map(s -> mapuj(s));
			
		System.out.println("Strumień utworzony: " + strumien);
		System.out.println();
		System.out.println("Operacja terminująca:");
		strumien.forEach(s -> System.out.println(" * " + s));
		// forEach nie ma obowiązku zachowania kolejności i w przypadku parallelStream nie zachowuje
		System.out.println("KONIEC");
		
	}

}
