package p12_klasy_tech.a05_przeciazanie.a02_liczby;

import java.util.ArrayList;

public class ListaLiczb {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		
		System.out.println(lista);
		
		lista.add(10);
		lista.add(30);
		lista.add(40);
		System.out.println(lista);
		
		lista.add(1, 20);
		System.out.println(lista);
		
		// usuń spod podanego indeksu
		Integer coUsunieto = lista.remove(1);
		
		// usuń element 40
		boolean czyUsunieto = lista.remove((Integer)40);
		
		// Przykładowo na egzaminie moga napisać:
		// a to się nie skompiluje, bo ta wersja remove nie zwraca boolean
		int i = 13;
//NK	if(lista.remove(i)) {
//			
//		}

		// teraz OK - ta wersja remove zwraca boolean
		Integer ii = 33;
		if(lista.remove(ii)) {
			
		}

	}

}
