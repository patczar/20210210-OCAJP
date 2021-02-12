package p26_porownywanie.v1_brak_equals;

import java.util.HashSet;
import java.util.Set;

public class ZbiorHaszowy {

	public static void main(String[] args) {
		Osoba a = new Osoba("Ala", "Kowalska", 20);
		Osoba r = a;
		Osoba b = new Osoba("Ala", "Kowalska", 20);
		Osoba c = new Osoba("Ola", "Kowalska", 30);
		
		// HashSet oraz HashMap w działaniu korzystają z metod hashCode i equals.
		
		// 1) patrzy jaki jest hashcode i jeśli różny, to traktuje jak różne obiekty
		// 2) jeśli hc jest równy, to wtedy porówuje za pomocą equals
		
		boolean wynik; // wynik operacji add: jeśli element został dodany to true, a jeśli nie to false
		
		Set<Osoba> zbior = new HashSet<>();
		wynik = zbior.add(a);
		System.out.println("a " + wynik);
		wynik = zbior.add(r);
		System.out.println("r " + wynik);
		wynik = zbior.add(b);
		System.out.println("b " + wynik);
		wynik = zbior.add(c);
		System.out.println("c " + wynik);
		System.out.println();
		
		System.out.println("Ilość elementów: " + zbior.size());
		for (Osoba osoba : zbior) {
			System.out.println(osoba);
		}
	}

}
