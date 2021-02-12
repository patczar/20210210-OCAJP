package p06_funkcje.przyklady;

import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21 34 55 

// F(0) = 0 , F(1) = 1,  F(n) = F(n-2) + F(n-1)

public class Fibonacci1 {
	
	static long fib(int n) {
		if(n < 0)
			throw new IllegalArgumentException("Nie istnieje Fib dla liczb ujemnych");
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fib(n-2) + fib(n-1);
		// rekurencja = funkcja wywołuje samą siebie (zazwyczaj z innym argumentem)
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Podaj liczbę: ");
			int n = sc.nextInt();
			if(n < 0) break;
			long wynik = fib(n);
			System.out.printf("F(%d) = %d\n\n", n, wynik);
		}
	}

}
