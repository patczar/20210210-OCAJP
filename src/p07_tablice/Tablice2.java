package p07_tablice;

import java.util.Arrays;

public class Tablice2 {
	
	static int suma(int[] a) {
		int suma =0;
		for (int x : a) {
			suma += x;
		}
		return suma;
	}

	public final static void main(String argv[]) {
		int[] a;
		// tylko deklaracja zmiennej, zmienna jest niezainicjowana
		
//NK		System.out.println(a);
//NK		System.out.println(a[1]);		
//NK		a[1] = 10;  // to jest tak naprawdę ODCZYT zmiennej a (bo a jest referencją)
//NK		System.out.println(a[1]);
		
		a = null;
		System.out.println(a);
		
		// utworzenie tablicy
		a = new int[10];
		
		int[] a1, a2;
		
		int x = (int)(100.0 * Math.random());
		int[] b = new int[x / 2]; // to nie musi być stała, rozmiar może być policzony w czasie działania programu
		System.out.println("b.length = " + b.length);
		
		// takiej składni nie ma w Javie
		//NK int[20] c;
		//NK int c[20];
		
		// to jest poprawna składnia:
		int d[] = new int[13];
		
		int d1[], d2[], d3;
		d1 = new int[1];
		d3 = 15;
		
		int n = 50;
		
		// deklaracje nowych zmiennych:
		// mogę użyć najkrószej składni: nawiasy klamrowe i wartości w środku,
		int[] e = {10, 20, 30, 40, n};
		int[] f = {10, 20, 30, 40, n,};
		
		// mogę też użyć składni new int[] {elementy}
		int[] g = new int[] {10, 20, 30, 40, 50};
		
		// Jeśli to już nie jest deklaracja, tylko przypisanie itp.
		// to nie mogę już używać najkrótszej składni
		// f = {44, 55, 66, 77, 88};
		
		// tylko muszę pisać new
		f = new int[] {44, 55, 66, 77};
		
		int wynik = suma(e);
		System.out.println(wynik);
		
		// tej składni można też użyć, gdy tablica jest parametrem funkcji
		wynik = suma(new int[] {1,3,5,7});
		System.out.println(wynik);
		
		// wynik = suma({1,3,5,7});
		

		// Takie tablice można modyfikować. Zarowno zawartośc, jak i same zmienne
		System.out.println(e); // [I@6d06d69c
		System.out.println(Arrays.toString(e)); // zawartość
		e[1] = 24;
		e[2]++;
		System.out.println(Arrays.toString(e));
		
		e = new int[5];  // zmienna e wskazuje na inną tablicę
		System.out.println(Arrays.toString(e));
	}

}
