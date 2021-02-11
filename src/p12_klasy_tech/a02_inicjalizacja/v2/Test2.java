package p12_klasy_tech.a02_inicjalizacja.v2;

public class Test2 extends SuperStatic {

	public static void main(String[] args) {
		System.out.println("Początek main");
		
		A a1 = new A();
		A a2 = new A();
		
		new A();
		
		System.out.println("Koniec main");
	}
	
	static {
		System.out.println("static Test - jeszcze przed mainem");
	}

}
