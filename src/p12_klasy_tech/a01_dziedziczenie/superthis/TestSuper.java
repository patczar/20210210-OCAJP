package p12_klasy_tech.a01_dziedziczenie.superthis;

public class TestSuper {

	public static void main(String[] args) {
		System.out.println("sprawdzam B");
		B b = new B();
		b.testSuper();
		System.out.println();
		
		System.out.println("sprawdzam C");
		C c = new C();
		c.testSuper();
	}

}
