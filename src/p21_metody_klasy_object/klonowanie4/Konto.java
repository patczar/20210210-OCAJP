package p21_metody_klasy_object.klonowanie4;

public class Konto implements Cloneable {
	final int numer;
	int saldo;
	Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}

	@Override
	public String toString() {
		return "Konto nr " + numer + ", " + saldo + ", wł." + wlasciciel;
	}
	
	void wplata(int kwota) {
		saldo += kwota;
	}
	
	void wyplata(int kwota) {
		saldo -= kwota;
	}
	
	static void przelew(Konto nadawca, Konto odbiorca, int kwota) {
		nadawca.saldo -= kwota;
		odbiorca.saldo += kwota;
	}
	
	void przelew(Konto odbiorca, int kwota) {
		this.saldo -= kwota;
		odbiorca.saldo += kwota;
	}
	
	/* W tej wersji tworzę własną implementację clone() za pomocą konstruktora.
	 * Wg mnie wygląda to znacznie lepiej.
	 * W tej wersji od razu głęboka kopia.
	 */
	@Override
	public Konto clone() {
		return new Konto(this.numer, this.saldo, this.wlasciciel.clone());
	}
}
