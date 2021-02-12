package p16_interfejsy.v2;

/* Klasa może implementować wiele interfejsów.
 * W Javie 8 oznacza to, że:
 * - musi zaimplementować wszystkie niezaimplementowane metody z tych interfejsów,
 * - nie musi implementować tych metod, które występują tylko w jednym z interfejsów
 *   i mają tam implementację domyślną,
 * - ale musi jawnie zaimplementować te metody, które występują w więcej niż jednym interfejsie
 *   (obojętnie czy gdzieś mają implementację domyślną, czy kilka implementacji, czy żadnej).
 */

public class WielodziedziczenieKlasa implements Interfejs, InnyInterfejs {
	// Muszę zaimplementować, bo nie było implementacji domyślnej.
	public int wartosc() {
		return 123;
	}

	// Muszę zaimplementować, bo metoda występowała w obu interfejsach.
	public void wypisz() {
		// Nowa składnia od Javy 8:
		// możliwość wskazania instniejącej implementacji z interfejsu
		Interfejs.super.wypisz();
		System.out.println("a kuku");
		InnyInterfejs.super.wypisz();
	}
	
	// Tutaj przykładowo nie implementujemy metody tytuł - bo już ma domyślną implementację
	
	public static void main(String[] args) {
		new WielodziedziczenieKlasa().wypisz();
	}
}
