package p01_interakcja;

import java.util.Scanner;

public class Skaner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Jak masz na imię?");
		String imie = sc.nextLine();
		
		System.out.println("Ile masz lat, " + imie + "?");
		int wiek = sc.nextInt();
		
		if(wiek >= 18) {
			System.out.println("piwo");
		} else {
			System.out.println("mleko");
		}
		System.err.println("To jest czerwone");
		
	}

}
