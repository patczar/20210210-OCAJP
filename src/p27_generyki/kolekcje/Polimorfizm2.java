package p27_generyki.kolekcje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Polimorfizm2 {
	
	// Przykład funkcji, która zadziała dla dowolnej listy - typ elementu w ogóle nieistotny
	static void usunOstatni(List<?> lista) {
		int size = lista.size();
		if(size > 0) {
			lista.remove(size-1);
		}
	}
	
	// Do tak zadeklarowanej funkcji będzie można przekazać tylko listę Objectów
	// (konkretnie List<Object>, nic innego)
	static void usunOstatniZle(List<Object> lista) {
		int size = lista.size();
		if(size > 0) {
			lista.remove(size-1);
		}
	}
	
	public static void main(String[] args) {
		List<String> listaStringow = new ArrayList<>();
		List<Integer> listaIntow = new ArrayList<>();
		List<LocalDate> listaDat = new ArrayList<>();
		
		List<?> lista1 = new ArrayList<>();
		// do tak zadeklarowanej listy nie można dodać niczego
		// lista1.add("ala");
		
		// OK, można dodać nulla
		lista1.add(null);
		
		// Dlaczego?
		// List<?> jest równoważna takiej:
		List<? extends Object> lista2 = new ArrayList<>();
		// lista2.add("ala");
		lista2.add(null);
		
		// To znaczy, że na taką zmienną można wpisać dowolną listę:
		lista2 = listaDat;
		// czy można wpisać Stringa na taką listę?
		// kompilator zabrania wstawiać czegokolwiek - chodzi o tym zmiennej, a nie listy w pamięci

		// lista2.add("ala");
		lista2 = listaIntow;
		
		lista1 = listaDat;
		lista1 = listaIntow;
		
		for (Object object : lista1) {
			// podczas czytania elementy widzimy jako Objecty
		}
		
		
		Class<Polimorfizm2> klasa1 = Polimorfizm2.class;
		//NK Class<Polimorfizm2> klasa2 = String.class;
		
		Class<?> klasa3 = Polimorfizm2.class;
		Class<?> klasa4 = String.class;
		
		Class<? extends Number> klasa5;
		klasa5 = Integer.class;
		klasa5 = Long.class;
		klasa5 = Number.class;
		//NK klasa5 = String.class;
	}

}
