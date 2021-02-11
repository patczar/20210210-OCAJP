package p12_klasy_tech.a02_inicjalizacja.v1;

public class A {
	
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

}
