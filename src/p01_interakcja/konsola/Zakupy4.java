package p01_interakcja.konsola;

import java.util.Locale;
import java.util.Scanner;

public class Zakupy4 {

	// Scanner, printf, String.format uzwględniają ustawienia regionalne
	// np. dla języka polskiego formatują liczby z przecinkiem
	
	// W tej wersji ustawiam język na "amerykański" dla całej aplikacji
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Co chcesz kupić?");
		String towar = sc.nextLine();
		
		System.out.println("Ile kosztuje jedna sztuka " + towar + "?");
		double cena = sc.nextDouble();
		
		System.out.println("Ile sztuk " + towar + " chcesz kupić?");
		int ilosc = sc.nextInt();
		
		double koszt = cena * ilosc;
		System.out.println("Za " + ilosc + " sztuk towaru " + towar + " zapłacisz " + koszt + " zł");

		// printf - wyjście sformatowane
		// %s oznacza "wstaw jako tekst" - zadziałają domyslne konwersje języka Java, tak jak byśmy uzywali println
		System.out.printf("Za %s sztuk towaru %s zapłacisz %s zł\n", ilosc, towar, koszt);

		// %d - liczb całkowite
		// %f - liczby z ułamkiem - teraz mamy możliwość dalszego formatowania
		// np. %.2f - zaokgrągla wynik do 2 miejsc po przecinku
		// przecinek
		System.out.printf("Za %d sztuk towaru %s zapłacisz %f zł\n", ilosc, towar, koszt);
		System.out.printf("Za %d sztuk towaru %s zapłacisz %.2f zł\n", ilosc, towar, koszt);

		
	}

}
