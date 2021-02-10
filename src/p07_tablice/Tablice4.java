package p07_tablice;

import java.util.Arrays;

public class Tablice4 {

	public static void main(String[] args) {
		int[] t = {10, 20, 30, 40, 50};
		
		System.out.println(Arrays.toString(t));
		System.out.println();
		for (int x : t) {
			System.out.println(x + " -> " + (x+1));
			x++;
			// modyfikowanie zmiennej w for-each nie wpływa na zawartość tablicy
		}
		System.out.println();
		System.out.println(Arrays.toString(t));
		System.out.println();
		
		// jeśli chcemy modyfikować elementy tablicy, to w praktyce uzywamy tradycyjnej pętli for
		
		System.out.println("zwykły for");
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i] + " -> " + (t[i]+1));
			t[i]++;
		}
		System.out.println(Arrays.toString(t));
		
	}

}
