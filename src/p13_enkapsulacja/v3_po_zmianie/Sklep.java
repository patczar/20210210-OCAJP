package p13_enkapsulacja.v3_po_zmianie;

public class Sklep {

	public void sprzedajPiwo(Osoba klient) {
		if(klient.jestPelnoletnia()) {
			System.out.println("Osoba " + klient.getImie() + " " + klient.getNazwisko() + " kupuje piwo.");
		} else {
			System.out.println("Niepełnoletnia " + klient.getImie() + " nie może kupić piwa");
		}
	}
	
}
