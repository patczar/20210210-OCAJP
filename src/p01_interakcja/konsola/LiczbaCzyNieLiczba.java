package p01_interakcja.konsola;

import java.util.Scanner;

public class LiczbaCzyNieLiczba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Napisz coś:");
		
		if(sc.hasNextInt()) {
			int liczba = sc.nextInt();
			System.out.println("Wpisałeś int: " + liczba);
		} else if(sc.hasNextDouble()) {
			double liczba = sc.nextDouble();
			System.out.println("Wpisałeś double: " + liczba);
		} else {
			String slowo = sc.next();
			System.out.println("Wpisałeś tekst: " + slowo);
		}
		String reszta = sc.nextLine();
		System.out.println("Reszta linii: " + reszta);
		System.out.println("Reszta miała znaków: " + reszta.length());
		
	}

}
