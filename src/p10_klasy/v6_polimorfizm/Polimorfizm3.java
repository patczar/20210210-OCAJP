package p10_klasy.v6_polimorfizm;

public class Polimorfizm3 {

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", "Kowalska", 30);
		Student student = new Student("Jan", "Kowalski", 24, 3, "prawo");
		
		// Osoba ktos = null;
		Osoba ktos = student;
		
		Osoba os1 = student; // OK
		// Student st2 = ktos; // bład kompilacji
		Student st3 = (Student)ktos; // OK, bo na zmiennej ktos jest aktualnie Student
		// Student st4 = (Student)osoba; // kompiluje się, w czasie działania ClassCastException, bo na zmiennej osoba jest Osoba
		
		// Studenta można "zrzutować" na Osobę - to nadmiarowe, ale działa.
		os1 = (Osoba)st3;
		os1 = (Osoba)osoba;
		os1 = st3;
		
		ktos = student;
		// Zawsze można sprawdzić jakiej klasy jest obiekt i ew. zrzutować:
		if(ktos instanceof Student) {
			System.out.println(((Student) ktos).kierunek);
			System.out.println(((Student) ktos).sredniaOcen());
		}

		// Nie można rzutować (to się nawet nie skompiluje)
		// klas, które nie dziedziczą z siebie w linii prostej.
		// Nie można też sprawdzać takich rzeczy za pomocą instanceof

//		String str1 = osoba;
//		String str2 = (String)osoba;
//		if(osoba instanceof String) {
//			String str3 = (String)osoba;
//		}

		// Można to "obejść" poprzed typ Object
		// To się kompiluje, ale kończy błędem CCE
		//CCE String str4 = (String)((Object)osoba);
	}

}
