package p11_referencje;

public class Referencje2 {


	static void metoda(Konto a, Konto b, int x) {
		System.out.println("Początek metody");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
		System.out.println();
		
		// zmiana wartości typu prostego zawsze jest lokalna; w main nadal bedzie 5000
		x += 55;
//
//		// zmiana wewnątrz obiektu jest widoczna dla innych (innych metod, innych wątków...)
//		// w maina na końcu będzie 1024
		a.wplata(24); // alternatywnie a.saldo += 24
//
//		// Zmiana samej zmiennej typu obiektowego (wpisanie wskaźnika do innego obiektu)
//		// jest lokalna. Inne metody / wątki tego nie zauważą.
//		// main w zmiennej b nadal będzie widział Konto nr 2 z saldem 2000.
		b = a;
		b.saldo += 1;

		System.out.println("Koniec metody");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
		System.out.println();
	}

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", 30);
		Osoba ola = new Osoba("Ola", "Malinowska", 20);

		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(2, 2000, ola);
		int x = 5000;
		
		System.out.println("Początek programu");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
		System.out.println();
		
		metoda(a, b, x);
		
		System.out.println("Z powrotem w main");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("x: " + x);
	}

}
