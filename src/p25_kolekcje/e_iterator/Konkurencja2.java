package p25_kolekcje.e_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Konkurencja2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("ala");
		lista.add("ola");
		lista.add("ela");
		lista.add("ula");
		System.out.println("Na początku: " + lista);

		Iterator<String> it1 = lista.iterator();
		while(it1.hasNext()) {
			String element = it1.next();
			System.out.print(element);
			
			Iterator<String> it2 = lista.iterator();
			while(it2.hasNext()) {
				String elem2 = it2.next();
				System.out.print(" " + elem2.length());
				if(elem2.charAt(0) == 'o') {
					it2.remove();
				}
			}
			System.out.println();
		}
		// Jesli uzywamy iterator (it1) a w tym czasie w inny sposób zmienimy kolekcję
		// (np. innym iteratorem), to kolejna operacja na tym pierwszym iteratorze skończy sie wjątkiem ConcurrectModificationEx
	}

}
