package p16_interfejsy.v1;

public class PodklasaAbstrakcyjnej extends ImplementacjaAbstrakcyjna {
	// Konkretna klasa rozszerzająca abstrakcyjną musi zaimplementować
	// wszystkie metody wprowadzone nie tylko przez tę klasę, ale także przez interfejs.

	public double oblicz(double arg1, double arg2) {
		return 0;
	}


	public void wypisz() {
		
	}

	protected int abstrakcyjna() {
		return 13;
	}
	
}
