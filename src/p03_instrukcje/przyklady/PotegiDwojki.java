package p03_instrukcje.przyklady;

// Program wypisuje potęgi liczby, aż do ustalonego limitu.
public class PotegiDwojki {

	public static void main(String[] args) {
//		for(int x = 1; x < 1000000000; x *= 2) {
//			System.out.println(x);
//		}

		for(long x = 1; x < 4000_000_000_000_000_000L; x *= 2) {
			System.out.println(x);
		}

	}

}
