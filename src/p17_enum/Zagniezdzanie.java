package p17_enum;

import p17_enum.E4.KlasaIntancyjna;

class Zagniezdzanie1 {
	int instancyjna = 10;
	static int statyczna = 20;
	
	enum E1 {A, B, C,}

	static enum E2 {A, B, C;}
	
	// Nawet jeżeli nie napiszemy static, to enum zagnieżdżony w klasie jest static
	enum E3 {A, B, C;
		
		public void metoda() {
			System.out.println(statyczna);
			
			// enum jest w kontekście statycznym
			//NK System.out.println(instancyjna);
		}
	}
}


// W enumie mogę też zagnieździć klasę lub enuma
enum E4 {
	A, B, C;
	
	static class KlasaStatyczna {
		void print() {
			System.out.println("aaa");
			//NK System.out.println("bbb " + name());
		}
	}
	
	class KlasaIntancyjna {
		void print() {
			// name() to będzie nazwa tewartości (jednej z A B C),
			// z której został pobrany obiekt tej klasy
			System.out.println("bbb " + name());
		}
	}
	
	interface III {
		void test();
	}
	
	enum E5 {
		
	}
}


public class Zagniezdzanie {
	public static void main(String[] args) {
		Zagniezdzanie1.E1 x = Zagniezdzanie1.E1.A;
		
		E4.KlasaStatyczna y = new E4.KlasaStatyczna();
		y.print();
		
		KlasaIntancyjna z = E4.C.new KlasaIntancyjna();
		z.print();
	}
}


