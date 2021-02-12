package p25_kolekcje.e_iterator;

import java.util.ArrayList;
import java.util.List;

public class Konkurencja4 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("ala");
		lista.add("ola");
		lista.add("ela");
		lista.add("ula");
		System.out.println("Na początku: " + lista);
		
		// wyjątek pojawia się także gdy modyfikujemy listę metodami add/remove
		// w trakcie przeglądania jej jakimś iteratorem
		// pętla for-each ma w sobie zaszyty niejawny iterator
		for (String element : lista) {
			System.out.println(element);
			if(element.charAt(0) == 'o') {
				// lista.set(3, "Agata"); // to nie spowodowało błędu

				lista.remove(2); // to psuje działanie pętli for-each
				// lista.add("ewa"); // to też psuje
				System.out.println("już usunąłem");
			}
		}
	}

}
