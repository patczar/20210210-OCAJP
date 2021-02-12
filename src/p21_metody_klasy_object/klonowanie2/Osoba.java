package p21_metody_klasy_object.klonowanie2;

import java.time.LocalDate;
import java.time.Period;

public class Osoba implements Cloneable {
	// zmienne przechowywane w obiektach: pola (field), atrybuty (attribute), zmienne instancyjne (instance variable)
	String imie, nazwisko;
	LocalDate dataUrodzenia;
	
	Osoba() {
	}

	Osoba(String imie, String nazwisko, LocalDate data) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		dataUrodzenia = data;
	}
	
	Osoba(String imie, String nazwisko, String data) {
		this(imie, nazwisko, LocalDate.parse(data));
	}

	
	// metody - operacje, które "potrafi" wykonać obiekt
	
	void przedstawSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + getWiek() + " lat.");
		
	}
	
	public String toString() {
		return imie + " " + nazwisko + " ur." + dataUrodzenia;
	}
	
	public int getWiek() {
		if(dataUrodzenia == null) {
			return -1;
		}
		Period czasZycia = Period.between(dataUrodzenia, LocalDate.now());
		return czasZycia.getYears();
	}
	
	@Override
	public Osoba clone() {
		try {
			return (Osoba) super.clone();
		} catch (CloneNotSupportedException e) {
			// should never happen
			throw new RuntimeException(e);
		}
	}
}
