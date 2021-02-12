package p14_wyjatki.zasoby;

public class UzycieZasobu6 {

	public static void main(String[] args) {
		System.out.println("początek maina");
		
		try(Zasob z = new Zasob()) {
			z.wyjatekWClose = true;
			System.out.println("po try");
			z.dzialaj();
			System.out.println("koniec try");
			// w close nastąpi wyjątek
		} catch(RuntimeException e) {
			// wyłapany wyjątek z close
			System.out.println("catch, e = " + e);
			
		} finally {
			System.out.println("finally");
		}

		System.out.println("koniec main");
	}

}
