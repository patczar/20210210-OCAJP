package p13_enkapsulacja.v2_przed_zmiana;

public class Sklep {

	public void sprzedajPiwo(Osoba klient) {
		if(klient.jestPelnoletnia()) {
			System.out.println("Osoba " + klient.getImie() + " " + klient.getNazwisko() + " kupuje piwo.");
		} else {
			System.out.println("Niepełnoletnia " + klient.getImie() + " nie może kupić piwa");
		}
	}
	
}
