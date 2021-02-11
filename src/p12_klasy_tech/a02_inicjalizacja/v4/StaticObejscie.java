package p12_klasy_tech.a02_inicjalizacja.v4;

public class StaticObejscie {
	
	static {
		System.out.println("static 1");
		// System.out.println(" w static 1 x == " + x);
		System.out.println(" w static 1 x == " + getX()); // tu jest 0
	}
	
	final static int x = Utils.przypisz(33);

	static {
		System.out.println("static 2");
		System.out.println(" w static 2 x == " + getX()); // tu jest 33
	}

	static int getX() {
		return x;
	}
}
