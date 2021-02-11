package p10_klasy.v6_polimorfizm;

public class Sklep {
	
	static void sprzedajPiwo(Osoba klient) {
		System.out.println("Do sklepu przyszedł klient " + klient.imie + " " + klient.nazwisko);
		
		if(klient.jestPelnoletnia()) {
			System.out.println(klient.imie + " może kupić piwo");
		} else {
			System.out.println(klient.imie + " nie może kupić piwa, bo jest niepełnoletni/a");
		}
	}

}
