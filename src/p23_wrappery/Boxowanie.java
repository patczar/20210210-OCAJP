package p23_wrappery;

public class Boxowanie {
	static void test(Integer x) {
		int i = x;
		// int i = x.intValue();
		System.out.println(2 * i);
	}

	public static void main(String[] args) {
		Integer x;
		
		x = 50;
		test(x);
		
		x = null;
		test(x); // NPE w linii 5
	}
}
