package p26_porownywanie.v5_equals_oraz_comparable;

import java.util.Comparator;
import java.util.Objects;

public class Osoba implements Comparable<Osoba> {
	String imie, nazwisko;
	int wiek;
	
	public Osoba(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public int getWiek() {
		return wiek;
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(imie, nazwisko, wiek);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(imie, other.imie) && Objects.equals(nazwisko, other.nazwisko) && wiek == other.wiek;
	}

	@Override
	public int compareTo(Osoba inna) {
		return komparator.compare(this, inna);
	}
	
	private final static Comparator<Osoba> komparator =
			Comparator.comparing(Osoba::getNazwisko)
				.thenComparing(Osoba::getImie)
				.thenComparing(Osoba::getWiek);
}
