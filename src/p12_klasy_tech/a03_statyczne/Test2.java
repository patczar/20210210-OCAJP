package p12_klasy_tech.a03_statyczne;

public class Test2 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1.instancyjna);
		System.out.println(a2.instancyjna);
		System.out.println(a1.statyczna);
		System.out.println(a2.statyczna);
		System.out.println();
		
		System.out.println("++");
		System.out.println(++a1.instancyjna);
		System.out.println(++a2.instancyjna);
		System.out.println();
		System.out.println(++a1.statyczna);
		System.out.println(++a2.statyczna);
		System.out.println(++A.statyczna);
	}

}
