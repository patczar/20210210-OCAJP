package p10_klasy.v5_dziedziczenie;

public class Sklep {
	
	static void sprzedajPiwo(Osoba klient) {
		System.out.println("A któż to przyszedł na piwo?...");
		klient.przedstawSie();
		
		if(klient.jestPelnoletnia()) {
			System.out.println(klient.imie + " może kupić piwo");
		} else {
			System.out.println(klient.imie + " nie może kupić piwa, bo jest niepełnoletni/a");
		}
	}

}