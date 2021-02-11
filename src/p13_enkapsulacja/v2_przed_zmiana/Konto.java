package p13_enkapsulacja.v2_przed_zmiana;

public class Konto {
	private int numer;
	private int saldo;
	private Osoba wlasciciel;

	public Konto(int numer, int saldo, Osoba wlasciciel) {
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}

	public int getNumer() {
		return numer;
	}

	public int getSaldo() {
		return saldo;
	}

	public Osoba getWlasciciel() {
		return wlasciciel;
	}

	public void setWlasciciel(Osoba wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

	public String toString() {
		return "Konto nr " + numer + ", saldo: " + saldo + ", wł: " + wlasciciel;
	}
	
	// Jedynymi sposobami modyfikacji salda są metody wplata i wyplata.
	// Żadna inna klasa w projekcie, choćby było 1000 klas, nie modyfikuje salda z pominięciem tych metod.
	
	// na razie bez zabezpieczeń
	public void wplata(int kwota) {
		saldo += kwota;
	}
	
	public void wyplata(int kwota) {
		saldo -= kwota;
	}
	
	
}
