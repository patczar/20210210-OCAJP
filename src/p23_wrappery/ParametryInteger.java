package p23_wrappery;

import java.util.concurrent.atomic.AtomicInteger;

public class ParametryInteger {
	
	static void metoda(int a, Integer b, AtomicInteger c) {
		a += 7;
		b += 8;
		c.addAndGet(9);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();
	}

	public static void main(String[] args) {
		int a = 100;
		Integer b = new Integer(200);
		AtomicInteger c = new AtomicInteger(300);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();

		metoda(a, b, c);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println();
	}
}
