package p12_klasy_tech.a05_przeciazanie.a03_overloading_overriding;

// Historia: mamy klasy Osoba i Student. Metoda cenaBiletu ma zwrócić cenę biletu w zależności od rodzaju klienta.
// Wydawać by się mogło, że elegancko będzie zrobić przeciążanie. Ale...

public class BiletUlgowy1 {
	private static class Osoba {
		
	}
	
	private static class Student extends Osoba {
		
	}
	
	private static class KasaBiletowa {
		int cenaBiletu(Osoba klient) {
			return 50;
		}

		int cenaBiletu(Student klient) {
			return 25;
		}
	}
	
	public static void main(String[] args) {
		KasaBiletowa kasa = new KasaBiletowa();
		
		Osoba osoba = new Osoba();
		Student student = new Student();
		
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
		// Przeciążanie działa w czasie kompilacji, w oparciu o zadeklarowany typ zmiennej, a nie typ obiektu w pamięci.
		// W tym przypadku wszyscy dostaną bilety za 50 zł.
	}
	
}
