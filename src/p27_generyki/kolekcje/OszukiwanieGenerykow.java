package p27_generyki.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class OszukiwanieGenerykow {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		Integer i = 99;
		
		lista.add("Ala");
		//NK lista.add(7);
		//NK lista.add(i);
		
		List oszust = lista;
		
		oszust.add("Ola");
		oszust.add(i);  // tu nie jeszcze błędu
		oszust.add(8);
		
		System.out.println(lista.size());
		System.out.println(lista);
		
		for(Object o : lista) {
			System.out.println(o + " obiekt klasy " + o.getClass().getSimpleName());
		}
		System.out.println();
		
		for(String s : lista) {  // dopiero tu jest błąd CCE gdy dojdziemy do Integera
			System.out.println(s);
		}
	}
}
