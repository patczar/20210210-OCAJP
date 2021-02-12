package p06_funkcje.przyklady;

import java.util.Locale;
import java.util.Scanner;

public class Geometria {
	
	public static double poleKwadratu(double a) {
		return a*a;
	}
	
	public static double obwodKwadratu(double a) {
		return 4*a;
	}
	
	public static double poleProstokata(double a, double b) {
		return a*b;
	}
	
	public static double obwodProstokata(double a, double b) {
		return 2*a + 2*b;
	}
	
	public static double poleKola(double r) {
		return Math.PI * r * r;
	}
	
	public static double obwodKola(double r) {
		return 2 * Math.PI * r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Podaj pierwszą liczbę: ");
		double x = sc.nextDouble();
		System.out.print("Podaj drugą liczbę: ");
		double y = sc.nextDouble();
		System.out.println();
		
		System.out.println("Pole kwadratu o boku " + x + " jest równe: " + poleKwadratu(x));
		System.out.println("Pole kwadratu o boku " + y + " jest równe: " + poleKwadratu(y));
		System.out.println("Obwód kwadratu o boku " + x + " jest równy: " + obwodKwadratu(x));
		System.out.println("Obwód kwadratu o boku " + y + " jest równy: " + obwodKwadratu(y));
		System.out.println();
		
		System.out.println("Pole prostokąta o bokach " + x + " i " + y + " jest równe: " + poleProstokata(x, y));
		System.out.println("Obwód prostokąta o bokach " + x + " i " + y + " jest równy: " + obwodProstokata(x, y));
		System.out.println();
		
		System.out.println("Pole  koła o boku " + x + " jest równe: " + poleKola(x));
		System.out.println("Pole  koła o boku " + y + " jest równe: " + poleKola(y));
		System.out.println("Obwód koła o boku " + x + " jest równy: " + obwodKola(x));
		System.out.println("Obwód koła o boku " + y + " jest równy: " + obwodKola(y));
		System.out.println();
	}

}
