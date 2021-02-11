package p12_klasy_tech.a02_inicjalizacja.v2;

public class A {
	
	static {
		// to jest "blok inicjalizacyjny statyczny"
		// wykonuje się gdy klasa po raz pierwszy jest potrzebna i jest ładowana do pamięci
		System.out.println("static A 1");
	}
	
	{
		// to jest "blok inicjalizacyjny"
		// wykonuje się podczas tworzenia każdego obiektu, przed konstruktorem
		System.out.println("init A 1");
	}
	
	A() {
		System.out.println("A()");
	}
	
	{
		// jeśli jest wiele bloków, to wykonują się w kolejności w jakiej zostały wpisane, ale przed konstruktorem
		System.out.println("init A 2");
	}

	static {
		System.out.println("static A 2");
	}

	
}
