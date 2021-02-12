package p21_metody_klasy_object.finalizacja;

public class Usuwanie2_OutOfMemory {

	public static void main(String[] args) {
		System.out.println("Tworzymy dużo obiektów");
		Osoba osoba = new Osoba("Ala", "Kowalska", "1993-04-05");
		for(int i = 0; i < 100; i++) {
			Konto k = new Konto(i, 1000+i, null);
			
			// od tego miejsca już z tego Konta nie korzystam
		}
		osoba = null;
		
		System.out.println("Gotowe...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("Alokuję dużą tablicę");
		try {
			long[] t = new long[1000000000]; // 8G pamięci
			System.out.println("mam tablicę");
		} catch (OutOfMemoryError e) {
			System.out.println("brak pamięci");
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("Koniec programu");

	}

}
