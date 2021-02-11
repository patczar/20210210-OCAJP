package p12_klasy_tech.a02_inicjalizacja.v3;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Początek main, wątek " + Thread.currentThread().getId());
		
		// deklaracja zmiennej nie wymusza ładowania klasy
		B bbb = null;
		System.out.println("mam nulla");
		System.out.println();
		
//		A a = new A();	
//		System.out.println("Obiekt a utworzony\n");

		B b = new B();
		System.out.println("Obiekt b utworzony\n");

		A c = new B(13);
		System.out.println("Obiekt c utworzony\n");

		System.out.println("Koniec main");

	}

	static {
		System.out.println("static Test, wątek " + Thread.currentThread().getId());
	}
}
