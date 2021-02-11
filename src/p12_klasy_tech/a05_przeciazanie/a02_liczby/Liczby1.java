package p12_klasy_tech.a05_przeciazanie.a02_liczby;

public class Liczby1 {
	
	static void m(int arg) {
		System.out.println("int " + arg);
	}

	static void m(double arg) {
		System.out.println("double " + arg);
	}

	static void m(String arg) {
		System.out.println("String " + arg);
	}
	
	public static void main(String[] args) {
		m(5);
		
		byte b = 4;
		// widening - parametr typu "węższego" może zostać przekazany do metody oczekującej typu "szerszego"
		m(b);
		
		m('A');
		
		long l = 1;
		m(l);
		m(14L);
		
		m(3.14);

	}

}
