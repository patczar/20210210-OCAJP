package p03_instrukcje.przyklady;

import java.util.Scanner;

public class Parkomat1 {

	public static void main(String[] args) {
		final int CENA = 3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Za ile godzin parkowania płacisz? ");
		int godziny = sc.nextInt();
		int doZaplaty = godziny * CENA;
		System.out.println("Za " + godziny + " godzin parkowania należy się " + doZaplaty + " zł");
		
		int sumaWplat = 0;
		while(sumaWplat < doZaplaty) {
			System.out.println("Do tej pory wpłacono " + sumaWplat + ", pozostało " + (doZaplaty - sumaWplat));
			System.out.print("wrzuć monetę: ");
			int moneta = sc.nextInt();
			sumaWplat += moneta;
		}
		
		if(sumaWplat > doZaplaty) {
			int reszta = sumaWplat - doZaplaty;
			System.out.println("Wydaję resztę: " + reszta);
		}
		System.out.println("Gotowe");
	}
}


