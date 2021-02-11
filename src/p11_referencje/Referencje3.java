package p11_referencje;

public class Referencje3 {

	static void metoda(Konto a, Konto b, Konto c, int x) {
		System.out.println("Początek metody");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
		System.out.println();
		
		x += 55;
		b.wplata(44);
		a = new Konto(a.numer, a.saldo, a.wlasciciel);
		// a.wplata(33);
		// a.saldo += 33;
		a.saldo = 1033;
		a.wlasciciel.imie = "Alicja";
		
		
		System.out.println("Koniec metody");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
		System.out.println();
	}

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", 30);
		Osoba ola = new Osoba("Ola", "Malinowska", 20);

		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(2, 2000, ola);
		Konto c = b;
		int x = 5000;
		
		System.out.println("Początek programu");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
		System.out.println();
		
		metoda(a, b, c, x);
		
		System.out.println("Z powrotem w main");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("x: " + x);
	}

}
