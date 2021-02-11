package p12_klasy_tech.a05_przeciazanie.a03_overloading_overriding;

// Ta wersja poprawna, informacja czy osoba ma zniżkę jest podawana w metodzie instancyjnej, która jest nadpisywana w podklasie.
// Nieintuicyjne (nieżyciowe?... :) ) jest to, że osoba sama deklaruje czy ma zniżkę...
// Nawet patrząc z punktu widzenia dobrych/złych praktyk programistycznych nie podoba mi się to,
// że aby działał klasa KasaBiletowa muskmy dodawać nową metodę do klas Osoba i Student.
// Nadpisywanie (overriding) działa w czasie wykonania (runtime) i bierze pod uwagę faktyczną klase obiektu w pamięciu.

public class BiletUlgowy3 {
	private static class Osoba {
		public boolean czyMaZnizke() {
			return false;
		}
	}
	
	private static class Student extends Osoba {
		@Override
		public boolean czyMaZnizke() {
			return true;
		}
	}
	
	private static class KasaBiletowa {
		int cenaBiletu(Osoba klient) {
			if(klient.czyMaZnizke()) {
				return 25;
			}
			return 50;
		}
	}
	
	public static void main(String[] args) {
		
		KasaBiletowa kasa = new KasaBiletowa();
		
		Osoba osoba = new Osoba();
		Student student = new Student();
		
		// OK
		System.out.println(osoba.czyMaZnizke());
		System.out.println(student.czyMaZnizke());
		System.out.println();

		System.out.println(kasa.cenaBiletu(osoba)); // 50
		System.out.println(kasa.cenaBiletu(student)); // 25
		System.out.println();
		
		Osoba[] osoby = {
			new Osoba(),
			new Student(),
		};
		for (Osoba o : osoby) {
			System.out.println(o.getClass().getSimpleName()
					+ " dostaje bilet w cenie "
					+ kasa.cenaBiletu(o));
		}
		
	}
	
}
