package p06_funkcje.przyklady;

import java.util.Arrays;
import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21 34 55
// 0 1 2 3 4 5 6  7  8  9 10

// wersja z tablicą - ona jest najlepsza jeśli chcemy obliczyć wszystkie liczby Fib z jakiegoś zakresu
public class Fibonacci2 {
	
	static long fib(int n) {
		if(n <= 0)
			return 0;
		
		long[] F = new long[n+1];
		F[0] = 0;
		F[1] = 1;
		for(int i = 2; i <= n; i++) {
			F[i] = F[i-2] + F[i-1];
		}
		// System.out.println("cała tablica: " + Arrays.toString(F));
		return F[n];
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
