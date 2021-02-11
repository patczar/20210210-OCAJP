package p10_klasy.v6_polimorfizm;

public class Konto {
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
		return "Konto nr " + numer + ", " + saldo + " PLN, wł.: " + wlasciciel;
	}

	void wplata(int kwota) {
		saldo += kwota;
	}

	void wyplata(int kwota) {
		saldo -= kwota;
	}
	
	
}
