package p25_kolekcje.s_sortowanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortowanie1 {

	public static void main(String[] args) {
		String[] imiona = { "Ala", "Ola", "Iwona", "Magdalena", "Joanna", "Anna", "Teresa",
				"Żaneta", "Ęcki", "Ącki", "Agnieszka", "ala", "Łucja", "Julia", "Julitta", "Zuzanna" };

		List<String> lista = new ArrayList<>(Arrays.asList(imiona));
		System.out.println(lista);

		// dostępne "od początku" kolekcji w Javie
		System.out.println("\nCollections.sort");
		Collections.sort(lista);
		System.out.println(lista);
		// Domyślnie porównywanie Stringów bazuje na kodach Unicode poszczególnych znaków

		System.out.println("\nCollections.shuffle");
		Collections.shuffle(lista);
		System.out.println(lista);

		// Od Javy 8 można też tak:
		System.out.println("\nlista.sort(null)");
		lista.sort(null);
		System.out.println(lista);	
	}
}
