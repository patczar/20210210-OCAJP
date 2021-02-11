package p12_klasy_tech.a02_inicjalizacja.v3;

public class A {
	private int x = 5;

	public A() {
		System.out.println("konstruktor A() " + ++x);
	}
	
	static {
		System.out.println("static A");
	}
	
	{
		System.out.println("init A " + ++x);
	}
}
