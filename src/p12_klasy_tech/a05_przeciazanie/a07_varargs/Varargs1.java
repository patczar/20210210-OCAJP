package p12_klasy_tech.a05_przeciazanie.a07_varargs;

import java.util.Arrays;

public class Varargs1 {

	static void test(String... slowa) {
		// parametr wewnątrz metody jest widziany jako tablica
		System.out.println(slowa.getClass());
		System.out.println(slowa.length + " " + Arrays.toString(slowa));
		System.out.println();
	}
	
	static int sum(int... liczby) {
		int suma = 0;
		for (int x : liczby) {
			suma += x;
		}
		return suma;
	}
	
	
	//Mając metodę String..., nie można już definiować metody String[] o tej samej nazwie
	
//	static void test(String[] tab) {
//	}
	
	
	
	/* Parametr z wielokropkiem może być tylko jeden, na samym końcu.
	 Te wersje się nie kompilują:
	 
	void p(String... args, int... ints) {
		
	}

	void q(int x, int... ints, int y) {
		
	}
	*/
	
	// deklaracje są poprawne, niejednoznaczna będzie próba wywołania
	static void test(int a, int... reszta) {
		// OK
	}

	static void test(int a, int b, int... reszta) {
		// OK
	}

	
	public static void main(String[] args) {
		test();
		test("Ala");
		test("Ala", "Ola", "Ela");
		
		System.out.println();
		
		System.out.println(sum(1,3,5,7));
		System.out.println(sum());
		System.out.println();
		
		// do takiej metody można też przekazać prawdziwą tablicę
		
		String[] miasta = {"Warszawa", "Kraków", "Łódź"};
		test(miasta);
		int[] t = new int[100];
		Arrays.fill(t, 7);
		System.out.println(sum(t));
		
		//NK test(1,2,3);

	}

}
