package p25_kolekcje.s_sortowanie;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Sortowanie2 {
	public static void main(String[] args) {
		String[] imiona = { "Ala", "Ola", "Iwona", "Magdalena", "Joanna", "Anna", "Teresa",
				"Żaneta", "Ęcki", "Ącki", "ala", "Agnieszka", "Łucja", "Julia", "Julitta", "Ela", "Zuzanna" };

		List<String> lista = new ArrayList<>(Arrays.asList(imiona));
		System.out.println(lista);

		// Pierwszy sposób utworzenia komparatora: oddzielna klasa

		System.out.println("\nlista.sort( komparator )");
		// Collections.shuffle(lista);
		KomparatorDlugosciNapisow komparator = new KomparatorDlugosciNapisow();
		lista.sort(komparator);
		System.out.println(lista);

		System.out.println("\nCollections.sort( lista, komparator )");
		Collections.sort(lista, komparator);
		System.out.println(lista);

		// Drugi sposób utworzenia komparatora: klasa anonimowa
		// Składnia dostepna od początków Javy
		System.out.println("\nlista.sort( klasa anonimowa )");
		lista.sort(new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		System.out.println(lista);

		// Trzeci sposób utworzenia komparatora:
		// wyrażenie lambda (od Javy 8)
		System.out.println("\nlista.sort( lambda )");
		lista.sort((s1, s2) -> s1.length() - s2.length());
		System.out.println(lista);

		System.out.println("\nCollator");
		lista.sort(Collator.getInstance());  // wg bieżących ustawień językowych w systemie
		System.out.println(lista);
		lista.sort(Collator.getInstance(Locale.CANADA_FRENCH));
		System.out.println(lista);
		lista.sort(Collator.getInstance(new Locale("pl", "PL")));
		System.out.println(lista);
	}
}
