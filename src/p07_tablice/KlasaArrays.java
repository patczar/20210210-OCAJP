package p07_tablice;

import java.util.Arrays;

public class KlasaArrays {

	public static void main(String[] args) {
		// Klasa narzędziowa Arrays definiuje różne gotowe operacje na tablicach
		
		int[] liczby = new int[100];
		String[] napisy = new String[10];
		
		System.out.println(liczby);
		System.out.println(Arrays.toString(liczby));
		System.out.println(napisy);
		System.out.println(Arrays.toString(napisy));
		System.out.println();
		
		Arrays.fill(liczby, 33);
		System.out.println(Arrays.toString(liczby));

		Arrays.sort(liczby);
		System.out.println(Arrays.toString(liczby));

	}

}
