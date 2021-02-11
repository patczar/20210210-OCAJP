package p12_klasy_tech.a01_dziedziczenie.superthis;

public class B extends A {
	public void print() {
		System.out.println("Jestem B");
	}

	public void testSuper() {
		this.print();
		super.print();
	}
}
