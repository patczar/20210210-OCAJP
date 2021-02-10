package p03_instrukcje;

import javax.swing.JOptionPane;

public class Warunki {
	public static void main(String[] args) {
		String tekst = JOptionPane.showInputDialog("Podaj liczbę");
		int liczba = Integer.parseInt(tekst);

		if (liczba % 2 == 0) {
			System.out.println("Liczba jest parzysta");
		}
		// nie ma else

		if (liczba > 0) {
			System.out.println("Liczba dodatnia");
		} else {
			System.out.println("Liczba nie jest dodatnia");
			System.out.println("Czyli jest ujemna albo równa zero");
		}

		// Taki ciąg if / else if ... / else
		// daje gwarację, że wykona się dokładnie jedna z gałęzi kodu
		if (liczba > 1000) {
			System.out.println("Liczba bardzo duża");
		} else if (liczba > 100) {
			System.out.println("Liczba duża");
		} else if (liczba > 10) {
			System.out.println("Liczba mała");
		} else {
			System.out.println("Liczba bardzo mała");
		}

		// nie muszę pisać klamerek jeśli jest pojedyncza instrukcja
		if (liczba == 5)
			System.out.println("To jest pięć");
		else
			System.out.println("To nie jest pięć");
			System.out.println("i jeszcze to"); // ta instrukcja wykona się zawsze, bo ona nie należy do else

		
		// średnik za if-em (analogicznie: za else, while, for)
		// oznacza pustą instrukcję: jeśli liczba == 0, nie rób nic
		// AAAAAA wypisze się zawsze
		if(liczba == 0);
		System.out.println("AAAAAA");
		
		// BBBBBB wypisze się gdy liczba nie jest równa 1
		if(liczba == 1);
		else System.out.println("BBBBB");
			
		// W Javie nie ma automatycznej konwersji liczb (ani innych rzeczy) na boolean
//		if(liczba) {
//			System.out.println("Nie zero");
//		}
		// Typowy błąd w języku C, w Javie się nie skompiluje
//		if(liczba = 100) {
//
//		}

		boolean logika = liczba > 100 && liczba % 3 == 0;
		if (logika) {
			System.out.println("Dziwny warunek jest prawdą");
		} else {
			System.out.println("Nieprawda");
		}

		// To jest przypisanie, a nie porównanie, wartość zmiennej ulega zmianie.
		if(logika = false) {
			System.out.println("Bzdura");  //nigdy się nie wypisze
		}
		System.out.println(logika); // zawsze będzie false, bo powyższy "if" tak naprawdę wpisuje wartośc false na zmienną, a nie sprawdza warunku
	}
}
