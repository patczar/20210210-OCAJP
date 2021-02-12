package p06_funkcje.przyklady;

public class TestyGeometrii {
	// Będąc w jednej klasie, można wywoływać metody zdefiniowane w innej klasie,
	// zgodnie z ograniczeniami widoczności (private/public)
	// Jeśli metoda nie jest prywatna, to można jej używać w tym samym pakiecie,
	// a jeśli jest publiczna, to można używać wszędzie.
	
	public static void main(String[] args) {
		System.out.println("Pole kwadratu 5 = " + Geometria.poleKwadratu(5.0));
		System.out.println("Pole kwadratu 6.5 = " + Geometria.poleKwadratu(6.5));
		System.out.println("Pole koła 5 = " + Geometria.poleKola(5.0));
		System.out.println("Pole prostokąta 3×5 = " + Geometria.poleProstokata(3.0, 5.0));
		
		System.out.println("100 mil = " + JednostkiMiary.mileNaKm(100) + " km");
		System.out.println("100 km = " + JednostkiMiary.kmNaMile(100) + " mil");
	}

}
