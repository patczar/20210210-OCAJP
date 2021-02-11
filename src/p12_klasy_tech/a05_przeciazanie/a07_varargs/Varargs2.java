package p12_klasy_tech.a05_przeciazanie.a07_varargs;

import java.util.Arrays;
import java.util.List;

public class Varargs2 {
	
	public static void m(String... slowa) {
		// slowa jest typu String[]
		
		System.out.println("start");
		System.out.println(slowa.length); // NPE jeśli przekazano null-a
		for(String slowo : slowa) {
			System.out.println("kolejne slowo: " + slowo);
		}
		System.out.println();
	}
	
//	public static void m(String[] slowa) {
	//	nie może być jednoczesnie metody String...   i String[]		
//	}

	public static void main(String[] args) {
		
		m();
		m("ala");
		m("ola", "ala", "ela");
		m(null, "ola", "ala", null);
		m(null, null); // tablica String[] zawierająca dwa nulle
		//NPE m(null);  // bo kompilator "myśli" że null jako tablica i w pętli for-each nastepuje NPE
		m((String)null);  // a teraz jednak tablica zawierająca nulla
		
		String[] tablica = {"ola", "ala", "ela"};
		m(tablica);
		
		m(new String[] {"jeden", "dwa"});
		
		//NK m({"jeden", "dwa"});
		
		List<String> lista1 = Arrays.asList(tablica);
		List<String> lista2 = Arrays.asList("ala", "ola", "ela");
	}

}
