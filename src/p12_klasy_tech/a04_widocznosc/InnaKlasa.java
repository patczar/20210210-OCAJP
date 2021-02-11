package p12_klasy_tech.a04_widocznosc;

public class InnaKlasa {
	public void metoda2(Klasa inny) {
		//NK System.out.println(inny.prywatne);
		System.out.println(inny.domyslne);
		System.out.println(inny.chronione);
		System.out.println(inny.publiczne);		
	}
	
	public static void main(String[] args) {
		Klasa obiekt = new Klasa();
		//NK System.out.println(obiekt.prywatne);
		System.out.println(obiekt.domyslne);
		System.out.println(obiekt.chronione);
		System.out.println(obiekt.publiczne);
	}
}
