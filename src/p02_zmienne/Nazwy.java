package p02_zmienne;

public class Nazwy {

	public static void main(String[] args) {
		// Nazwa nie może zaczynać się od cyfry
		//NK String 1rstElement = "pierwszy";
		
		// Nazwa może zaczynać się od litery, znaku _ lub znaku $
		String abc123 = "abc123";
		String _123 = "qwerty";
		String $123 = "qwertz";
		
		// wielkość liter ma znaczenie, to są dwie różne zmienne
		int x = 10, X = 20;
		
		System.out.println(x);
		System.out.println(X);
		
		// Można używać liter z różnych alfabetów
		int żółć = 333;
		System.out.println(żółć);

		String 李 = "李";
		System.out.println(李);
		
		int $a, a; // to są różne zmienne
		
		int $ = 444, $3 = 33, __ = 44;
		System.out.println($);
		System.out.println($3);
		System.out.println(__);
		
// Nazwami nie mogą być słowa kluczowe ani pojedynczy znak podkreślenia
		
		// String int = "pomyłka";
		String var = "okej, nawet w Javie 11";
		
//		String _ = "aaa";
//		System.out.println(_);
		
	}

}
