package p25_kolekcje.b_set_map;

import java.math.BigDecimal;
import java.text.Collator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ZbiorDziwnieSortowany {

	public static void main(String[] args) {
		TreeSet<String> normalny = new TreeSet<>();
		TreeSet<String> alfabetyczny = new TreeSet<>(Collator.getInstance());
		// TreeSet<String> alfabetyczny = new TreeSet<>(Collator.getInstance(new Locale("fr", "FR")));
		TreeSet<String> dziwny = new TreeSet<>((a,b) -> a.length() - b.length());
		
		normalny.add("Ala");
		alfabetyczny.add("Ala");
		dziwny.add("Ala");

		normalny.add("Ącki");
		alfabetyczny.add("Ącki");
		dziwny.add("Ącki");

		normalny.add("Łucja");
		alfabetyczny.add("Łucja");
		dziwny.add("Łucja");

		normalny.add("Wiktor");
		alfabetyczny.add("Wiktor");
		dziwny.add("Wiktor");

		normalny.add("Hermenegilda");
		alfabetyczny.add("Hermenegilda");
		dziwny.add("Hermenegilda");
		
		normalny.add("Ola");
		alfabetyczny.add("Ola");
		dziwny.add("Ola");
		
		// Ola jest traktowana jak == Ala, bo comparator zwraca 0 gdy napisy są tej samej długości
		// TreeSet i TreeMap nie uzywają equals do sprawdzenia czy elementy sa równe, ograniczają się do użycia compare albo compareTo

		System.out.println(normalny);
		System.out.println(alfabetyczny);
		System.out.println(dziwny);
		
		System.out.println();
		
		System.out.println("Sprawa BigDecimal:");
		BigDecimal[] liczby = {
			new BigDecimal("123.00"),
			new BigDecimal("123.0"),
			new BigDecimal("123"),
			new BigDecimal("124"),
		};
		
		Set<BigDecimal> t = new TreeSet<>();
		Set<BigDecimal> h = new HashSet<>();
		for(BigDecimal b : liczby) {
			t.add(b);
			h.add(b);
		}
		
		System.out.println("Tree: " + t);
		System.out.println("Hash: " + h);
	}
}
