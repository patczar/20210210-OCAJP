package p12_klasy_tech.a02_inicjalizacja.v4;

public class Static {

	static {
		System.out.println("static 1");
//		System.out.println(" w static 1 x == " + x); // źle, bo zmienna jest dalej
	}
	
	{ // blok inicjalizacyjny obiektu może odwołać się do zmiennych statycznych
		System.out.println(x);
	}
	
	static int x = Utils.przypisz(33);

	static {
		System.out.println("static 2");
		System.out.println(" w static 2 x == " + x); // OK, bo zmienna była wcześniej
	}

	
}
