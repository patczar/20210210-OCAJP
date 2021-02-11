package p12_klasy_tech.a05_przeciazanie.a03_overloading_overriding;

// Klasy Osoba i Student posiadają metodę mówiącą czy posiada zniżkę, ale podaną jako metoda statyczna.
// To też nie działa, bo dla metod statycznych nie działa nadpisywanie!

public class BiletUlgowy2 {
	private static class Osoba {
		public static boolean czyMaZnizke() {
			return false;
		}
	}

	private static class Student extends Osoba {
		public static boolean czyMaZnizke() {
			return true;
		}
	}

	private static class KasaBiletowa {
		int cenaBiletu(Osoba klient) {
			// tu zawsze wywołamy metod z klasy Osoba, tak jakby wołać Osoba.czyMaZnizke()
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
		
		// niby OK
		System.out.println(osoba.czyMaZnizke());
		System.out.println(student.czyMaZnizke());
		System.out.println();
		
		System.out.println(kasa.cenaBiletu(osoba)); // 50
		System.out.println(kasa.cenaBiletu(student)); // 50
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
