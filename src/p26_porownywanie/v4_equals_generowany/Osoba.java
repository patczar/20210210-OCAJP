package p26_porownywanie.v4_equals_generowany;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		result = prime * result + wiek;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		// lepiej tak sprawdzać klasę niż za pomocą instanceof
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		if (wiek != other.wiek)
			return false;
		return true;
	}
	
	
}
