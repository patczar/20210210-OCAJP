package p14_wyjatki.zasoby;

public class UzycieZasobu5 {

	public static void main(String[] args) {
		System.out.println("początek maina");
		
		try(Zasob z = new Zasob(true)) {
			System.out.println("po try");
			z.dzialaj();
			System.out.println("koniec try");
			// w close nastąpi wyjątek
			
		} finally {
			System.out.println("finally");
		}

		System.out.println("koniec main");
	}

}
