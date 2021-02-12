package p06_funkcje.przyklady;

import java.util.Scanner;

public class Pierwsze1 {
	
	static boolean czyPierwsza(long liczba) {
		// Rozwiązanie wynikające z definicji matematycznej: sprawdzamy ile dzielników ma liczba.
		// Bardzo eleganckie, ale bardzo niewydajne.
		// Jeśli 2 – to jest pierwsza.
		long ileDzielnikow = 0;
		for(long i = 1; i <= liczba; i++) {
			if(liczba % i ==0) {
				ileDzielnikow++;
			}
		}
		return ileDzielnikow == 2;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Podaj liczbę: ");
			long n = sc.nextLong();
			if(n < 0) break;
			
			long p = System.currentTimeMillis(); // ew. System.nanoTime()
			boolean wynik = czyPierwsza(n);
			long k = System.currentTimeMillis();
			
			if(wynik) {
				System.out.println(n + " JEST liczbą pierwszą");
			} else {
				System.out.println(n + " NIE JEST liczbą pierwszą");
			}
			System.out.println("Czas sprawdzania: " + (k-p)/1000.0 + " s");
			System.out.println();
		}
	}

}
