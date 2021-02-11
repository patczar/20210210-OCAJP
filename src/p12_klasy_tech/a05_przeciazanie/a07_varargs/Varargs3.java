package p12_klasy_tech.a05_przeciazanie.a07_varargs;

import java.util.Arrays;

public class Varargs3 {

	public static void m(String... slowa) {
		System.out.println("start");
		for(String slowo : slowa) {
			System.out.println("kolejne slowo: " + slowo);
		}
		System.out.println("koniec\n");
		// slowa[0] = "55";
	}

// można zadeklarować metodę, która przyjmuje normalne parametry, a tylko ostatni jest parametrem typu vararg
// w praktyce takie dwie metody jak ta i powyższa prowadziłyby do konfliktu w momencie wywołania
//	public static void m(String arg, String... slowa) {
//		System.out.println("start");
//		for(String slowo : slowa) {
//			System.out.println("kolejne slowo: " + slowo);
//		}
//		System.out.println("koniec\n");
//	}

	public static void m(Object slowo) {
		System.out.println("pojedynczy obiekt "+ slowo);
		System.out.println();
	}

	public static void m(String slowo, String slowo2) {
		System.out.println("dwa slowa");
		System.out.println();
	}

	public static int m(int... liczby) {
		int suma = 0;
		for(int i = 0; i < liczby.length; i++) {
			suma += liczby[i];
			liczby[i]++;
		}
		
		return suma;
	}

	public static void main(String[] args) {
		//NK m();  // niejednoznaczne
		m("ala");
		m("ala", "ola");
		m("ola", "ala", "ela");
		m(null, "ola", "ala", null);
		
		String[] tablica = {"ola", "ala", "ela"};
		m(tablica);
		
		System.out.println(m(1,3,5,7,9));
		
		int[] ti = {10,20,30};
		System.out.println(Arrays.toString(ti));
		System.out.println(m(ti));
		System.out.println(Arrays.toString(ti));
	}
}
