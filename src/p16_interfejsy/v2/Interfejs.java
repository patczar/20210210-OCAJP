package p16_interfejsy.v2;

public interface Interfejs {
	String NAZWA = "ALX";
	
	int wartosc();
	
	// Od Javy 8 interfejsy mogą zawierać metody z implementacjami
	// 1) "domyślne" implementacje metod instancyjnych
	default void wypisz() {
		System.out.println("defaultowe wypisz z wartością " + wartosc());
		// odwoływanie się w tym miejscu do metody, która jeszcze nie implementacji, to jest wzorzec projektowy "template method"
	}
	
	default String tytul() {
		return "Warszawa";
	}

	// słowo default jest wymagane
//	void n() {
//		System.out.println("cokolwiek");
//	}
	
	// default w pewnym sensie unieważnia abstract
	// to jest niepoprawne składniowo:
//	abstract default void m() {
//		System.out.println("cokolwiek");
//	}
	
	// metoda default nie może być final. Inaczej mówiąc klasa zawsze ma możliwość nadpisania tej domyślnej implementacji.
//	final default String k() {
//		return "Warszawa";
//	}
	
	// 2) metody statyczne
	public static void powtorz(Interfejs obiekt, int n) {
		for(int i = 1; i <= n; i++) {
			obiekt.wypisz();
		}
	}
}
