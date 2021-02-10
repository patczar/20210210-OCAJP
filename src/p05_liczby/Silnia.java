package p05_liczby;

import java.util.Scanner;

public class Silnia {
	
	// 1 * 2 * 3 * .... * n
	static long silnia(int n) {
		long wynik = 1;
		for(int i = 2; i <= n; i++) {
			wynik *= i;
		}
		
		return wynik;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Podaj liczbę (-1 aby zakończyć)");
			int n = sc.nextInt();
			if(n < 0) break;
			
			long wynik = silnia(n);
			System.out.println("Wynik: " + wynik);
		}

	}

}
