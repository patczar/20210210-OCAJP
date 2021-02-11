package p13_enkapsulacja.v3_po_zmianie;

public class Konto {
	private final int numer;
	private int saldo;
	private Osoba wlasciciel;

	public Konto(int numer, int saldo, Osoba wlasciciel) {
		if(saldo < 0) {
			// gdy wyrzucę wyjątek w konstruktorze, to obiekt nie zostanie utworzony
			throw new IllegalArgumentException("Ujemne saldo");
		}
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
	// Korzyścią z enkapsulacji jest przede wszystkim to, że możemy tak napisać metody w naszej klasie,
	// że zawsze będziemy pilnować pewnych warunków, tzw "niezmienników" (invariants).
	// Tutaj takim niezmiennikiem będzie "saldo nie może być ujemne".
	
	// We wpisywaniu takich "zabezpieczeń" bardzo pomagają wyjątki.
	
	public void wplata(int kwota) {
		if(kwota <= 0) {
			throw new IllegalArgumentException("Ujemna kwota wplata");
		}
		saldo += kwota;
	}
	
	public void wyplata(int kwota) throws BrakSrodkow {
		if(kwota <= 0) {
			throw new IllegalArgumentException("Ujemna kwota wyplata");
		}
		if(kwota > saldo) {
			throw new BrakSrodkow("Niewystarczające środki na koncie nr " + numer);
		}
		saldo -= kwota;
	}

	public void przelew(int kwota, Konto kontoDocelowe) throws BrakSrodkow {
		if(kwota <= 0) {
			throw new IllegalArgumentException("Niedodatnia kwota w: przelew");
		}
		if(kwota > saldo) {
			throw new BrakSrodkow("Zbyt mało pieniędzy na koncie przy próbie przelewu");
		}
		
		kontoDocelowe.saldo += kwota;
		this.saldo -= kwota;
	}	
}
