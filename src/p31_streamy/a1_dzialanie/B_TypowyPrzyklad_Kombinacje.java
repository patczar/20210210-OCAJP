package p31_streamy.a1_dzialanie;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class B_TypowyPrzyklad_Kombinacje {

	public static void main(String[] args) {
		// InputStream input = System.in;
		// OutputStream output = System.out;

		
		String[] tablica = { "Ala", "Ola", "Iwona", "Magdalena", "Joanna", "Anna", "Teresa",
				"Żaneta", "Ęcki", "Ącki", "Agnieszka", "ala", "Łucja", "Julia", "Julitta", "Zuzanna" };
		List<String> lista = new ArrayList<>(Arrays.asList(tablica));
		
		System.out.println(lista);
		System.out.println();
		
		// można sobie strumień wpisać na zmienną, ale raczej się tego nie robi
		Stream<String> str1 = lista.stream();
		Stream<String> str2 = Stream.of(tablica);
		Stream<String> str3 = Arrays.stream(tablica);
		
		
		lista.stream()
			.filter(s -> s.contains("a"))
			.map(s -> s.toUpperCase())
			.forEach(s -> System.out.println(s));
		
		// to co robimy w strumieniu - filter, map itp. - nie wpływa na zawartość listy
		
		System.out.println();
		System.out.println(lista);
		System.out.println();

		// teraz modyfikuję listę...
		lista.remove("Żaneta");
		lista.add("Mirosław");

		System.out.println(lista);
		System.out.println();
		
		// strumieniń dopiero teraz czyta dane z listy - strumie nie jest kopią listy
		str1.forEach(System.out::println);
	}

}
