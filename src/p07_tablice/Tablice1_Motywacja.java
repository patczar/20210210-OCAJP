package p07_tablice;

import java.util.Arrays;

public class Tablice1_Motywacja {

	public static void main(String[] args) {
		
		// Motywacja:
		// Gdybym potrzebował zapamiętać nie jedną wartość, ale kilka, co mogę zrobić?
		
		// 1) Zdefiniować kilka zmiennych
		String imie1, imie2, imie3;
		imie1 = "Ala";
		imie2 = "Ola";
		imie3 = "Ela";
		
		// Mogę odwołać się do pojedynczych wartości
		System.out.println("Pierwsza osoba to " + imie1);
		System.out.println("Druga osoba to " + imie2);
		System.out.println("Trzecia osoba to " + imie3);
		System.out.println();
		// Ale nie mam jak wykonać operacji "na raz dla wszystkich wartości". Trzeba instrukcję pisać osobno dla każdej zmiennej.
		
		// Poza tym to się "nie skaluje" - nie obsłużymy w ten sposób dużych ilości danych.
		
		// 2) Użyć tablicy lub kolekcji.
		
		String[] imiona = new String[5];
		imiona[1] = "Ala";
		imiona[2] = "Ola";
		imiona[3] = "Ela";
		
		// Nadal mogę odwołać się do pojedynczych wartości
		System.out.println("Pierwsza osoba to " + imiona[1]);
		System.out.println("Druga osoba to " + imiona[2]);
		System.out.println("Trzecia osoba to " + imiona[3]);
		System.out.println();
		
		// Ale teraz na różne sposoby mogę wykonywać operacje na całej tablicy.
		// Można też tworzyć tablice dużych rozmiarów (technicznie: w zakresie int, czyli do 2mld+, o ile wystarczy pamięci).

		// Podstawowa technika przeglądania wszystkich elementów tablicy - pętla.
		System.out.println("Wszystkie elementy tablicy:");
		for(String imie : imiona) {
			System.out.println(" * " + imie);
		}
		System.out.println();
		
		// Są też dostępne gotowe operacje dla tablic, głównie w klasie narzędziowej Arrays.
		// Aby zobaczyć elementy, używamy Arrays.toString
		System.out.println(Arrays.toString(imiona));

		// Długość tablicy
		System.out.println(imiona.length);
		
		// Widzimy teraz, że
		// 1) w miejscach, na które nie wpisaliśmy żadenj wartości, są null-e
		// 2) pozycje w tablicy są numerowane od 0. Poprawne numery to zawsze od 0 do length-1 (length to długość tablicy)
		//    próba odwołania się poza zakresem (odczyt i zapis) kończy się wyjątkiem
		
		// System.out.println(imiona[20]); // wyjątek
		
		// Można tworzyć tablice obiektów (np. String), ale także typów prostych (np. int)
		// Początkową wartością elementów jest null dla obiektów, a 0 lub false dla tablic typu prostego.
		int[] liczby = new int[10];
		System.out.println(Arrays.toString(liczby));
	}

}
