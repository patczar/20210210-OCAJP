package p06_funkcje.teoria;

import java.time.LocalTime;

public class Funkcje1 {
	
	static void abc() {
		System.out.println("Abecadło");
		System.out.println("z pieca spadło");
	}
	
	static void poczatek() {
		// Funkcja typu void nie zwraca żadnego wyniku, tylko "coś robi"

		System.out.println("To jest funkcja początek");
		System.out.println("Funkcja początek kończy się");
	}
	
	static void nikt_mnie_nie_chce() {
		// Jeśli funkcja nie jest wywoływana z main (bezpośrednio albo pośrednio),
		// to jej treść się nie wykona.
		System.out.println("To się nigdy nie wypisze");
	}

	static void ktoraGodzina() {
		System.out.println("Godzina " + LocalTime.now());
	}
	
	public static void main(String[] args) {
		System.out.println("Początek main");
		poczatek();
		abc();
		abc();
		System.out.println();
		for (int i = 0; i < 100; i++) {
			ktoraGodzina();
		}
		koniec();
	}

	
	// W Javie kolejność definicji metod (funkcji) nie ma znaczenia.
	// Funkcja zdefiniowana wcześniej może wywoływać funkcję zdefiniowaną później.
	static void koniec() {
		System.out.println("Koniec");
		System.out.print("Na koniec jest godzina: ");
		ktoraGodzina(); // jedna funkcja może wywołać inną funkcję
	}
	
}
