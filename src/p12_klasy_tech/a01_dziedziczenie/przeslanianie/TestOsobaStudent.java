package p12_klasy_tech.a01_dziedziczenie.przeslanianie;

// nadpisywanie nie działa dla metod statycnzych.
// zmień metody cenaBiletu na static i zobacz co się stanie
class Osoba {
	int cenaBiletu() {
		return 6;
	}
}

class Student extends Osoba {
	int cenaBiletu() {
		return 3;
	}
}

public class TestOsobaStudent {

	public static void main(String[] args) {
		Osoba o = new Osoba();
		Student s = new Student();
		
		System.out.println("Bilet normalny: " + o.cenaBiletu());
		System.out.println("Bilet studencki: " + s.cenaBiletu());
		System.out.println();
		
		sprzedajBilet(o);
		sprzedajBilet(s);
	}
	
	static void sprzedajBilet(Osoba klient) {
		System.out.println("Klientowi klasy " + klient.getClass().getSimpleName()
				+ " sprzedam bilet za " + klient.cenaBiletu());
	}

}
