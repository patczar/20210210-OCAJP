package p25_kolekcje.e_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Konkurencja6 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Ala");
		lista.add("Ola");
		lista.add("Ela");
		lista.add("Ula");
		System.out.println(lista);
		
		String a, b, c;
		
		Iterator<String> it1 = lista.iterator();
		a = it1.next();
		System.out.println("it1 jest na pozycji " + a);
		
		ListIterator<String> it2 = lista.listIterator();
		it2.next();
		b = it2.next();
		System.out.println("it2 jest na pozycji " + b);

		a = it1.next();
		a = it1.next();
		System.out.println("it1 jest na pozycji " + a);
		// dopóki tylko odczytujemy elementy kolekcji, można używać wielu iteratorów jednocześnie
		System.out.println();

		
		it2.add("Jola");
		// it2.remove();
		// lista.add("Fasola");
		System.out.println("dodałem nowy element za pomocą it2");
		System.out.println(lista);
		
		try {
			// Kolekcja została zmodyfikowana nie poprzez iterator it1.
			// Teraz próba wykonania operacji poprzed it1 kończy się wyjątkiem.
			
			System.out.println("przesuwam it1");
			a = it1.next();
			System.out.println("it1 jest na pozycji " + a);
		} catch (Exception e) {
			System.out.println("Wyjątek " + e);
		}

	}

}
