package p12_klasy_tech.a01_dziedziczenie.nadpisywanie;

import java.io.FileNotFoundException;
import java.io.IOException;

class Nadklasa {
	// nadklasa, z której potem będziemy dziedziczyć
	int m01() {
		return 34;
	}
	
	Number m02() {
		return 23;
	}
	
	Nadklasa m02a() {
		return this;
	}

	Integer m03() {
		return 27;
	}

	String m04() {
		return "Ala";
	}

	public String m05() {
		return "Ala";
	}

	private String m06() {
		return "Alicja";
	}

	public String m07(String arg) {
		return "napis " + arg;
	}
	
	public void m08() throws IOException {
		
	}

	public void m09() throws IOException {
		
	}

	public void m10() throws FileNotFoundException {
		
	}

	public void m11() {
	}

	public void m12() {
	}
	
	@Override
	public Nadklasa clone() throws CloneNotSupportedException {
		return (Nadklasa)super.clone();
	}
}


class Podklasa extends Nadklasa {
// typ wyniku musi być dokładnie taki sam (jeśli mówimy o typach prostych)
//	long m01() {
//		return 43;
//	}
	
//	short m01() {
//		return 43;
//	}

	int m01() {
		return 43;
	}
	
// typ wyniku można "zawęzić"/"ukonkretnić" jeśli mówimy o typie klasowym
// jesli w nadklasie metoda zwraca coś bardziej ogólnego, to w podklasie można zwrócić coś bardziej konkretnego
	Long m02() {
		return 432L;
	}

	Podklasa m02a() {
		return this;
	}

	
//	Number m03() {
//		return 27;
//	}

// nie mozna zmniejszyć poziomu widoczności
//	private String m04() {
//		return "Ala";
//	}
	
	// ale można zwiększyć
	protected String m04() {
		return "Ala";
	}

	// zmiejszenie widczności
//	String m05() {
//		return "Ala";
//	}

//	protected String m05() {
//		return "Ala";
//	}

	// tutaj nie mamy do czynienia z nadpisywaniem, bo metody prywatne nie są dziedziczone
	// @Override
	public int m06() throws IOException {
		return 9;
	}

	// to też nie jest nadpisanie, tylko przeciążanie (to jest inna metoda) - może być dowolna jeśli chodzi o wynik, widocznośc i wyjątki
	// @Override
	int m07(int arg) throws FileNotFoundException {
		return 10*arg;
	}
	
	public void m08() {
		
	}

	public void m09() throws FileNotFoundException {
		//FileNotFoundException jest podklasą IOException
	}

//	public void m10() throws IOException {
//	}
	// dotyczy tylko wyjątków checked

	public void m10() {
	}

	public void m11() throws IllegalArgumentException {
		throw new IllegalArgumentException("bla bla");
	}

//	public void m12() throws Exception {
//	}
}
