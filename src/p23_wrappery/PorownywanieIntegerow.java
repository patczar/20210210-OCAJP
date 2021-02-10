package p23_wrappery;

public class PorownywanieIntegerow {

	public static void main(String[] args) {
		Integer a, b;
		a = 100;
		b = 100;
		System.out.println(a == b); // T
		
		// wartości od -128 do +127 są "cache'owane" w puli

		a = 200;
		b = 200;
		System.out.println(a == b); // F
		
		a = Integer.valueOf(100);
		b = Integer.valueOf(100);
		System.out.println(a == b); // T
		
		a = new Integer(100);
		b = new Integer(100);
		System.out.println(a == b); // F porówujemy adresy Integerów
		System.out.println(a+0 == b); // T porównujemy inty

	}

}
