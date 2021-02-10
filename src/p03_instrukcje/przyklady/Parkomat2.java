package p03_instrukcje.przyklady;

import java.util.Scanner;

public class Parkomat2 {

	public static void main(String[] args) {
		final int CENA = 3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Za ile godzin parkowania płacisz? ");
		int godziny = sc.nextInt();
		int doZaplaty = godziny * CENA;
		System.out.println("Za " + godziny + " godzin parkowania należy się " + doZaplaty + " zł");
		
		while(doZaplaty > 0) {
			System.out.println("Pozostało " + doZaplaty);
			System.out.print("wrzuć monetę: ");
			int moneta = sc.nextInt();
			doZaplaty -= moneta;
		}
		
		if(doZaplaty < 0) {
			int reszta = -doZaplaty;
			System.out.println("Wydaję resztę: " + reszta);
		}
		System.out.println("Gotowe");
	}
}


