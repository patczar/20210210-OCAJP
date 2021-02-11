package p12_klasy_tech.a02_inicjalizacja.v4;

public class StaticObejscie2 {
	
	static {
		System.out.println("static 1");
		x = 55;
		System.out.println(" w static 1 x == " + getX()); // tu jest 55
	}
	
	static int x = Utils.przypisz(33);

	static {
		System.out.println("static 2");
		System.out.println(" w static 2 x == " + getX()); // a tu 33
	}

	static int getX() {
		return x;
	}
}
