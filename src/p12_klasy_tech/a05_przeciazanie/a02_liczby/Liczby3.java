package p12_klasy_tech.a05_przeciazanie.a02_liczby;

public class Liczby3 {
	
	static void m(double arg) {
		System.out.println("double " + arg);
	}
	
	public static void main(String[] args) {
		m(5);
		
		m(3.14);
		
		Double dd = 4.44;
		// unboxing
		m(dd);
		
		Long ll = 4L;
		
		// działa taka kombinacja: najpierw unboxing, a potem widening
		m(ll);
		
	}

}
