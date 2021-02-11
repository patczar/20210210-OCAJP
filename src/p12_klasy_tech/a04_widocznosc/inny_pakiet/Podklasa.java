package p12_klasy_tech.a04_widocznosc.inny_pakiet;

import p12_klasy_tech.a04_widocznosc.Klasa;

public class Podklasa extends Klasa {

	public void metoda() {
		//NK System.out.println(prywatne);
		//NK System.out.println(this.prywatne);
		//NK System.out.println(domyslne);
		System.out.println(chronione);
		System.out.println(this.chronione);
		System.out.println(publiczne);		
		
		//NK ((Klasa)this).chronione = 44;
		((Klasa)this).publiczne = 45;
	}
	
	public void metoda2(Klasa inny) {
		//NK System.out.println(inny.prywatne);
		//NK System.out.println(inny.domyslne);
		//NK System.out.println(inny.chronione);
		System.out.println(inny.publiczne);

		// Gdyby Osoba miała pole protected pesel, to:
		// Osoba ma dostęp do peselu innej osoby
		// Student ma dostęp do peselu innego studenta
		// Student nie ma dostępu do peselu osoby
	}

	public void metoda3(Podklasa inny) {
		//NK System.out.println(inny.prywatne);
		//NK System.out.println(inny.domyslne);
		System.out.println(inny.chronione);
		System.out.println(inny.publiczne);
	}

	public static void main(String[] args) {
		Klasa obiekt = new Klasa();
		//NK System.out.println(obiekt.prywatne);
		//NK System.out.println(obiekt.domyslne);
		//NK System.out.println(obiekt.chronione);
		System.out.println(obiekt.publiczne);

		Podklasa obiekt2 = new Podklasa();
		//NK System.out.println(obiekt2.prywatne);
		//NK System.out.println(obiekt2.domyslne);
		System.out.println(obiekt2.chronione);
		System.out.println(obiekt2.publiczne);

		Klasa obiekt3 = new Podklasa();
		//NK System.out.println(obiekt3.prywatne);
		//NK System.out.println(obiekt3.domyslne);
		//NK System.out.println(obiekt3.chronione);
		System.out.println(obiekt3.publiczne);
	}
}
