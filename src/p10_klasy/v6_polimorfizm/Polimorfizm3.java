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
		os1 = st3;
		
		ktos = student;
		// Zawsze można sprawdzić jakiej klasy jest obiekt i ew. zrzutować:
		if(ktos instanceof Student) {
			System.out.println(((Student) ktos).kierunek);
		}
	}

}
