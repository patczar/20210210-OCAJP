package p13_enkapsulacja.v3_po_zmianie;

import java.time.LocalDate;
import java.time.Period;

public class Osoba {
	private String imie, nazwisko;
	private LocalDate dataUrodzenia;
	
	public Osoba() {
	}
	
	public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.setDataUrodzenia(dataUrodzenia);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	public LocalDate getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(LocalDate dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	
	public int getWiek() {
		Period period = Period.between(dataUrodzenia, LocalDate.now());
		return period.getYears();
	}

	public void przedstawSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + getWiek() + " lat.");
	}
	
	public String toString() {
		return imie + " " + nazwisko + " (" + getWiek() + " lat)";
	}
	
	public boolean jestPelnoletnia() {
		return getWiek() >= 18;
	}
	
}
