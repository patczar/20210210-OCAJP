package p13_enkapsulacja.v3_po_zmianie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {
	private String kierunek;
	private int rok;
	
	// Teraz, skoro szczegóły implementacji są prywatne, mogę bez obaw zmienić "wewnętrzną reprezentację"
    // np. zamiast tablicy użyć listy - jeśli poprawię wszystkie metody publiczne, to inne klasy nie zauważą zmiany.
	private List<Double> oceny = new ArrayList<>();
	
	public Student() {
		
	}
	
	public Student(String imie, String nazwisko, LocalDate dataUrodzenia, String kierunek, int rok) {
		super(imie, nazwisko, dataUrodzenia);
		this.kierunek = kierunek;
		this.rok = rok;
	}
	
	public String getKierunek() {
		return kierunek;
	}

	public void setKierunek(String kierunek) {
		this.kierunek = kierunek;
	}

	public int getRok() {
		return rok;
	}

	public void setRok(int rok) {
		this.rok = rok;
	}

	public void dodajOcene(double ocena) {
		oceny.add(ocena);
	}

	public double sredniaOcen() {
		return oceny.stream().mapToDouble(x->x).average().orElse(0.0);
	}

	public void przedstawSie() {
		System.out.println("Hej tu " + getImie() + " " + getNazwisko() + ", jestem studentem " + rok + " roku kierunku " + kierunek);
	}
	
}
