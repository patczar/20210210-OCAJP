package p12_klasy_tech.a04_widocznosc;

public class Klasa {
	private    int prywatne = 1;
	           int domyslne = 2;
	protected  int chronione = 3;
	public     int publiczne = 4;

	public void metoda() {
		System.out.println(this.prywatne);
		System.out.println(prywatne);
		System.out.println(domyslne);
		System.out.println(chronione);
		System.out.println(publiczne);		
	}

	public void metoda2(Klasa inny) {
		System.out.println(inny.prywatne);
		System.out.println(inny.domyslne);
		System.out.println(inny.chronione);
		System.out.println(inny.publiczne);		
		inny.prywatne = 101;
	}

	public static void main(String[] args) {
		// Tutaj nie ma dostępu, bo jesteśmy w kontekście statycznym - poziomy widoczności nie mają nic do rzeczy.
        //NK System.out.println(prywatne);
        //NK System.out.println(publiczne);
            
		Klasa obiekt = new Klasa();
		System.out.println(obiekt.prywatne);
		System.out.println(obiekt.domyslne);
		System.out.println(obiekt.chronione);
		System.out.println(obiekt.publiczne);
		
		obiekt.metoda();
		Klasa innyObiekt = new Klasa();
		innyObiekt.prywatne = 19;
		obiekt.metoda2(innyObiekt);
		System.out.println(innyObiekt.prywatne);
	}
}

