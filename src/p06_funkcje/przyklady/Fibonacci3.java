package p06_funkcje.przyklady;

import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21 34 55

// zadanie: zrobić wersję BigInteger

// wersja bez tablicy, wystarczą 3 zmienne aby pamiętać dwa poprzednie elementy i na ich podstawie wyliczyć następny
public class Fibonacci3 {
	
	static long fib(int n) {
		long biezaca = 0;
		long poprzednia = 1;
		
		for(int i = 1; i <= n; i++) {
			long nastepna = biezaca + poprzednia;
			poprzednia = biezaca;
			biezaca = nastepna;
		}
		return biezaca;
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
