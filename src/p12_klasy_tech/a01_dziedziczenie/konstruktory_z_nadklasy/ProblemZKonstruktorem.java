package p12_klasy_tech.a01_dziedziczenie.konstruktory_z_nadklasy;

class AA {
	// klasa posiada konstruktor(y) z parametrami, a nie posiada konstruktora bezparametrowego
	AA(String nazwa) {
		
	}
}

/*
// wówczas nie skompiluje się podklasa bez żadnego konstruktora
class BB extends AA {
}

// ponieważ gdy nie napiszemy żadnego własnego konstruktora, automatycznie generowany jest taki:
class CC extends AA {
	public CC() {
		super();
	}
}

// nie można również w podklasach pisać własnych konstruktorów, które nie robią super:
class DD extends AA {
	String mojeImie;
	DD(String imie) {
		mojeImie = imie;
	}
	// ponieważ gdy nie napiszemy na początrku konstruktora super(...) ani this(...)
	// to automatycznie wstawiane jest super()  (bez parametrów)
}

class EE extends AA {
	EE() {
		super("Ala");
		// OK
	}
}

class FF extends AA {
	FF(String arg) {
		super(arg);
		// OK
	}
	
	FF() {
		this("Ola"); // wskazanie innego konstruktora z tej samej klasy
	}
	
	FF(int x) {
		// this lub super muszą być pierwszą instrukcją w konstruktorze
		
		// System.out.println(x); // gdybym odkomentował, to przestanie się kompilować
		super(String.valueOf(x));
	}
}


public class ProblemZKonstruktorem {
	public static void main(String[] args) {
		// nie ma konstruktora domyślnego - nie da się w tak prosty sposób utworzyć obiektu
		AA a1 = new AA();
	}

}
*/
