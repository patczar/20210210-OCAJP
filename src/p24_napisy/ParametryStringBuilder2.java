package p24_napisy;

public class ParametryStringBuilder2 {

	public static void main(String[] args) {
		String s = "Ala";
		StringBuilder b = new StringBuilder("Ola");
		
		System.out.println("s = " + s);
		System.out.println("b = " + b);
		System.out.println();
		
		m(s, b);
		
		System.out.println("s = " + s);
		System.out.println("b = " + b);
		System.out.println();
	}
	
	static void m(String s, StringBuilder b) {
		s.concat(" ma kota");
		b.append(" ma psa");
		
		System.out.println("s = " + s);
		System.out.println("b = " + b);
		System.out.println();
	}

}
