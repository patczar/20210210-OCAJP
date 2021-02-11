package p10_klasy.v6_polimorfizm;

import java.math.BigDecimal;

public class Pracownik extends Osoba {
	String zawod;
	BigDecimal pensja;

	Pracownik() {
		
	}

	Pracownik(String imie, String nazwisko, int wiek, String zawod, BigDecimal pensja) {
		super(imie, nazwisko, wiek);
		this.zawod = zawod;
		this.pensja = pensja;
	}

	Pracownik(String imie, String nazwisko, int wiek, String zawod, double pensja) {
		// wywołanie innego konstruktora z tej samej klasy
		this(imie, nazwisko, wiek, zawod, BigDecimal.valueOf(pensja).setScale(2));
	}
	
	Pracownik(String imie, String nazwisko, int wiek, String zawod, int pensja) {
		// wywołanie innego konstruktora z tej samej klasy
		this(imie, nazwisko, wiek, zawod, BigDecimal.valueOf(pensja).setScale(2));
	}

	Pracownik(String imie, String nazwisko, int wiek, String zawod, String pensja) {
		// wywołanie innego konstruktora z tej samej klasy
		this(imie, nazwisko, wiek, zawod, new BigDecimal(pensja));
	}

	// tworzenie wielu konstruktorów w tej samej klasie to jest "przeciążanie konstruktorów" / "overloading"
	
	@Override
	void przedstawSie() {
		System.out.println("Hej tu "+ imie + ", pracuję jako " + zawod + " i zarabiam " + pensja +" zł.");
	}
}
