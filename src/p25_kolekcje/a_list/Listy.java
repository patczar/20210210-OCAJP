package p25_kolekcje.a_list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Listy {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		System.out.println(lista);

		// dodaje na koniec
		lista.add("ola");
		lista.add("ala");

		boolean coSieStalo = lista.add("ela");
		System.out.println(coSieStalo);
		if(lista.add("iza")) {
			System.out.println("Iza też");
		}
		
		System.out.println(lista);
		
		System.out.println();
		// odczyt z określonej pozycji, numeracja od 0 jak w tablicach
		String x = lista.get(0);  // lista[0] - tak się nie da
		System.out.println(x);
		x = lista.get(2);
		System.out.println(x);
		//EXN x = lista.get(lista.size());
		// System.out.println(x);
		
		// dodaje na okreslona pozycje, przesuwa dotychczasowe elementy w prawo
		// tu może być od 0 do 4, ale już nie 5 (IOOBExn)
		lista.add(2, "ewa");
		lista.add(lista.size(), "ostatnia"); // OK
		System.out.println(lista);
		
		// nadpisuje element na podanej pozycji nowym elementem
		lista.set(2, "ula");
		System.out.println(lista);
		System.out.println();
		
		lista.add(0, "ala");
		System.out.println(lista);

		// usuwa z określonej pozycji, zwraca obiekt
		String wynik = lista.remove(3);
		System.out.println("usunąłem element : " + wynik);
		System.out.println(lista);
		
		// to by usunęło od razu wszystkie wystąpienia elementu "ala"
		// boolean b = lista.removeAll(Collections.singleton("ala"));
		
		// to usuwa pierwsze wystąpienie, elementy są porównywane za pomocą equals, wynik boolean mówi czy element został usunięty
		boolean b = lista.remove("ala");
		System.out.println("bool : " + b);
		System.out.println(lista);

		b = lista.remove("ala");
		System.out.println("bool : " + b);
		System.out.println(lista);

		b = lista.remove("ala");
		System.out.println("bool : " + b);
		System.out.println(lista);
		
		System.out.println();
		lista.addAll(Arrays.asList("ola", "ela", "ewa", "kasia", "marysia", "aga"));
		System.out.println(lista);
		
		System.out.println("indexOf: " + lista.indexOf("ewa"));
		System.out.println("contains: " + lista.contains("ewa"));
		System.out.println();
		System.out.println("indexOf: " + lista.indexOf("Ewa")); // -1
		System.out.println("contains: " + lista.contains("Ewa")); // false
		System.out.println();
		
		Collections.sort(lista);
		System.out.println(lista);
		
		for(String s : lista) {
			System.out.println("Kolejny element: " + s);
		}
	}
}
