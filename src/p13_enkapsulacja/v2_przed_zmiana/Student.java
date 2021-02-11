package p13_enkapsulacja.v2_przed_zmiana;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Osoba {
	private String kierunek;
	private int rok;
	
	// Ukrywamy szczegóły implementacji - klient nie musi wiedzieć, w jaki sposób przechowujemy oceny studenta ("to nasza prywatna sprawa")
	// Żadna inna klasa nie może odwoływać się bezpośrednio do tej tablicy.
	private double[] oceny = new double[100];
	private int iloscOcen = 0;
	
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
		if(iloscOcen == oceny.length) {
			oceny = Arrays.copyOf(oceny, oceny.length*2); // mniej więcej coś takiego robi ArrayList
		}
		oceny[iloscOcen++] = ocena;
	}

	public double sredniaOcen() {
		double suma = 0.0;
		for (int i = 0; i < iloscOcen; i++) {
			suma += oceny[i];
		}
		return suma / iloscOcen;
	}

	public void przedstawSie() {
		System.out.println("Hej tu " + getImie() + " " + getNazwisko() + ", jestem studentem " + rok + " roku kierunku " + kierunek);
	}
	
}
