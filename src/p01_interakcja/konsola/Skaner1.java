package p01_interakcja.konsola;

import java.util.Scanner;

public class Skaner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Jak masz na imię? ");
		String imie = sc.nextLine();

		System.out.print("Ile masz lat, " + imie + "? ");
		int wiek = sc.nextInt();

		if (wiek >= 18) {
			System.out.println("Jesteś pełnoletni(a)");
		} else {
			System.out.println("Nie");
		}
		
		// Akurat w tym przypadku (System.in) nic złego się nie stanie jeśli nie zamkniemy,
		// ale aby nie było warningów, w ten sposób możemy zamknąć Scanner i wraz z nim standardowe wejście.
		sc.close();
	}

}
