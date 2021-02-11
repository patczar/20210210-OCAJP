package p10_klasy.v6_polimorfizm;

public class Polimorfizm1_Alt {

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", "Kowalska", 30);
		Student student = new Student("Jan", "Kowalski", 20, 2, "prawo");
		
		
		// Z faktu, że Student extends Osoba wynika:
		// 1) technicznie: że student posiada zmienne i metody pochodzące z klasy Osoba:
		System.out.println(student.imie);
		
		// 2) koncepcyjnie: "Student jest Osobą"
		
		// w każdym miejscu programu, gdzie wymagana jest wartość typu Osoba, możemy wstawić wartość typu Student
		// "zasada podstawiania"
		
		// obiekt Student można wpisać na zmienną typu Osoba:
		Osoba ktos = student;
		System.out.println(ktos);
		
		// Student może mieć Konto
		Konto konto = new Konto(1, 1000, student);
		System.out.println(konto);
		
		// Student może iść na zakupy:
		//Sklep sklep = new Sklep();
		Sklep.sprzedajPiwo(osoba);
		Sklep.sprzedajPiwo(student);
		// sklep.zakupy(new BigInteger(100));
		
		System.out.println();
		// podklasa może nie zmieniać metody z nadklasy - wtedy działa ta sama implementacja
		System.out.println(student.jestPelnoletnia());
		
		// podklasa może dodać zupełnie nować metodę
		System.out.println(student.sredniaOcen());
		
		// podklasa może też nadpisać (OVERRIDE) metodę, która istniała w nadklasie
		// wtedy gdy metoda zostanie wywołana na obiekcie podklasy, zadziała jej zmieniona wersja
		student.przedstawSie();
		
		// ale metoda wywoływana na obiektach nadklasy działa "po staremu"
		osoba.przedstawSie();
		System.out.println();
		
		// Java użyje wersji metody z podklasy także wtedy, gdy obiekt podklasy (Student)
		// będzie wpisany na zmienną typu nadklasa (Osoba):
		Osoba x;
		
		x = osoba;
		x.przedstawSie();
		
		x = student;
		x.przedstawSie();
		// bo w języku Java metody instancyjne są zawsze "wirtualne" (terminologia języka C++)
		

	}

}
