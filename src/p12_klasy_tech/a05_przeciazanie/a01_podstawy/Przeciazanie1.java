package p12_klasy_tech.a05_przeciazanie.a01_podstawy;

public class Przeciazanie1 {
	
	// w jednej klasie można mieć wiele metod o tej samej nazwie
	// pod warunkiem, że te metody różnią się listą typów parametrów
	void print() {
		System.out.println("print()");
	}
	
	void print(String arg) {
		System.out.println("print(String) " + arg);
	}

	void print(int arg) {
		System.out.println("print(int) " + arg);
	}

	void print(int arg1, int arg2) {
		System.out.println("print(int, int) " + arg1 + " " + arg2);
	}

	// nawet tak subtelne różnice typu sa wystarczające
	void print(long arg1, int arg2) {
		System.out.println("print(long, int) " + arg1 + " " + arg2);
	}

	void print(int arg1, long arg2) {
		System.out.println("print(int, long) " + arg1 + " " + arg2);
	}

	void print(long arg1, long arg2) {
		System.out.println("print(long, long) " + arg1 + " " + arg2);
	}

	void print(Integer arg1, int arg2) {
		System.out.println("print(Integer, int) " + arg1 + " " + arg2);
	}

	// nie wystarczają natomiast:
// 1) nazwy parametrów
//	void print(int x, int y) {
//		System.out.println("x y");
//	}

// 2) typ wynikowy
//	int print(int arg1, int arg2) {
//	}
//
//	String print(int arg1, int arg2) {
//	}
	
	// Metody przeciążone mogą różnić się typen wyniku
	int a(Integer x) {
		return x.intValue();
	}

	String[] a(String x) {
		return new String[] {"Ala","Ola"};
	}

	public static void main(String[] args) {
		new Przeciazanie1().run();
	}

	private void run() {
		print();
		print(13);
		print(13, 15);
		print(22L, 1);
		print("Ala");
	}

}
