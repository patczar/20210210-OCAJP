package p05_liczby;

public class Ciekawostki {

	public static void main(String[] args) {
		int x = 5, y = 1000000000;
		int z = x * y;
		System.out.println(z);
		System.out.println(5 * 1000000000);
		System.out.println(5L * 1000000000);
		System.out.println(3 * 1000000000);
		
		// Gdy wynik obliczenia nie mieści się w zakresie dla danego typu (int lub long)
		// dochodzi do "integer overflow". W Javie nie powoduje to błędu (w sensie wyjątku),
		// po prostu wychodzi "przekręcony" wynik.
		
		System.out.println();
		
		double a = 3.0, b = 1.2;
		System.out.println(a * b);
		System.out.println(3 * 1.2);
		
		double oczekiwany = 3.6;
		if(a*b == oczekiwany ) {
			System.out.println("OK");
		} else {
			System.out.println("Nie OK");
			System.out.println(3.6 - 3 * 1.2);
		}
		
		System.out.println();
		// Liczby zmiennoprzecinkowe (w Javie: float i double) działają w przybliżeniu.
		// W pamięci są zapisany w systemie dwójkowym, a nie dziesiętnym, więc zaokrąglenia nastepują w zapisie binarnym liczby, co utrudnia zrozumienie.
		
		// Praktyczny morał: double nie używa się do liczenia pieniędzy.
		// Lepszą alternatywą jest wyspecjalizowana klasa BigDecimal.
		
		// Liczba całkowita zapisana w kodzie zaczynając od cyfry 0, jest w systemie ósemkowym.
		int n = 0321; // = 3*64 + 2*8 + 1*1
		System.out.println(n);
		System.out.println(0321);
		//NK int m = 098;
		
		System.out.println();
		
		// Od Javy 7 między cyframi można wpisywać znaki _ , które nie zmieniają wartości
		int i = 123_456_789;
		System.out.println(i);
		
		int j = 123____4___5;
		System.out.println(j);
	}

}
