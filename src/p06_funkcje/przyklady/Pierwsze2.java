package p06_funkcje.przyklady;

import java.util.Scanner;

public class Pierwsze2 {
	
	static boolean czyPierwsza(long liczba) {
		if(liczba <= 1) {
			return false;
		}
		
		for(long i = 2; i < liczba; i++) {
			if(liczba % i == 0) {
				return false;
			}
		}
		return true;
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
