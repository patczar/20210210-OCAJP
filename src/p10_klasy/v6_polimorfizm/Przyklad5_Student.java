package p10_klasy.v6_polimorfizm;

public class Przyklad5_Student {

	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		// obiekt klasy Osoba ma swoje zmienne i metody:
		osoba.imie = "Ala";
		osoba.nazwisko = "Kowalska";
		osoba.wiek = 30;
		osoba.przedstawSie();
		System.out.println(osoba);
		// Natomiast osoba nie posiada zmiennych ani metod zdefiniowanych w klasie Student
		// osoba.kierunekStudiow = "biologia";
		// System.out.println(osoba.sredniaOcen());
		System.out.println();

		
		Student student = new Student();
		
		// Gdy klasa Student jest podklasą klasy Osoba,
		// to obiekt klasy Student posiada wszystkie te zmienne i metody, które były zdefiniowane w klasie Osoba
		// Z obiektem Student można robić te same rzeczy, które można by zrobić z obiektem Osoba
		
		student.imie = "Adam";
		student.nazwisko = "Abacki";
		student.wiek = 22;
		System.out.println(student.imie + " " + student.nazwisko);
		student.przedstawSie();
		
		// Oprócz nich dostępne są także nowe zmienne i metody, dodane w podklasie
		student.rok = 2;
		student.kierunek = "geografia";
		System.out.println(student.rok + " rok kierunku " + student.kierunek);
		System.out.println(student.sredniaOcen());
		System.out.println();
		
		// Z nadklasy dziedziczone są:
		//  * wszystkie pola, w tym prywatne (do prywatnych nie ma bezpośredniego dostępu, ale w pamięci są obecne)
		//  * metody - poza prywatnymi
		//  * natomiast NIE SĄ DZIEDZICZONE żadne konstruktory
		
		// np. nie da się utworzyć studenta tak:
		// Student ola = new Student("Ola", "Malinowska", 20);
		// Student ola = new Osoba("Ola", "Malinowska", 20);

		// Za to można w klasie Student zdefiniować odpowiedni konstruktor z parametrami...
		Student student2 = new Student("Jan", "Kowalski", 22, 3, "geologia");
		student2.przedstawSie();

		
		// Student jest nie tylko podobny technicznie do Osoby w tym, że posiada odziedziczone zmienne i metody
		// ale również formalnie "Student jest Osobą" i w Javie oznacza to, że
		// "zasada podstawiania"
		// obiekt klasy Student może być użyty wszędzie tam, gdzie oczekiwana jest Osoba ("zasada podstawiania")
		// Przykładowo: Student może być właścicielem konta, może kupić piwo:
		
		// student może kupić piwo
		Sklep.sprzedajPiwo(student);
	
		// student może byc właścicielem konta
		Konto konto = new Konto(1, 1234, student);
		System.out.println(konto);
		
		// możemy po prostu obiekt Student wpisać na zmienną typu Osoba:
		Osoba ktos = student;
		System.out.println(ktos);
		
		// Z nadklasy nie są dziedziczone konstruktory
		// Student student2 = new Student("Jan", "Kowalski", 22);
		
	}

}
