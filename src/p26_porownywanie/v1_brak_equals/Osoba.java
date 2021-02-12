package p26_porownywanie.v1_brak_equals;

public class Osoba {
	String imie, nazwisko;
	int wiek;
	
	public Osoba(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}
	
}
