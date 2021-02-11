package p13_enkapsulacja.v3_po_zmianie;

import java.time.LocalDate;

public class PrzykladKonto {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(2001, 2, 14));
		
		Konto konto = new Konto(1, 1000, ala);
		System.out.println(konto);
		
		konto.wplata(500);
		System.out.println(konto);

		try {
			konto.wplata(-400);
			System.out.println(konto);
		} catch (IllegalArgumentException e) {
			System.out.println(e); // nazwa klasy + message
//			System.out.println(e.getMessage()); // sam message
//			e.printStackTrace(); // wypisanie całego stosu
		}
		
		try {
			// try / catch był wymagany
			konto.wyplata(300);
			System.out.println("wypłata 300 się udała");
		} catch (BrakSrodkow e) {
			e.printStackTrace();
		}
		
	}

}
