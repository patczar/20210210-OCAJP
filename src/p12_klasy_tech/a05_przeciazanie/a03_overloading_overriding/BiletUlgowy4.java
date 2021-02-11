package p12_klasy_tech.a05_przeciazanie.a03_overloading_overriding;


// W tej wersji jawnie sprawdzamy typ obiektu.
// Działa poprawnie i okazuje się być najbardziej sensownym rozwiązaniem.

public class BiletUlgowy4 {
	private static class Osoba {
		
	}

	private static class Student extends Osoba {
		
	}

	private static class KasaBiletowa {
		int cenaBiletu(Osoba klient) {
			if(klient instanceof Student) {
				return 25;
			}
			return 50;
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
		
	}
	
}
