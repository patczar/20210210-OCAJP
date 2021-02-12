package p16_interfejsy.v2;

public class Implementacja2 implements Interfejs {
	@Override // implementacja metody z interfejsu też moze być oznaczona @Override
	public int wartosc() {
		return 1313;
	}

	// istnieje możliwość nadpisania defaultowej metody
	@Override // jak dla klas: opcjonalne, dodatkowe zabezpieczenie
	public String tytul() {
		return "Nowa wartość";
	}
}
