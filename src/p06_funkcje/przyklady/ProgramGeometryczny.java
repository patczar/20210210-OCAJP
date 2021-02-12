package p06_funkcje.przyklady;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGeometryczny {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		glownaPetla: // etykieta / label
		while(true) {
			System.out.println("Wybierz figurę:\n Q - zakończ,\n K - kwadrat,\n P - prostokąt,\n O - koło");
			String wybor = sc.nextLine().trim().toUpperCase();
			switch(wybor) {
				case "Q": {
					break glownaPetla;
				}
				case "K": {
					System.out.print("Podaj długość boku kwadratu: ");
					double a = sc.nextDouble();
					double pole = Geometria.poleKwadratu(a);
					double obwod = Geometria.obwodKwadratu(a);
					System.out.println("Pole kwadratu wynosi: " + pole);
					System.out.println("Obwód kwadratu wynosi: " + obwod);
					break;
				}
				case "P": {
					System.out.print("Podaj długość dwóch boków prostokąta: ");
					double a = sc.nextDouble();
					double b = sc.nextDouble();
					double pole = Geometria.poleProstokata(a, b);
					double obwod = Geometria.obwodProstokata(a, b);
					System.out.println("Pole prostokąta wynosi: " + pole);
					System.out.println("Obwód prostokąta wynosi: " + obwod);
					break;
				}
				case "O": {
					System.out.print("Podaj promień koła: ");
					double r = sc.nextDouble();
					double pole = Geometria.poleKola(r);
					double obwod = Geometria.obwodKola(r);
					System.out.println("Pole koła wynosi: " + pole);
					System.out.println("Obwód koła wynosi: " + obwod);
					break;
				}
				default: {
					System.out.println("Nieznane polecenie");
					continue glownaPetla;
				}
			}
			sc.nextLine(); // żeby Scanner wczytał wszystkie pozostałości i przeszedł do nast. linii
		}
	}
}

/*
użycie if zamiast switch wyglądałoby tak:
if(wybor.equals("K")) {
	System.out.println("Wybrano kwadrat");
} else if(wybor.equals("O")) {
	System.out.println("Wybrano koło");
}
*/
