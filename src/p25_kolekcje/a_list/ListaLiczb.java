package p25_kolekcje.a_list;

import java.util.ArrayList;
import java.util.List;

public class ListaLiczb {

	public static void main(String[] args) {
		//NK List<int> lista = new ArrayList<>();
		List<Integer> lista = new ArrayList<>();
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		System.out.println(lista);
		System.out.println("rozmiar: " + lista.size());
		
//		if(lista.remove(5)) {			
//		}
		
		Integer element = lista.remove(5); // wg indeksu
		
		System.out.println("Usunięty element: " + element);
		System.out.println(lista);
		
		Integer x = 9;
		if(lista.remove(x)) { // wg wartości
			System.out.println("usunąłem wartość 9");
		}
		
		boolean b = lista.remove((Integer)5); // OK, wg wartości
		// boolean b = lista.remove((Object)5); // wg wartości
		System.out.println("Czy usunięto? " + b);
		System.out.println(lista);
	}

}
