package p24_napisy;

public class ReferencjeString {

	public static void main(String[] args) {
		String a = "Ala";
		String b = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a == b " + (a == b));
		System.out.println();
		
		b += " ma psa";
		System.out.println("a = " + a); // Ala
		System.out.println("b = " + b); // Ala ma psa
		System.out.println("a == b " + (a == b));
		System.out.println();
		
		m(a);
		System.out.println("a = " + a);

	}
	
	static void m(String c) {
		c += " ma kota";
		System.out.println("c = " + c);
	}

}
