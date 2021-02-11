package p12_klasy_tech.a04_widocznosc.inny_pakiet;

import p12_klasy_tech.a04_widocznosc.Klasa;

public class KlasaWInnymPakiecie {
	public void metoda2(Klasa inny) {
		//NK System.out.println(inny.prywatne);
		//NK System.out.println(inny.domyslne);
		//NK System.out.println(inny.chronione);
		System.out.println(inny.publiczne);
	}
	
	public static void main(String[] args) {
		Klasa obiekt = new Klasa();
		//NK System.out.println(obiekt.prywatne);
		//NK System.out.println(obiekt.domyslne);
		//NK System.out.println(obiekt.chronione);
		System.out.println(obiekt.publiczne);
	}

}
