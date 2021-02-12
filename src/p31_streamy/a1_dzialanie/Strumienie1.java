package p31_streamy.a1_dzialanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strumienie1 {

	public static void main(String[] args) {
		String[] tablica = { "Ala", "Ola", "Iwona", "Magdalena", "Joanna", "Anna", "Teresa",
				"Żaneta", "Ęcki", "Ącki", "Agnieszka", "ala", "Łucja", "Julia", "Julitta", "Zuzanna" };

		List<String> lista = new ArrayList<>(Arrays.asList(tablica));
		
		Stream<String> str1 = lista.stream();
		System.out.println(str1);
		
		str1.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		System.out.println();
		
		// Jednego strumienia nie można używać wielokrotnie
		// forEach jest "operacją terminującą" i zamyka strumień
		//EXN str1.forEach(s -> System.out.print(s + "; "));
		
		// Jest też forEach bezpośrednio na liście (na każdym Iterable)
		lista.forEach(s -> System.out.print(s + "; "));
		System.out.println();
		
		// Zobaczmy po kolei jakiego typu wyniki wychodzą:
		Stream<String> str2a = Arrays.stream(tablica);
		Stream<String> str2b = str2a.filter(s -> s.length() > 3);
		Stream<String> str2c = str2b.map(s -> s.toUpperCase());
		
		// Stream<Integer> str2d = str2c.map(s -> s.length());
		// albo - w praktyce lepiej:
		IntStream str2e = str2c.mapToInt(s -> s.length());
		
		// Strumienie liczb oferują dodatkowe operacje.
		int suma = str2e.sum();
		System.out.println(suma);
		System.out.println();
		
		// Zazwyczaj nie tworzy się zmiennych pośrednich, tylko zapisuje jednym ciągiem ("pipeline"):
		suma = Arrays.stream(tablica)
			.filter(s -> s.length() > 3)
			.map(s -> s.toUpperCase())
			.mapToInt(s -> s.length())
			.sum();
		System.out.println(suma);
	}

}
