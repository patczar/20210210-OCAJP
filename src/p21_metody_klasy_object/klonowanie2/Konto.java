package p21_metody_klasy_object.klonowanie2;

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
	
	/* W tej wersji korzystam z domyślnej implementacji clone()
	 * upubliczniając ją i dostosowując do łatwiego używania (zmiana typu, bez deklarowanego wyjątku).
	 * Domyślnie tworzy to płytką kopię.
	 * Wg mnie wygląda to paskudnie.
	 */
	@Override
	public Konto clone() {
		try {
			return (Konto)super.clone();
		} catch (CloneNotSupportedException e) {
			// should never happen
			throw new RuntimeException(e);
		}
	}
}
