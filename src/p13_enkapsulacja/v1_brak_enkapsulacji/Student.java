package p13_enkapsulacja.v1_brak_enkapsulacji;

import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {
	String kierunek;
	int rok;
	double[] oceny = new double[100];
	// Teraz zmiana typu zmiennej, zmiana "wewnętrznej reprezentacji", spowoduje, że inne klasy w projekcie przestaną się kompilować.
	// List<Double> oceny = new ArrayList<>();
	int iloscOcen = 0;
	
	Student() {
		
	}
	
	public Student(String imie, String nazwisko, int wiek, String kierunek, int rok) {
		super(imie, nazwisko, wiek);
		this.kierunek = kierunek;
		this.rok = rok;
	}
	
	void dodajOcene(double ocena) {
		oceny[iloscOcen++] = ocena;
	}

	double sredniaOcen() {
		double suma = 0.0;
		for (int i = 0; i < iloscOcen; i++) {
			suma += oceny[i];
		}
		return suma / iloscOcen;
	}

	void przedstawSie() {
		System.out.println("Hej tu " + imie + " " + nazwisko + ", jestem studentem " + rok + " roku kierunku " + kierunek);
	}
	
}
