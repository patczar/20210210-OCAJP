package p26_porownywanie.v4_equals_generowany;

public class HaszKody {

	public static void main(String[] args) {
		Osoba a = new Osoba("Ala", "Kowalska", 20);
		Osoba r = a;
		Osoba b = new Osoba("Ala", "Kowalska", 20);
		Osoba c = new Osoba("Ola", "Kowalska", 30);
		
		// Jeśli w klasie nie nadpiszemy metody hashCode, to działa domyślna implementacja
		// wyliczająca hashcode na podstawie adresu.
		// Daje to efekt, że haszkody różnych obiektów są różne.
		// Dopóki nie tworzymy miliardów obiektów, to hashcody będą unikalne.
		System.out.println("hasz a " + a.hashCode());
		System.out.println("hasz r " + r.hashCode());
		System.out.println("hasz b " + b.hashCode());
		System.out.println("hasz c " + c.hashCode());
	}

}
