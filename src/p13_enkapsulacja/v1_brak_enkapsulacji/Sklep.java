package p13_enkapsulacja.v1_brak_enkapsulacji;

public class Sklep {

	public void sprzedajPiwo(Osoba klient) {
		if(klient.wiek >= 18) {
			System.out.println("Osoba " + klient.imie + " " + klient.nazwisko + " kupuje piwo.");
		} else {
			System.out.println("Niepełnoletnia " + klient.imie + " nie może kupić piwa");
		}
	}
	
}
