package p07_tablice;

import java.util.Arrays;

public class Tablice2_Tworzenie {
	
	public static void main(String[] args) {
		int[] a;
		// tylko deklaracja zmiennej, zmienna jest niezainicjowana

// Poniższe linie się nie kompilują:
//		System.out.println(a);
//		System.out.println(a[1]);
//		a[1] = 10;  // to jest tak naprawdę ODCZYT zmiennej a (bo a jest referencją)
//		System.out.println(a[1]);
		
		a = null;
		System.out.println(a);
		// System.out.println(a[1]); // NPE

		int rozmiar = 10;
		// utworzenie tablicy i wpisanie do zmiennej a
		// Tak tworzona tablica ma określony rozmiar i jest inicjalizaowana wartościami null, 0 lub false
		a = new int[rozmiar];
		
		a[1] = 133;
		a[3] = 150;
		System.out.println(Arrays.toString(a));
		
		// Istniejącej tablicy nie da się rozszerzać, można najwyżej utowrzyć nową tablicę i wpisać na dotychczasową zmienną - ale to będzie utrata danych.
		// do zmiennej a można wpisać inną (np. nową) tablicę - dotychczasowa jest zapominana
		a = new int[2*rozmiar];
		System.out.println(Arrays.toString(a));
		System.out.println();

		// można deklaracje i inicjalizacje zapisać w jednej linii:
		double[] wspolrzedne = new double[3];
		System.out.println(Arrays.toString(wspolrzedne));
		
		// takiej składni nie ma w Javie
		//NK int[20] c;
		//NK int c[20];
		
		// to jest poprawna składnia:
		int d[] = new int[13];
		
		int d1[], d2[], d3;
		d1 = new int[1];
		d3 = 15;
		
		
		// Tablic, ani innych obiektów, się w Javie nie usuwa z pamięci - Java robi to automatycznie.
		// long[] duza = new long[1000000000]; // OutOfMemory

		// Można też tworzyć tablice od razu podając ich zawartość:
		int piecdziesiat = 50;
		
		// deklaracje nowych zmiennych:
		// mogę użyć najkrószej składni: nawiasy klamrowe i wartości w środku,
		int[] e = {10, 20, 30, 40, piecdziesiat};
		int[] f = {10, 20, 30, 40, piecdziesiat, 60, };
		
		// mogę też użyć składni new int[] {elementy}
		int[] g = new int[] {10, 20, 30, 40, 50};
		
		
		// Jeśli to już nie jest deklaracja nowej zmiennej, tylko przypisanie do starej zmiennej lub inne sytuacje
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
		// System.out.println(wynik);
		
		// Tablice utworzone za pomocą {} też można modyfikować.
		// Zarowno zawartośc, jak i same zmienne
		System.out.println(e); // [I@6d06d69c
		System.out.println(Arrays.toString(e)); // zawartość
		e[1] = 24;
		e[2]++;
		System.out.println(Arrays.toString(e));
		
		e = new int[5];  // zmienna e wskazuje na inną tablicę
		System.out.println(Arrays.toString(e));
	}

	static int suma(int[] a) {
		int suma =0;
		for (int x : a) {
			suma += x;
		}
		return suma;
	}
}
