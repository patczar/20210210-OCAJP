package p11_referencje.tutor;

// Od tego miejsca (bez pakietu) skopiujcie to do
// http://pythontutor.com/visualize.html

class Osoba {
	String imie, nazwisko;
	int wiek;
	Osoba() {
	}
    
	Osoba(String imie, String nazwisko, int wiek) {
    	this.imie = imie;
    	this.nazwisko = nazwisko;
    	this.wiek = wiek;
	}

	public String toString() {
    	return imie + " " + nazwisko + " (" + wiek + " l)";
	}
}

class Konto {
	int numer;
	int saldo;
	Osoba wlasciciel;
    
	public Konto(int numer, int saldo, Osoba wlasciciel) {
    	this.numer = numer;
    	this.saldo = saldo;
    	this.wlasciciel = wlasciciel;
	}
    
	@Override
	public String toString() {
    	return "Konto nr " + numer + ", " + saldo + " PLN, wł. " + wlasciciel;
	}
    
	void wplata(int kwota) {
    	saldo += kwota;
	}
}

public class Referencje2_Wersja_Tutor {
    
	static void metoda(Konto a, Konto b, Konto c, int x) {
    	x += 14;
    	b.wplata(24);
   	 
    	a = new Konto(b.numer, b.saldo, b.wlasciciel);
    	a.saldo += 77;
    	a.wlasciciel.imie = "Alicja";
	}

	public static void main(String[] args) {
    	Osoba ala = new Osoba("Ala", "Kowalska", 30);
    	Osoba ola = new Osoba("Ola", "Malinowska", 25);
   	 
    	Konto a = new Konto(1, 1000, ala);
    	Konto b = new Konto(2, 2000, ola);
    	Konto c = b;
    	int x = 5000;
   	 
    	metoda(a, b, c, x);
   	 
    	b = null;
    	a = b;
	}
}


