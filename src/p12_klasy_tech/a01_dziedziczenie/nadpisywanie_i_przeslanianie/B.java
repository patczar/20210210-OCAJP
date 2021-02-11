package p12_klasy_tech.a01_dziedziczenie.nadpisywanie_i_przeslanianie;

public class B extends A {
	static String zmienna_statyczna = "zmienna statyczna B";
	
	String zmienna_instancyjna = "zmienna instancyjna B";
	
	static String metoda_statyczna() {
		return "metoda statyczna B";
	}

	String metoda_instancyjna() {
		return "metoda instancyjna B";
	}
	

}
