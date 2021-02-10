package p07_tablice;

import java.util.Arrays;

public class Tablice1 {

	public static void main(String[] args) {
		
		// deklaracja zmiennej typu tablica:
		int[] t;
		String[] s;
		
		// Sama deklaracja nie tworzy jeszcze tablicy
		// W Javie tablice są obiektami.
		
		// Utworzenie tablicy: operacja new. Tworząc tablicę podajemy jej rozmiar:
		t = new int[100];
		s = new String[20];
		
		// Nowotworzona tablica jest wypełniana wartościami null, 0 lub false (w zależności od typu)
		
		System.out.println(t);
		System.out.println(s);
		System.out.println();
		
		// do uzyskania zawartości tablicy w podstaci tekstowej można użyć Arrays.toString
		
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(s));
		System.out.println();
		
		// tak można się odwoływać do elementów tablicy:
		t[0] = 100;
		t[1] = 101;
		t[2] = 102;
		
		s[3] = "Ola";
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(s));
		System.out.println();
		System.out.println(t[1]);
		// elementów tablic można w wielu przypadkach używać jak zwykłych zmiennych:
		t[1]++;
		
		// długość tablicy:
		System.out.println(t.length);
		// ciekawostka: długość tablicy musi być typu int, czyli tablice mogą mieć najwyżej 2mld+ elementów
		
	}

}
