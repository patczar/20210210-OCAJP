package p23_wrappery;

// Klasa String jest immutable
public class ParametryString {
	static void m1(String s) {
		System.out.println("s: " + s);
		
		s.concat(" ma kota");
		System.out.println("concat 1");
		System.out.println("s: " + s);
		
		s = s.concat(" ma kota");
		System.out.println("concat 2");
		System.out.println("s: " + s);
		
		s += " oraz psa";
		System.out.println("+=");
		System.out.println("s: " + s);
		System.out.println();
	}

	public static void main(String[] args) {
		String a = "Ala";
		String b = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println(a == b);
		System.out.println();
		
		m1(a);
		System.out.println("a: " + a);
		System.out.println();
		
		System.out.println("dalej w main...");
		a += " ma rybki";
		// a = a + " ma rybki";
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println(a == b);
	}
}
