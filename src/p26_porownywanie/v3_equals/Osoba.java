package p26_porownywanie.v3_equals;

import java.util.Objects;

public class Osoba {
	String imie, nazwisko;
	int wiek;
	
	public Osoba(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj == null || ! (obj instanceof Osoba)) {
			return false;
		}
		Osoba inna = (Osoba)obj;
		
		return Objects.equals(this.imie, inna.imie)
				&& Objects.equals(this.nazwisko, inna.nazwisko)
				&& this.wiek == inna.wiek;
	}
	
	// Formalnym wymaganiem wobec hashCode jest:
	// jeśli dwa obiekty są równe (equals), to hashcode'y muszą być równe
	
	// Natomiast dla zwiększenia wydajności jeśli obiekty są różne,
	// to z dużym pradopodobieństwem hashcody powinny być różne.
	public int hashCode() {
		return 0;
	}
}
