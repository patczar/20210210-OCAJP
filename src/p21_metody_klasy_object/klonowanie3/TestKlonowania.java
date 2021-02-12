package p21_metody_klasy_object.klonowanie3;

public class TestKlonowania {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", "2001-02-03");
		Konto konto = new Konto(1, 1000, ala);
		Konto klon = konto.clone();
		
		System.out.println("oryginał: " + konto);
		System.out.println("klon    : " + klon);
		System.out.println();
		
		klon.wplata(300);
		klon.wlasciciel.imie = "Alicja";

		System.out.println("oryginał: " + konto);
		System.out.println("klon    : " + klon);
		System.out.println();
	}

}
