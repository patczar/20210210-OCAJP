package p10_klasy.v6_polimorfizm;

public class Polimorfizm1 {

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", "Kowalska", 30);
		Student student = new Student("Adam", "Abacki", 20, 1, "prawo");
		Pracownik pracownik = new Pracownik("Jan", "Kowalski", 40, "murarz", 3750);
		
		System.out.println(osoba);
		System.out.println(student);
		System.out.println(pracownik);
		System.out.println();
		
		osoba.przedstawSie();
		student.przedstawSie();
		pracownik.przedstawSie();
		System.out.println();
		
		// Na zmienną typu Osoba (nadklasa) można wpisać obiekt typu np. Student (podklasa)
		Osoba ktos;
		ktos = osoba;
		ktos.przedstawSie();
		System.out.println();
		
		ktos = student;
		ktos.przedstawSie();
		// Poprzez zmieną typu Osoba mam dostep tylko do tych zmiennych i metod,
		// które zostały określone w klasie Osoba.
		System.out.println("Student się nazywa " + ktos.imie + " " + ktos.nazwisko);
		//NK System.out.println("Student studiuje " + ktos.kierunek + " i ma średnią " + ktos.sredniaOcen());
		
		// Natomiast metoda zadeklarowana w nadklasie może zostać NADPISANA (override) w podklasie.
		// Każda osoba jakoś potrafi się przedstawić - więc bezpiecznie mozna wywoływać metodę przedstawSie()
		// na zmiennej typu osoba. Ale w momencie wykonania moze się okazac, że tą osoba jest student
		// i wtedy metoda wykona się "po studencku".

		System.out.println();
		ktos = pracownik;
		ktos.przedstawSie();
		
	}

}
