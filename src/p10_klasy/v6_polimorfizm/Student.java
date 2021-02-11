package p10_klasy.v6_polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {
	String kierunek;
	int rok;
	List<Double> oceny = new ArrayList<>();
	
	public Student() {
		
	}

	public Student(String imie, String nazwisko, int wiek, int rok, String kierunek) {
		super(imie, nazwisko, wiek);
		this.rok = rok;
		this.kierunek = kierunek;
	}

    // Podklasa może:
    // 1) w żaden sposób nie zmieniać metody, którą odziedziczyła z nadklasy:
    // przykład: jestPelnoletnia()

    // 2) dodać nowe metody, które nie występowały w nadklasie:

	void dodajOcene(double ocena) {
		oceny.add(ocena);
	}

	double sredniaOcen() {
		return oceny.stream().mapToDouble(x->x).average().orElse(0.0);
	}

    // 3) podklasa może też "nadpisać" ("override") definicję metody, która była obecna w nadklasie
    // wtedy "studenci zachowują się inaczej niż pozostałe osoby"
	@Override
	void przedstawSie() {
		System.out.println("Jestem " + imie + " " + nazwisko + " i studiuję na "+ rok + " roku kierunku " + kierunek +".");
	}

	@Override
	public String toString() {
		return super.toString() + ", student " + rok + " roku kierunku " + kierunek;
	}
}
