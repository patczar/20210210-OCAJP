package p05_liczby;

public class PrzeciazanieIntLong {

	public static void main(String[] args) {
		try {
			System.out.println("oblicza w wersji int:");
			System.out.println(Math.multiplyExact(5, 1000_000_000));
		} catch (Exception e) {
			System.out.println("wersja int: wyjątek " + e);
		}
		System.out.println();
		
		try {
			System.out.println("oblicza w wersji long:");
			System.out.println(Math.multiplyExact(5L, 1000_000_000L));
		} catch (Exception e) {
			System.out.println("wersja long: wyjątek " + e);
		}
	}

}
