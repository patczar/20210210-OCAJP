package p14_wyjatki;

public class ZasadyWyjatkow4 {
	// temat "rethrow" - ponownego wyrzucania złapanego wyjątku

	static void test1() {
		try {
			throw new RuntimeException();
			
		} catch(RuntimeException e) {
			System.out.println(e);
			throw e;
		} catch(Exception e) {
			// ten catch nie wyłapie wyjątku wyrzuconego we wcześniejszym catchu
			System.out.println(e);
		}
	}
	
	static void test2() {
		try {
			throw new RuntimeException();
		} catch(Exception e) {
			System.out.println(e);
			throw e;
			// Kompilator wie, że wyrzucany jest RuntimeException
			// i nie każe go deklarować / obsługiwać
		}
	}

	static void test3() {
		try {
			java.sql.Connection c = java.sql.DriverManager
					.getConnection("jdbc:postgresql://localhost//baza");
			
		} catch(java.sql.SQLException e) {
			throw new RuntimeException(e);
			// wyrzucanie opakowanego wyjątku - jako RuntimeException nie wymaga deklaracji
		}
	}
	
	static void test4() {
		try {
			try {
				System.out.println("A");
				throw new RuntimeException("X");
				//NK System.out.println("B"); // martwy kod
			} catch(Exception e) {
				System.out.println("C " + e);
				throw e;
			} catch(Throwable t) {
				System.out.println("D " + t);
				throw t;
			} finally {
				System.out.println("E");
			}
		} catch(Exception e) {
			System.out.println("F " + e);
			throw e;
		} finally {
			System.out.println("G");
		}
	}
	
	static void test5() {
		// throw new Exception(); // trzeba by deklarować
		
		// throw new RuntimeException(); // nie trzeba deklarować
		
		try {
			throw new RuntimeException();
			// throw new Exception();  // gdytby było to, to trzeba dekalrować throws Exception
		} catch (Exception e) {
			System.out.println("wyłapałem " + e + " i rzucam dalej");
			throw e;
			// mimo że zmienna e jest typu Exception, nie muszę deklarować tego wyrzucenia w metodzie,
			// bo kompilator widzi, że e to może być najwyżej RuntimeException
		}
	}
	

	public static void main(String[] args) {
		test4();
	}
}
