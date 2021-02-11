package p13_enkapsulacja.v1_brak_enkapsulacji;

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
		return "Konto nr " + numer + ", saldo: " + saldo + ", wł: " + wlasciciel;
	}

	// Brak kontroli nad tym co się dzieje z saldem.
	// Da się ustawić niepoprawne saldo.
	// Gdybym zapragnął dodać rejestrowanie historii zmiana, nie byłbym w stanie zapanować nad wszystkimi odwołaniami do zmiennej saldo.
}
