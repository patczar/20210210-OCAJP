package p24_napisy;

import java.util.Objects;

public class Porownywanie {

	public static void main(String[] args) {
		String ala = "Ala";
		final String final_ala = "Ala";
		
		String a = "Ala ma kota";
		String b = "Ala ma kota";
		String c = "Ala" + " ma kota";
		String d = final_ala + " ma kota";
		String e = InnaKlasa.dajStringaZKodu();
		
		String f = new String(a);
		String g = ala + " ma kota";
		// tak samo jest dla danych wczytywanych z zewnętrznych źródeł: konsola, plik, baza danych
		
		System.out.println("==");
		System.out.println(a == "Ala ma kota");
		System.out.println(a == a);
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(a == e);
		System.out.println(a == f);
		System.out.println(a == g);
		System.out.println();
		
		System.out.println("intern");
		// intern zwraca referencję do stringa o takiej samej treści, ale pochodzącego z puli stringów
		// jeśli w puli jeszcze go nie było, to dodawany
		System.out.println(a.intern() == f.intern());
		System.out.println();
		
		System.out.println("equals");
		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(a.equals(f));
		System.out.println(a.equals(g));
		System.out.println("Ala ma kota".equals(g));
		System.out.println(Objects.equals(a, g));
	}

}
