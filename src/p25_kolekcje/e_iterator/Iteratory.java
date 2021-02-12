package p25_kolekcje.e_iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iteratory {

	// Kod jest napisany tak, jak pisało się w Javie 1.4
	// Nie było generyków (trzeba rzutować)
	// Nie było pętli for-each - trzeba używać iteratorów
	
	public static void main(String[] args) {
		List lista = new LinkedList();
		lista.add("ala");
		lista.add("ola");
		lista.add("ela");
		lista.add("ula");
		System.out.println("Na początku: " + lista);
		
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			String element = (String)it.next();
			System.out.println(element);
			if("ela".equals(element)) {
				it.remove();
			}
		}
		
		System.out.println("Na koniec: " + lista);
	}
}
