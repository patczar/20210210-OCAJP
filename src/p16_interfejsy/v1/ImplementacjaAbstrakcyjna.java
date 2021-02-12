package p16_interfejsy.v1;

public abstract class ImplementacjaAbstrakcyjna implements Interfejs {

	// Klasa abstrakcyjna nie musi implementować wszystkich metod z interfejsu
	
	// Ale jeśli implementuje albo deklaruje bez implementacji jakąś metodę z interfejsu,
	// musi zachować zgodność z interfejsem

	// Przykładowo ta deklaracja ma typ wynikowy niezgodny z interfejsem
	//NK public abstract String oblicz(double arg1, double arg2);
	
	// ale jeśli nie zaimplementuję tej metody, to klasa się skompiluje, bo jest abstrakcyjna
	
	public abstract void wypisz();
	
	
	public void mojaMetoda() {
		System.out.println("jeste klasą abstrakcyjną");
	}
	
	protected abstract int abstrakcyjna();
	
	public void p() {
		System.out.println("papapa");
	}
	

}
