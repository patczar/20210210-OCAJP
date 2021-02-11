package p12_klasy_tech.a01_dziedziczenie.przeslanianie;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		A[] razem = {a, b};
		
		System.out.println("A a");
		System.out.println(a.zmienna_statyczna);
		System.out.println(a.zmienna_instancyjna);
		System.out.println(a.metoda_statyczna());
		System.out.println(a.metoda_instancyjna());
		System.out.println();
		a.wypiszA();
		System.out.println();

		System.out.println("B b");
		System.out.println(b.zmienna_statyczna);
		System.out.println(b.zmienna_instancyjna);
		System.out.println(b.metoda_statyczna());
		System.out.println(b.metoda_instancyjna());
		System.out.println();
		b.wypiszA();
		b.wypiszB();
		System.out.println();

		for(A e : razem) {
			System.out.println("element typu " + e.getClass());
			System.out.println(e.zmienna_statyczna);
			System.out.println(e.zmienna_instancyjna);
			System.out.println(e.metoda_statyczna());
			System.out.println(e.metoda_instancyjna());
			System.out.println();
		}
		
		// Nadpisywanie (overriding) działa tylko dla metod instancyjnych.
		// W przypadku zmiennych  instancyjnych i statycznych oraz oraz metod statycznych
		// mamy do czynienia z "przesłanianiem".
		
		// Poza tym odwołania do rzeczy statycznych poprzez obiekt są tłumaczone w czasie kompilacji na odwołania do klas.
		System.out.println(A.metoda_statyczna());
		System.out.println(B.metoda_statyczna());
	}

}
