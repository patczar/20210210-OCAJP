package p26_porownywanie.v2_bledny_equals;

import java.util.Set;
import java.util.TreeSet;

public class ZbiorDrzewowy {

	public static void main(String[] args) {
		Osoba a = new Osoba("Ala", "Kowalska", 20);
		Osoba r = a;
		Osoba b = new Osoba("Ala", "Kowalska", 20);
		Osoba c = new Osoba("Ola", "Kowalska", 30);
		
		// TreeSet oraz TreeMap w działaniu korzystają z metody compareTo (ewentualnie z komparatora).
		
		// Ten program kończy sie błedem, bo Osoba nie jest Comparable
		
		boolean wynik;
		
		Set<Osoba> zbior = new TreeSet<>();
		wynik = zbior.add(a);
		System.out.println("a " + wynik);
		wynik = zbior.add(r);
		System.out.println("r " + wynik);
		wynik = zbior.add(b);
		System.out.println("b " + wynik);
		wynik = zbior.add(c);
		System.out.println("c " + wynik);
		System.out.println();
		
		System.out.println("Ilośc elementów: " + zbior.size());
		for (Osoba osoba : zbior) {
			System.out.println(osoba);
		}
	}

}
