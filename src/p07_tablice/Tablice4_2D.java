package p07_tablice;

import java.util.Arrays;

public class Tablice4_2D {

	public static void main(String[] args) {
		// Tablice wielowymiarowe... To tak naprawdę tablice tablic.
		int[][] a = new int[3][5];
		//NK int[][] a2 = new int[3,5];
		
		System.out.println(a.length); // 3
		System.out.println(a[0].length); // 5
		System.out.println();
		
		// regularna macierz
		a[0][4] = 44;
		a[1][2] = 22;
		(a[1])[3] = 33;

		System.out.println(a[0][4]);
		System.out.println("a: " + a + " , zawartość: " + Arrays.toString(a));
		System.out.println("a[0]: " + a[0]+ " , zawartość: " + Arrays.toString(a[0]));
		System.out.println();
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.deepToString(a));
		System.out.println();
		
		
		// Można nie wypełniać od razu wierszy jednakowymi tablicami,
		// ale początkowo zostawić null-e i dopiero potem wpisać poszczególne wiersz.
		// Wtedy mogą być one nawet różnej długości.
		
		int[][] b = new int[4][];
		System.out.println(Arrays.toString(b));
		
		// inicjujemy poszczególne wiersze
		b[0] = new int[7];
		Arrays.fill(b[0], 9);
		b[1] = new int[] {3, 4, 5};
		b[2] = null;
		b[3] = new int[0]; // pusta tablica i null to są różne rzeczy
		System.out.println(Arrays.deepToString(b));
		
		// Można użyć notacji {} także do wypełniania tablic wielowymiarowych.
		String[][] c = {
				{"Ala", "Ola", "Ela"},
				{"Jacek", "Placek"},
				null,
				{},
		};
		
		System.out.println(Arrays.deepToString(c));
	}

}
