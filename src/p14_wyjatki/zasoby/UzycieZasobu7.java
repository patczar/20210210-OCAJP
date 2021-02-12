package p14_wyjatki.zasoby;

public class UzycieZasobu7 {

	public static void main(String[] args) {
		System.out.println("początek maina");
		
		try(Zasob z = new Zasob(true)) {
			System.out.println("po try");
			z.przerwij();
			// przerwij wyrzuci wyjątek
			// a close także wyrzuci wyjątek wyjątek

			System.out.println("koniec try");
		} catch(RuntimeException e) {
			// wyjątekiem bezpośrednio wyłapanym jest ten z treści
			// ale do niego dołączony jest wyjątek z close() (suppressed)
			System.out.println("catch, e = " + e);
			Throwable[] suppressed = e.getSuppressed();
			System.out.println("Wyjątki suppressed:");
			for (Throwable th : suppressed) {
				System.out.println(" * " + th);
			}
			
		} finally {
			System.out.println("finally");
		}

		System.out.println("koniec main");
	}

}
