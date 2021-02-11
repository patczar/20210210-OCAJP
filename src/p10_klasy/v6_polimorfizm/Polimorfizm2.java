package p10_klasy.v6_polimorfizm;

public class Polimorfizm2 {

	public static void main(String[] args) {
		// Dzięki temu, że "Student jest Osobą" i "Pracownik jest Osobą",
		// można obiekty tych klas umieści w tablicy (kolekcji itp.) osób.
		Osoba[] osoby = {
				new Osoba("Ala", "Kowalska", 44),
				new Osoba("Ola", "Malinowska", 33),
				new Student("Adam", "Abacki", 20, 1, "medycyna"),
				new StudentInformatyki("Karol", "Infobacki", 23, 3),
				new Pracownik("Jan", "Kowalski", 40, "kierowca", 3300),
		};
		
		
		// Przeglądają elementy tablicy wiemy na pewno, że są to Osoby,
		// ale dodatkowo może się okazać, że niektóre osoby są Student albo Pracownik
		// Każda osoba posiada imię, nazwisko i wiek - można te dany odczytać.
		// Każda osoba potrafi się przedstawić - można wywołać przedstawSie()
		// ale w każdej podklasie ta metoda może mieć inną treść ("overriding").
		// Wykona się wersja z właściwej klasy.
		for (Osoba osoba : osoby) {
			System.out.println("* kolejna osoba to " + osoba.imie + " " + osoba.nazwisko);
			System.out.println("    " + osoba);
			System.out.print("    ");
			// System.out.println(osoba.kierunek); // nie każda osoba jest studentem
			osoba.przedstawSie();
			System.out.println("    to jest obiekt klasy: " + osoba.getClass().getSimpleName());
			
			// Można jawnie sprawdzić czy zmienna wskazuje na obiekt określonej klasy
			// (lub dalszej podklasy - np. StudentInformatyki byłby w tym sensie Studentem)
			if(osoba instanceof Student) {
				// Jeśli tak jest, to możemy bezpiecznie zrzutować (cast) zmienną na typ Student
				Student student = (Student) osoba;
				
				System.out.println("    To jest student kierunku " + student.kierunek
						+ ", który ma średnią ocen " + student.sredniaOcen());
			}
			
			// natomiast taki if nie byłby prawdziwy dla obiektu klasy StudentInformatyki
			if(osoba.getClass() == Student.class) {
				System.out.println("    to jest konkretnie klasy Student");
			}
			
			System.out.println();
		}
	}

}
