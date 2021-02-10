package p07_tablice;

import java.util.Arrays;

public class Kopiowanie2 {
	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4,5}, {10,20,30,40}};
		int[][] r = a;
		int[][] b = a.clone();
		
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(r));
		System.out.println(Arrays.deepToString(b));
		System.out.println();
		
		a[1][1] = 77;  // zmienia się w a i b
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(r));
		System.out.println(Arrays.deepToString(b));
		System.out.println();
		
		a[0] = new int[] {300, 400, 500}; // zmienia się tylko w a (i r)
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(r));
		System.out.println(Arrays.deepToString(b));
		System.out.println();
	}
}
