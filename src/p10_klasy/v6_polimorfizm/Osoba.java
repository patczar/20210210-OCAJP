package p10_klasy.v6_polimorfizm;

public class Osoba {
	String imie, nazwisko;
	int wiek;
		
	Osoba() {
		
	}
	
	Osoba(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	void przedstawSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
	}
	
	void urodziny() {
		wiek++;
		System.out.println(imie + " ma dzisiaj urodziny, od teraz ma " + wiek + " lat.");
	}
	
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + " lat)";
	}
	
	boolean jestPelnoletnia() {
		return this.wiek >= 18;
	}
	
}
