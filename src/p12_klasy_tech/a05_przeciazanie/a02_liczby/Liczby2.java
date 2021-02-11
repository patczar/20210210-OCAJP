package p12_klasy_tech.a05_przeciazanie.a02_liczby;

public class Liczby2 {
	
	static void m(int arg) {
		System.out.println("int " + arg);
	}

	static void m(Integer arg) {
		System.out.println("Integer " + arg);
	}
	
	static void m(Double arg) {
		System.out.println("Double " + arg);
	}
	
	public static void main(String[] args) {
		m(5);
		m('A');

		int i = 3;
		m(i);
		
		Integer ii = 15;
		m(ii);
		m((Integer)i);
		
		double d = 3.14;
		// autoboxing
		m(d);

		long l = 44L;
		// nie działa taka kombinacja: najpierw widening, a potem autoboxing
		//NK m(l);

		m((double)l);
		
	}

}
