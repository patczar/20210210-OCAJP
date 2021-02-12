package p26_porownywanie.v2_bledny_equals;

import java.util.Objects;

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
	
	// To nie jest "overriding" tylko "overloading".
	// Nie nadpisuję "prawdziwej" metody equals pochodzącej z Object, tylko towrzę nową dodatkową metodę odstepną tylko w klasie Osoba.

	// Ten equals zadziała tylko jeśli bezpośrednio go wywołamy na obiekcie Osoba,
	// ale to nie jest "ten prawdziwy" equals, i Java (np. HashSet) nie będzie brać tej definicji pod uwagę.
	public boolean equals(Osoba inna) {
		return inna != null
				&& Objects.equals(this.imie, inna.imie)
				&& Objects.equals(this.nazwisko, inna.nazwisko)
				&& this.wiek == inna.wiek;
	}
	
	public int hashCode() {
		// to jest niewydajne, ale poprawne i muszę to dopisać, aby "oszukać" hashset
		return 0;
	}
}
