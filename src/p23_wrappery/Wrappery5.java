package p23_wrappery;

public class Wrappery5 {

	public static void main(String[] args) {
		Integer x, y;
		
		x = 55;
		y = null;
		
		System.out.println(pomnoz(x)); 
		System.out.println(pomnoz(y)); // NPE w środku metody
		System.out.println(dodaj(x));
		System.out.println(dodaj(y)); // NPE przy przekazywaniu parametru
		
		int z = y; // NPE przy przypisaniu
		System.out.println(z);
		// bo tak naprawde
		int z2 = y.intValue();
	}
	
	static int pomnoz(Integer a) {
		return 2*a;
	}

	static int dodaj(int a) {
		return 2*a;
	}
}
