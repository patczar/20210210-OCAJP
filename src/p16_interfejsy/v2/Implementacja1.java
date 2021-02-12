package p16_interfejsy.v2;

public class Implementacja1 implements Interfejs {

	// implementacja musi zdefiniować te metody, które nie miały implementacji w interfejsie
	// a może zaimplementować (nadpisać) metody default (niekoniecznie wszystkie)
	
	public int wartosc() {
		return 1313;
	}
	
	public void nowaMetoda() {
		// będą w implementacji interfejsu można odwoływać się do stałych
		System.out.println(NAZWA);
		System.out.println(Interfejs.NAZWA);

		// nie można odwoływać się w ten sposób do metod statycznych
		//NK powtorz(this, 5);
		Interfejs.powtorz(this, 5);
	}

	
	public static void main(String[] args) {
		Implementacja1 obiekt = new Implementacja1();
		
		obiekt.wypisz(); // zadziała defaultowe wypisz z interfejsu, ale w środku wartosc 1313
		
		obiekt.nowaMetoda();

		// Zmienne (stałe) są "dziedziczone" z interfejsu do klasy.
		System.out.println(obiekt.NAZWA);
		System.out.println(Implementacja1.NAZWA);
		System.out.println(Interfejs.NAZWA);

		// Metody statycznie NIE SĄ "dziedziczone" z interfejsu do klasy.
		// obiekt.powtorz(obiekt, 3);
		// Implementacja1.powtorz(obiekt, 3);
		// można ją wywoływać tylko bezpośrednio przez interfejs
		Interfejs.powtorz(obiekt, 3);


	}
}
