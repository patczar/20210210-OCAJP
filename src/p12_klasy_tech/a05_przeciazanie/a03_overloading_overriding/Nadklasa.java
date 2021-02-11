package p12_klasy_tech.a05_przeciazanie.a03_overloading_overriding;

public class Nadklasa {

	public void print(Number arg) {
		System.out.println("Nadklasa Number " + arg);
	}
	
	// nie ma metody od Byte
	
	public void print(Integer arg) {
		System.out.println("Nadklasa Integer " + arg);
	}
	
	public static void main(String[] args) {
		Nadklasa obiekt = new Nadklasa();
		obiekt.print(5);
		
		Byte bb = 3;
		obiekt.print(bb);
	}

}
