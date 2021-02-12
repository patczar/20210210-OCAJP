package p27_generyki.kolekcje;

import java.util.Arrays;

public class Polimorfizm3_Tablice {
	
	static double suma(Number[] t) {
		double suma = 0.0;
		for (Number number : t) {
			suma += number.doubleValue();
		}
		return suma;
	}
	
	static void modyfikuj(Number[] t) {
		t[0] = new Long(10_000_000_000L);
	}

	public static void main(String[] args) {
		Number[] numbers = new Number[] {10, 20, 30, 40, 50};
		Integer[] ints = new Integer[] {11, 21, 31, 41};

		Number[] numbers2 = ints;
		//NK Integer[] ints2 = numbers2;
		
		
		double wynik;
		wynik = suma(numbers);
		System.out.println(wynik);

		// jesli chodzi o tablicę, to tablica podklas jest traktowana jak podklasa tablicy nadklas
		wynik = suma(ints);
		System.out.println(wynik);
		System.out.println();
		
		modyfikuj(numbers);
		System.out.println(Arrays.toString(numbers));
		
		modyfikuj(ints);
		System.out.println(Arrays.toString(ints));
	}

}
