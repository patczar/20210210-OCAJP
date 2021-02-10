package p01_interakcja.konsola;

import java.util.Scanner;

public class Zakupy1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Co chcesz kupić?");
		String towar = sc.nextLine();
		
		System.out.println("Ile kosztuje jedna sztuka " + towar + "?");
		int cena = sc.nextInt();
		
		System.out.println("Ile sztuk " + towar + " chcesz kupić?");
		int ilosc = sc.nextInt();
		
		int koszt = cena * ilosc;
		System.out.println("Za " + ilosc + " sztuk towaru " + towar + " zapłacisz " + koszt + " zł");
	}

}
