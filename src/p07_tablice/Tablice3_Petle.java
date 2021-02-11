package p07_tablice;

import java.util.Arrays;

public class Tablice3_Petle {

	public static void main(String[] args) {
		String[] miasta = {"Warszawa", "Kraków", "Łódź", "Wrocław", "Poznań"};
		int[] liczby = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		System.out.println(Arrays.toString(miasta));
		System.out.println(Arrays.toString(liczby));
		System.out.println();
		
		// Są dwa sposoby wykonywania czynności dla wszystkich elementów tablicy:
		// 1) Tradycyjna pętla for / for z licznikiem
		for(int i = 0; i < miasta.length; i++) {
			System.out.println("! " + miasta[i]);
		}
		System.out.println();
		
		for(int i = 0; i < liczby.length; i++) {
			System.out.print(liczby[i] + "; ");
		}
		System.out.println();
		System.out.println();
		
		// 2) Pętla "for-each" / "enhanced for loop"
		// Bezpośrednio przeglądamy elementy tablicy/kolekcji. Są one po koli wpisywane na nową zmienną.
		for(String miasto : miasta) {
			System.out.println("* " + miasto);
		}
		System.out.println();
		
		// zwróćmy uwagę, że to są elementy tablicy, a nie indeksy (pozycje)
		for(int liczba : liczby) {
			System.out.print(liczba + ", ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		

		// Pętla for-each nie nadaje się do modyfikowania zawartości tablicy.
		System.out.println(Arrays.toString(liczby));
		System.out.println();
		System.out.println("w pętli for-each próbuję zmieniać wartości...");
		for (int x : liczby) {
			x++;
			// modyfikowanie zmiennej w for-each nie wpływa na zawartość tablicy
		}
		System.out.println();
		System.out.println(Arrays.toString(liczby)); // liczby się nie zmieniły
		System.out.println();
		
		// Jeśli chcemy modyfikować elementy tablicy, to w praktyce uzywamy tradycyjnej pętli for
		System.out.println("w zwykłym for zmieniam wartości");
		for (int i = 0; i < liczby.length; i++) {
			System.out.println(liczby[i] + " -> " + (liczby[i]+1));
			liczby[i]++;
		}
		System.out.println(Arrays.toString(liczby));

		// Zwykłe pętli for używamy też wtedy, gdy algorytm wymaga jednoczesnego dostępu do różnych elementów.
	}

}


