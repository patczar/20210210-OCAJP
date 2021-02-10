package p07_tablice;

import java.util.Arrays;

public class Kopiowanie1 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = a.clone();
		int[] c = Arrays.copyOf(a, 5);
		int[] d = Arrays.copyOf(a, 12);
		int[] e = Arrays.copyOfRange(a, 4, 8);
		int[] f = Arrays.copyOfRange(a, 4, 12);
		int[] g = new int[8];
		System.arraycopy(a, 2, g, 1, 5);
		
		int[] r = a; // referencja

		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println("c: " + Arrays.toString(c));
		System.out.println("d: " + Arrays.toString(d));
		System.out.println("e: " + Arrays.toString(e));
		System.out.println("f: " + Arrays.toString(f));
		System.out.println("g: " + Arrays.toString(g));
		System.out.println("r: " + Arrays.toString(r));
		System.out.println();
		
		System.out.println("Zmieniam a w środku");
		a[0]=13;
		a[1]++;
		a[2]+=10;
		a[3]*=5;
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println("c: " + Arrays.toString(c));
		System.out.println("d: " + Arrays.toString(d));
		System.out.println("e: " + Arrays.toString(e));
		System.out.println("f: " + Arrays.toString(f));
		System.out.println("g: " + Arrays.toString(g));
		System.out.println("r: " + Arrays.toString(r));
		System.out.println();

		System.out.println("Na a wpisuję nową tablicę");
		a = new int[] {77,88,99};
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println("r: " + Arrays.toString(r));
	}
}
