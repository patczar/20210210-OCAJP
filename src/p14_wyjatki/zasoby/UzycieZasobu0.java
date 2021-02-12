package p14_wyjatki.zasoby;

public class UzycieZasobu0 {

	public static void main(String[] args) {
		System.out.println("początek maina");
		
		try(Zasob z = new Zasob()) {
			System.out.println("po try");
			z.dzialaj();
			System.out.println("koniec try");
		}

		System.out.println("koniec main");
	}

}
