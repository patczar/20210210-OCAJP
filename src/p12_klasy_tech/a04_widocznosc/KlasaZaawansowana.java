package p12_klasy_tech.a04_widocznosc;

public class KlasaZaawansowana {
	private int prywatne = 1;
	int domyslne = 2;
	protected int chronione = 3;
	public int publiczne = 4;

	public void metoda() {
		System.out.println(this.prywatne);
		System.out.println(prywatne);
		System.out.println(domyslne);
		System.out.println(chronione);
		System.out.println(publiczne);

//OK Nested1 zagn = this.new Nested1();
		Nested1 zagn = new Nested1();
	}

	public void metoda2(KlasaZaawansowana inny) {
		System.out.println(inny.prywatne);
		System.out.println(inny.domyslne);
		System.out.println(inny.chronione);
		System.out.println(inny.publiczne);
		inny.prywatne = 101;
	}

	public static void main(String[] args) {
//NK System.out.println(prywatne);
//NK System.out.println(publiczne);

		KlasaZaawansowana obiekt = new KlasaZaawansowana();
		System.out.println(obiekt.prywatne);
		System.out.println(obiekt.domyslne);
		System.out.println(obiekt.chronione);
		System.out.println(obiekt.publiczne);

		obiekt.metoda();
		KlasaZaawansowana innyObiekt = new KlasaZaawansowana();
		innyObiekt.prywatne = 19;
		obiekt.metoda2(innyObiekt);
		System.out.println(innyObiekt.prywatne);

		Nested1 zagniezdzony = obiekt.new Nested1();
		zagniezdzony.metodaX();

		Nested1 zagniezdzony1 = new KlasaZaawansowana().new Nested1();
		zagniezdzony1.metodaX();

		Nested2 zagniezdzony2 = new Nested2();
		zagniezdzony2.metodaX();
	}

	class Nested1 {
// klasa zagnieżdżona instancyjna
		public void metodaX() {
			System.out.println(prywatne);
			System.out.println(domyslne);
			System.out.println(chronione);
			System.out.println(publiczne);
		}
	}

	static class Nested2 {
// klasa zagnieżdżona statyczna
		public void metodaX() {
			// bo nie jestesmy w zadnym obiekcie = jestesmy w kontekscie statycznym
			// NK System.out.println(prywatne);
			// NK System.out.println(domyslne);
			// NK System.out.println(chronione);
			// NK System.out.println(publiczne);
		}

		public void metodaY(KlasaZaawansowana inny) {
			System.out.println(inny.prywatne);
			System.out.println(inny.domyslne);
			System.out.println(inny.chronione);
			System.out.println(inny.publiczne);
		}
	}

}
