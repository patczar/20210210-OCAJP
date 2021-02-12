package p26_porownywanie.v5_equals_oraz_comparable;

import java.util.Objects;

public class Porownywanie {
	
	// Jeśli w klasie nie zdefiniujemy metody equals, to używana jest domyślna implementacja pochodząca z klasy Object,
	// która porównuje adresy (działa jak ==).

	public static void main(String[] args) {
		Osoba a = new Osoba("Ala", "Kowalska", 20);
		Osoba r = a;
		Osoba b = new Osoba("Ala", "Kowalska", 20);
		Osoba c = new Osoba("Ola", "Kowalska", 30);
		
		// == sprawdza cz yto jest ten sam adres
		System.out.println("a == a " + (a == a));
		System.out.println("a == r " + (a == r));
		System.out.println("a == b " + (a == b));
		System.out.println("a == c " + (a == c));
		System.out.println();
		
		System.out.println("a.equals(a) " + (a.equals(a)));
		System.out.println("a.equals(r) " + (a.equals(r)));
		System.out.println("a.equals(b) " + (a.equals(b)));
		System.out.println("a.equals(c) " + (a.equals(c)));
		System.out.println();

		System.out.println("Obj a a  " + Objects.equals(a, a));
		System.out.println("Obj a r  " + Objects.equals(a, r));
		System.out.println("Obj a b  " + Objects.equals(a, b));
		System.out.println("Obj a c  " + Objects.equals(a, c));
		System.out.println();
		
	}

}
