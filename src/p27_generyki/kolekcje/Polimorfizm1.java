package p27_generyki.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Polimorfizm1 {
	
	static double testPojedynczego(Number arg) {
		return arg.doubleValue();
	}
	
	static double suma1(List<Number> lista) {
		double wynik = 0.0;
		for (Number number : lista) {
			wynik += number.doubleValue();
		}
		return wynik;
	}
	
	static void modyfikuj1(List<Number> lista) {
		lista.add(new Long(10_000_000_000L));
	}
	
	static double suma2(List<? extends Number> lista) {
		// lista.add(new Long(10_000_000_000L));
		double wynik = 0.0;
		for (Number number : lista) {
			wynik += number.doubleValue();
		}
		return wynik;
	}
	
	static void modyfikuj2(List<? super Long> lista) {
		lista.add(new Long(10_000_000_000L));
	}

	
	/** Zamienia pierwszy element z ostatnim i zwraca ich średnią */
	
	static <T extends Number> double sredniaZZamiana(List<T> lista) {
		T pierwszy = lista.get(0);
		T ostatni = lista.get(lista.size()-1);
		
		lista.set(0, ostatni);
		lista.set(lista.size()-1, pierwszy);
		
		return (pierwszy.doubleValue() + ostatni.doubleValue()) / 2.0;
	}

	/* to się nie kompilowało, bo wewnątrz funkcji o elementach listy było wiadomo tlyko,
	 * że są to jakieś Numbery - a to za mało aby wpisać do listy niewiadomoczego
	 * Lista mogłaby być listą Integerów, a zmienne pierwszy i ostatni sa typu Number. */
	/*
 	static double sredniaZZamiana2(List<? extends Number> lista) {
		
		Number pierwszy = lista.get(0);
		Number ostatni = lista.get(lista.size()-1);
		
		lista.set(0, ostatni);
		lista.set(lista.size()-1, pierwszy);
		
		return (pierwszy.doubleValue() + ostatni.doubleValue()) / 2.0;
	}
	*/

	/*
	static double sredniaZZamiana3(List<? super Number> lista) {
		Number pierwszy = lista.get(0);
		Number ostatni = lista.get(lista.size()-1);
		
		lista.set(0, ostatni);
		lista.set(lista.size()-1, pierwszy);
		
		return (pierwszy.doubleValue() + ostatni.doubleValue()) / 2.0;
	}
	*/
	
	/* //Takiej składni nie ma:
	static <T super Number> void metoda3(List<T> lista) {
	}
	*/
	
	// Sam znak zapytania jest równoważny <? extends Object> - co nie wnosi żadnej wiedzy
	// "lista czegokolwiek"
	// To nie jest to samo co List<Object> !!!
	// bo wtedy nie dałoby się przekazać np. List<Integer>
	
	// To też nie jest to samo co po prostu List.
	
	static int metoda4a(List<Object> lista) {
		return lista == null ? 0 : lista.size();
	}

	static int metoda4(List<?> lista) {
		return lista == null ? 0 : lista.size();
	}
	
	
	static void metoda5(List<?> lista) {
		// z takiej listy można odczytywać elementy - są dla nas Objectami
		Object o = lista.get(0);
		
		// do takiej listy nie możemy wstawić niczego innego niż null
		
		// być może jest to lista Integerów? albo Stringów? nie wiadomo - na wszelki wypadek kompilator zabrania wstawiać czegokolwiek-
		//NK lista.add(new Object());
		
		// null pasuje do każdego typu
		lista.add(null);
	}
	
	public static void main(String[] args) {
		double wynik;

		Number nn = new Long(123L);
		Integer ii = new Integer(321);
		
		wynik = testPojedynczego(nn);
		System.out.println(wynik);
		wynik = testPojedynczego(ii);
		System.out.println(wynik);
		System.out.println();
		
		List<Number> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		
		
		List<Integer> ints = new ArrayList<>();
		ints.add(11);
		ints.add(21);
		ints.add(31);
		ints.add(41);
		System.out.println(ints);
		
		wynik = suma1(numbers);
		System.out.println(wynik);
		System.out.println();
		
		// Gdy metoda oczekuje listy Numberów, nie można przekazać listy Integerów
//		wynik = suma1(ints);
//		System.out.println(wynik);
//		System.out.println();
		

		// Do listy Numberów można dodać Longa - OK
		modyfikuj1(numbers);
		System.out.println(numbers);
		
		// Gdyby można było przekazywać, to to wywołanie zepsułoby listę Integerów
		// - na takiej liście znalazłby się Long
//		modyfikuj1(ints);
//		System.out.println(ints);		
		System.out.println();

		// Nie wolno też przypisać List<Integer> na zmienną List<Number>
		//NK List<Integer> ints2 = numbers;
		
		wynik = suma2(numbers);
		System.out.println(wynik);
		System.out.println();

		wynik = suma2(ints);
		System.out.println(wynik);
		System.out.println();

		modyfikuj2(numbers);
		System.out.println(numbers);

//		modyfikuj2(ints);
//		System.out.println(ints);
		
		//NK metoda4a(ints); // List<Object>
		
		metoda4(ints); // List<?>

	}
	
}
