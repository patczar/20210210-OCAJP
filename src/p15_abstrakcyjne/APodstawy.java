package p15_abstrakcyjne;


abstract class A1 {
	// klasa abstrakcyjna może być zupełnie pusta
}

abstract class A2 {
	// jak każda klasa może mieć pola, konstruktory, normalne metody, zmienne i metody statyczne
	private int licznik;
	
	String halo() {
		return "halo halo";
	}
	
	// dodatkowo może posiadać metody abstrakcyjne, czyli pozbawione treści
	abstract String abstrakcyjna(int a, int b);

	// nie klamerki, tylko średnik
	//NK abstract String aaa(int a, int b) { }

	// metoda abstract nie może być private ani final
	//NK private abstract String bbb();

	//NK final abstract String ccc();
}

// gdy tworzymy podklasę klasy abstrakcyjnej, to albo ona też jest abstrakcyjna
abstract class A3 extends A2 {
	
}

// albo musi uzupełnić implementacje wszystkich metod, które "wyżej" były abstrakcyjne
class A4 extends A2 {
	String abstrakcyjna(int a, int b) {
		return a + " " + b;
	}
}


public class APodstawy {

	public static void main(String[] args) {
		// Nie można utoworzyć instancji tej klasy:
		//NK A1 a1 = new A1();
		
		A2 a4 = new A4();
		System.out.println(a4.abstrakcyjna(5, 7));
	}

}
