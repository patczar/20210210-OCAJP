package p12_klasy_tech.a02_inicjalizacja.v3;

public class B extends A {
	static {
		System.out.println("static B");
	}

	public B() {
		// System.out.println("Konstruktor B()");
		this(44);
		System.out.println("Konstruktor B()");
		
		// wywołanie this() albo super() (jeśli jest jawnie wpisane) musi być pierwszą instrukcją konstruktora
		// a jeśli nie ma jawnego wywołania, to niejawnie wywoływane jest super() bez parametrów
	}

	{
		System.out.println("init B 1");
	}
	
	public B(int arg) {
		super();
		// < w tym momencie wykonają się init B
		System.out.println("Konstruktor B(" + arg + ")");
	}

	{
		System.out.println("init B 2");
	}

}
