package p27_generyki.kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OszukiwanieGenerykow2 {
	
	static void metodaOszukujaca(List<String> lista) {
		List oszust = lista;
		oszust.add(new Integer(113));
	}

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<String>();
		lista1.add("Ala");
		lista1.add("Ola");
		System.out.println(lista1);
		metodaOszukujaca(lista1);
		System.out.println(lista1);
		System.out.println();

		List<String> lista2 = new ArrayList<String>();
		List<String> listaZabezpieczona = Collections.checkedList(lista2, String.class);
		
		// checkedList daje zachowanie typu "fail-fast" - od razu w momencie wykonanie niepoprawnej operacji następuje wyjątek
		
		lista2.add("Ela");
		listaZabezpieczona.add("Ula");
		
		// listaZabezpieczona jest "widokiem" listy oryginalnej
		// zmiany dokonywane poprzez jedną zmienną są widziane przez drugą
		System.out.println(lista2);
		System.out.println(listaZabezpieczona);
		
		metodaOszukujaca(listaZabezpieczona); // teraz będzie wyjątek już przy próbie dodania niezgodnego elementu
		System.out.println(lista2);
	}
}
