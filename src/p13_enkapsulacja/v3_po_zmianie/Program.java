package p13_enkapsulacja.v3_po_zmianie;

import java.time.LocalDate;

public class Program {

	public static void main(String[] args) {
		Student student = new Student("Ada", "Nowak", LocalDate.of(1999, 9, 19), "biologia", 3);
		System.out.println(student.getImie());
		student.setImie("Adam");
		
		// Teraz program nie ma jak dostać się do tablicy ocen
		// double[] oceny = student.oceny;
		
		student.dodajOcene(4.0);
		student.dodajOcene(5.0);
		student.dodajOcene(4.0);
		System.out.println(student.sredniaOcen());
		

		Konto konto = new Konto(1, 1000, student);

		// Teraz żadna inna klasa nie będzie mogła "bez uzasadnienia" modyfikować salda;.
		// Musi użyć jednej z "operacji biznesowych".
		// konto.saldo = 5000;
		// konto.saldo -= 40000;
		
		konto.wplata(5000);
		System.out.println(konto);

		// teraz już nie możemy doprowadzić do ujemengo salda
		try {
			konto.wyplata(40000);
			System.out.println(konto);
		} catch (BrakSrodkow e) {
			e.printStackTrace();
		}
		
	}

}
