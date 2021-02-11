package p12_klasy_tech.a03_statyczne;

public class Test1 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
				
		a1.instancyjna = 1;
		a2.instancyjna = 2;
		a1.statyczna  = 11;
		a2.statyczna  = 12;

		System.out.println(a1.instancyjna);
		System.out.println(a2.instancyjna);
		System.out.println(a1.statyczna);
		System.out.println(a2.statyczna);
		System.out.println();
		System.out.println(A.statyczna);
		System.out.println();
		System.out.println("--------");
		System.out.println();
		
		//NK A.instancyjna();
		a1.instancyjna();
		
		A.statyczna();
		a1.statyczna();
	}

}
