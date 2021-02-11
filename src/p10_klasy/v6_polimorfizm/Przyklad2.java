package p10_klasy.v6_polimorfizm;

public class Przyklad2 {

	public static void main(String[] args) {
		Osoba a = new Osoba();
		Osoba b = new Osoba();
		Osoba c = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();

		System.out.println(a.imie + " " + a.nazwisko + " ma " + a.wiek + " lat");
		a.przedstawSie();
		System.out.println();
		
		a.imie = "Ala";
		a.nazwisko = "Kowalska";
		a.wiek = 30;
		
		b.imie = "Ola";
		b.nazwisko = "Malinowska";
		b.wiek = 40;
		
		System.out.println(a.imie + " " + a.nazwisko + " ma " + a.wiek + " lat");
		System.out.println(b.imie + " " + b.nazwisko + " ma " + b.wiek + " lat");
		System.out.println(c.imie + " " + c.nazwisko + " ma " + c.wiek + " lat");
		System.out.println();
		
		a.przedstawSie();
		b.przedstawSie();
		System.out.println();
		
		b.urodziny();
		a.przedstawSie();
		b.przedstawSie();
		
	}

}
