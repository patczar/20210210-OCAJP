package p10_klasy.v5_dziedziczenie;

public class StudentJakoKopia_TylkoTlumaczenie {
	String imie, nazwisko;
	int wiek;

	
	void przestawSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko + " i mam " + wiek + " lat.");
	}
	
	void postarzejSie() {
		wiek++;
		System.out.println("Osoba " +imie + " ma urodziny, od dzisiaj ma " + wiek + " lat.");
	}
	
	boolean czyJestPelnoletnia() {
		return wiek >= 18;
	}
	
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + " lat)";
	}

	
	int rok;
	String kierunek;
	
	
	double sredniaOcen() {
		return 4.5;
	}

}
