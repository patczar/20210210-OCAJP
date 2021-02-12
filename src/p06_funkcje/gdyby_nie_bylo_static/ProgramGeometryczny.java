package p06_funkcje.gdyby_nie_bylo_static;

import java.util.Locale;
import java.util.Scanner;

public class ProgramGeometryczny {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		// Tworzymy obiekt klasy Geometria
		Geometria obiekt = new Geometria();
		
		// Metody, które nie są static, muszą być wywoływane na obiekcie (a nie na klasie)
		
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
					double pole = obiekt.poleKwadratu(a);
					double obwod = obiekt.obwodKwadratu(a);
					System.out.println("Pole kwadratu wynosi: " + pole);
					System.out.println("Obwód kwadratu wynosi: " + obwod);
					break;
				}
				case "P": {
					System.out.print("Podaj długość dwóch boków prostokąta: ");
					double a = sc.nextDouble();
					double b = sc.nextDouble();
					double pole = obiekt.poleProstokata(a, b);
					double obwod = obiekt.obwodProstokata(a, b);
					System.out.println("Pole prostokąta wynosi: " + pole);
					System.out.println("Obwód prostokąta wynosi: " + obwod);
					break;
				}
				case "O": {
					System.out.print("Podaj promień koła: ");
					double r = sc.nextDouble();
					double pole = obiekt.poleKola(r);
					double obwod = obiekt.obwodKola(r);
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
