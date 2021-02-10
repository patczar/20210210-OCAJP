package p07_tablice;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Kopiowanie3 {
	public static void main(String[] args) {
		AtomicInteger[] t = new AtomicInteger[4];
		t[0] = new AtomicInteger(5);
		t[1] = new AtomicInteger(10);
		
		AtomicInteger[] kopia = t.clone();
		
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(kopia));
		
		t[0].addAndGet(100);  // widać w kopii
		t[1] = new AtomicInteger(333); // nie widać w kopii
		
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(kopia));
	}
}
