package p14_wyjatki;

import java.io.IOException;

public class DzialanieWyjatkow {
	
	static int metoda(String arg) throws IOException {
		System.out.println("Początek metody, arg = " + arg);
		
		try {
			int dlugosc = arg.length();
			System.out.println("length() = " + dlugosc);
			
			int wynik = 10 / dlugosc;
			
			System.out.println("Znak numer 2 to " + arg.charAt(2));
			
			switch(arg) {
			case "NULL" :
				NullPointerException wyjatek = new NullPointerException("Moje NPE");
				throw wyjatek;
				
			case "ERROR" :
				long[] t = new long[2000_000_000];
				//throw new OutOfMemoryError("Na niby");
				break;
				
			case "IOEXC" :
				throw new IOException("Na niby");		

			case "RETURN" :
				System.out.println("Przerywam metodę return");
				return 8;		
			case "EXIT" :
				System.out.println("Przerywam program EXIT");
				System.exit(0);
			}
			
			System.out.println("Koniec metody, zwracam " + wynik);		
			return wynik;
		} finally {
			System.out.println("FINALLY w metodzie");
		}
	}
	

	public static void main(String[] args) throws IOException {
		System.out.println("Początek main");
		
		try {
			int x = -1;
			x = metoda("ala");
			//x = metoda(null);
			//x = metoda("");
			//x = metoda("As");
			//x = metoda("NULL");
			//x = metoda("ERROR");
			//x = metoda("RETURN");	
			//x = metoda("EXIT");
			
			System.out.println("Metoda się wykonała, wynik to " + x);
			
			if(x > 2) {
				System.out.println("Przerywam maina");
				return;
			}
			System.out.println("Przed catchami");
			
		} catch (NullPointerException e) {
			System.out.println("Wyłapałem wyjątek NPE " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Wyłapałem inny wyjątek " + e.getClass().getSimpleName() + " " + e.getMessage());

//		} catch (Error e) {
//			System.out.println("Wyłapałem ERROR " + e.getClass().getSimpleName() + " " + e.getMessage());
//		} catch (Throwable e) {
//			System.out.println("Wyłapałem coś " + e.getClass().getSimpleName() + " " + e.getMessage());
		} finally {
			System.out.println("FINALLY w main");
		}
		
		System.out.println("Koniec main");
	}
}
