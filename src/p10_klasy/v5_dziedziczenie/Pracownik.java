package p10_klasy.v5_dziedziczenie;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pracownik extends Osoba {
	String zawod;
	BigDecimal pensja;

	// tworzenie wielu konstruktorów w tej samej klasie to jest "przeciążanie konstruktorów" / "overloading"
	Pracownik() {
		
	}

	Pracownik(String imie, String nazwisko, int wiek, String zawod, BigDecimal pensja) {
		// wywołanie konstruktora z nadklasy
		super(imie, nazwisko, wiek);
		this.zawod = zawod;
		this.pensja = pensja;
	}

	Pracownik(String imie, String nazwisko, int wiek, String zawod, double pensja) {
		// wywołanie innego konstruktora z tej samej klasy
		this(imie, nazwisko, wiek, zawod, BigDecimal.valueOf(pensja).setScale(2, RoundingMode.HALF_UP));
	}
	
	Pracownik(String imie, String nazwisko, int wiek, String zawod, int pensja) {
		this(imie, nazwisko, wiek, zawod, BigDecimal.valueOf(pensja).setScale(2));
	}

	Pracownik(String imie, String nazwisko, int wiek, String zawod, String pensja) {
		this(imie, nazwisko, wiek, zawod, new BigDecimal(pensja));
	}


}
