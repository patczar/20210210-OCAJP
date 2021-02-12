package p14_wyjatki.zasoby;

public class UzycieZasobu2 {

	public static void main(String[] args) {
		System.out.println("początek maina");
		
		try(Zasob z = new Zasob()) {
			System.out.println("po try");
			z.przerwij();
			System.out.println("koniec try");
		} finally {
			System.out.println("finally");
		}

		System.out.println("koniec main");
	}

}
