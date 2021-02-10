package p02_zmienne;

//NK int globalna;

public class Zmienne3 {
	// zmienna statyczna - istnieje jeden egzemplarz w pamięci
	static int statyczna = 10;
	
	// zmienna instancyjna (inaczej: pole, atrybut) należy do obiektu
	// Każdy obiekt tej klasy, w której jesteśmy, będzie posiadał taką zmienną
	int instancyjna = 20;

	public static void main(String[] args) {
		// zmienna lokalna, czyli deklarowana w obrębie metody
		int lokalna = 30;
		
		metodaStatyczna(40);
		
		// metody instancyjnej nie da się wywołać w kontekście statycznym (np. w main)
		// metodaInstancyjna(50);
		
		// Trzeba utworzyć obiekt i wywołać tę metodę na obiekcie.
		// Tworzę obiekt, czyli "instancję"
		Zmienne3 obiekt = new Zmienne3();
		obiekt.metodaInstancyjna(50);
		
		System.out.println(statyczna);
		System.out.println(obiekt.instancyjna);
		
		Zmienne3 innyObiekt = new Zmienne3();
		innyObiekt.instancyjna = 123;
		innyObiekt.metodaInstancyjna(33);
	}
	
	
	static void metodaStatyczna(int parametr) {
		int lokalna = 60;
		
		System.out.println("metodaStatyczna:");
		System.out.println("statyczna: " + statyczna);
		// m "kontekście statycznym", czyli w metodzie statycznej nie ma dostępu do zmiennych instancyjnych,
		// bo "nie wiemy w jakim obiekcie"
		//NK System.out.println("instancyjna: " + instancyjna);
		System.out.println("lokalna: " + lokalna);
		System.out.println("parametr: " + parametr);
		System.out.println();
	}
	
	void metodaInstancyjna(int parametr) {
		int lokalna = 70;

		System.out.println("metodaInstancyjna:");
		System.out.println("statyczna: " + statyczna);
		System.out.println("instancyjna: " + instancyjna);
		System.out.println("lokalna: " + lokalna);
		System.out.println("parametr: " + parametr);
		System.out.println();
	}

}
