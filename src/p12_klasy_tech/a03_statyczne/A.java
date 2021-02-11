package p12_klasy_tech.a03_statyczne;

public class A {
	int instancyjna = 100;
	static int statyczna = 200;
	
	static void statyczna() {
		System.out.println(statyczna);
		//NK System.out.println(instancyjna); // bo "nie wiemy z jakiego obiektu"
		System.out.println(new A().instancyjna);
		
		//NK instancyjna();
	}

	void instancyjna() {
		System.out.println(statyczna);
		System.out.println(A.statyczna);
		System.out.println(this.statyczna); // brzydko, ale się kompiluje
		
		System.out.println(instancyjna);
		System.out.println(this.instancyjna);
		
		statyczna(); // OK
	}

}
