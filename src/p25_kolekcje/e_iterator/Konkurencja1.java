package p25_kolekcje.e_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Konkurencja1 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("ala");
		lista.add("ola");
		lista.add("ela");
		lista.add("ula");
		System.out.println("Na początku: " + lista);

		// można używać wielu iteratorów do odczytu kolekcji - to jest OK
		Iterator<String> it1 = lista.iterator();
		while(it1.hasNext()) {
			String element = it1.next();
			System.out.print(element);
			
			Iterator<String> it2 = lista.iterator();
			while(it2.hasNext()) {
				System.out.print(" " + it2.next().length());
			}
			System.out.println();
		}
	}

}
