package p12_klasy_tech.a05_przeciazanie.a03_overloading_overriding;

public class Podklasa extends Nadklasa {
	public void print(Number arg) {
		System.out.println("Podklasa Number " + arg + " obiekt jest klasy " + arg.getClass().getSimpleName());
	}
	
	public void print(Byte arg) {
		System.out.println("Podklasa Byte " + arg);
	}
}
