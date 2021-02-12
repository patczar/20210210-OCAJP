package p21_metody_klasy_object.finalizacja;

public class Usuwanie3_gc {

	public static void main(String[] args) {
		System.out.println("Tworzymy dużo obiektów");
		for(int i = 0; i < 100; i++) {
			Konto k = new Konto(i, 1000+i, null);
			
			// od tego miejsca już z tego Konta nie korzystam
		}
		
		System.out.println("Gotowe...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("Wywołuję System.gc()");
		System.gc();
		System.out.println("wywołałem");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("Koniec programu");

	}

}
